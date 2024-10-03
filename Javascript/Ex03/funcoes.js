// Implemente uma função que calcule a média aritmética de um array de números e retorne o resultado. Utilize essa função para calcular a média de diferentes conjuntos de números.
   
function calculaMedia() {
    let x = 0;
    for (let index = 0; index < params.length; index++) {
        x += params[index]
    }
    return (x / params.length);
}

let ARR1 = [1,2,3,4,5]
let ARR2 = [10,20,30,40,50]
let ARR3 = [9,7,1,3,2,8]

console.log(calculaMedia(ARR2))