// Desenvolva uma função que verifique se uma palavra é um palíndromo (lê-se da mesma forma da esquerda para a direita e vice-versa). 
//Retorne true se for um palíndromo e false se não for.

function minhaFuncao(param) {
    let arr = param.split("")
    let str = arr.reverse()
    let inverso = str.join("")

    return param.toUpperCase() == inverso.toUpperCase()
}