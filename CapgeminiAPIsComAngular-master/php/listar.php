<?php 

//Incluir a conexão
include("conexao.php");

//Preparando o comando Sql
$sql = "SELECT * FROM cursos";

//Executar comando
$executar = mysqli_query($conexao, $sql);

//Vetor para armazenar os cursos que serão listados
$cursos = [];

//Indice para percorrer o vetor
$indice = 0;

//Laço de repetição
while($linha = mysqli_fetch_assoc($executar)){
    $cursos[$indice]['idCurso'] = $linha['idCurso'];
    $cursos[$indice]['nomeCurso'] = $linha['nomeCurso'];
    $cursos[$indice]['valorCurso'] = $linha['valorCurso'];

    $indice++;
}

//JSON
json_encode(['cursos'=>$cursos]);

?>