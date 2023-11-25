fun main (){
    // escribir en consola
    println("Escribe el primer numero")
    val n1 = readln().toInt()
    println("Escribe el segundo numero")
    val n2 = readln().toInt()
    val res = n1 + n2
    println("El resultado es $res")
}
// el readln() "es para guardar un valor de consola"
// el readln() solo espera String pero con el ".toInt() lo podemos hacer para numeros