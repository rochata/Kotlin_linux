// el try catch ayuda cuando el usuario no ingresa un string e ingresa un numero, e inversa

import java.lang.NumberFormatException

fun main(){
    try {
        println("Escribe el primer numero")
        val n1 = readln().toDouble()
        println("Escribe el segundo numero")
        val n2 = readln().toDouble()
        val res = n1 + n2
        println("El resultado es $res")
    }catch (e: NumberFormatException){
    println("Error: Escribe un numero valido")
    }
}

//se escribe el try al inicio y seguido a su llave se escribe el catch para decir el mensaje

// se cambio el ".toInt()" por un ".toDouble" para que se pueda usar enteros y decimales