<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Gerenciar Tipo Usuário</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>

<script>
    function minhaFuncao(){
        return window.prompt('Confirm');
    }
</script>

<body>
    <h1>Gerenciar Tipo Usuário</h1>

    <form action="cadastrarTipoUsuario.php" method="post">
        <h2>Cadastrar Tipo Usuário</h2>
        <p>
            <input type="text" name="descricao" placeholder="Descrição Tipo Usuário">
        </p>
        <p>
            <input type="submit" value="Cadastrar">
        </p>
    </form>

    <h2>Tipos de Usuários Cadastrados</h2>

    <?php
    $servername = "localhost";
    $username = "root";
    $password = "root";
    $dbname = "loja";
    // Create connection
    $conn = new mysqli($servername, $username, $password, $dbname);
    // Check connection
    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $sql = "SELECT * FROM tipo_usuario;";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        // output data of each row
        echo "<table border=1>
            <tr>
                <th>CÓDIGO</th>
                <th>DESCRIÇÃO</th>
                <th>AÇÕES</th>
            </tr>";

        while ($row = $result->fetch_assoc()) { #foreach
            echo "<tr>
                    <td>". $row["idtipo_usuario"] ."</td>
                    <td>". $row["descricao"] ."</td>
                    <td>
                        <a onclick = 'minhaFuncao()' href='gerenciarTipoUsuario.php?id=". $row["idtipo_usuario"] . "'>
                        <img src='img/edit.svg' alt='Alterar'>
                         </a>
                        <a onclick='return confirm('Deseja realmente excluir?')' href='excluirTipoUsuario.php?id=". $row["idtipo_usuario"] ."'> <img src='img/delete.svg' alt='Excluir'></a>
                    </td>
                </tr>";
        }

        echo "</table>";
    } else {
        echo "Nenhum tipo usuário encontrado!";
    }
    $conn->close();
    ?>
   
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>



</body>
</html>