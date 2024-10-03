// Crie uma função que receba um valor e uma porcentagem como parâmetros. A função deve retornar o valor acrescido da porcentagem indicada.

function minhaFuncao( valor, porcentagem ) {
    return (valor += valor * (porcentagem/100))
}

console.log(minhaFuncao(200, 10))