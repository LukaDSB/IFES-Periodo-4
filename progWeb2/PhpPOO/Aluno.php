<?php

class Aluno{
    private $nome;

    // function __construct($nome) {
    //     $this->nome = $nome;
    // }

    function getNome(){
        return $this->nome;
    }

    function setNome($nome){
        $this->nome = $nome;
    }

    function imprimirNome(){
        echo $this->nome;
    }

}

//$aluno = new Aluno('Lucas');

$aluno2 = new Aluno();
$aluno2->setNome('Lucas2');

$aluno2->imprimirNome();