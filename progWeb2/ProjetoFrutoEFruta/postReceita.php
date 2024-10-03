<?php
        $servername = "localhost";
        $username = "root";
        $password = "root";
        $dbname = "frutoefruta";

        $nomereceita = $_POST['nomereceita'];
        $descricao = $_POST['descricao'];


        // Create connection
        $conn = mysqli_connect($servername, $username, $password, $dbname);
        // Check connection
        if (!$conn) {
        die("Connection failed: " . mysqli_connect_error());
        }

        $sql = "INSERT INTO receita (nomereceita, descricao)
        VALUES ('" . $nomereceita ."','" . $descricao . "')";

        if (mysqli_query($conn, $sql)) {
        echo "New record created successfully";
        } else {
        echo "Error: " . $sql . "<br>" . mysqli_error($conn);
        }

        mysqli_close($conn);
    ?>  