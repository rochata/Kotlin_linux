fun main(){
    var sadboy : String? = null
    sadboy = "hola"
    println(sadboy)


    sadboy?.let {
        println("tiene valor")
    }
}

// si no tiene dato la primer variable, despues la puedo cambiar
// el "?" le indica que es null
// el .let es adicional. no tiene sentido por ahora
