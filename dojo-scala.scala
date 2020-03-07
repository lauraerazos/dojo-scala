object dojoScala{
    /*def main(args: Array[String]): Unit ={
        val numeros = List(4, 8, 15, 16, 23, 42);

        val dobles = numeros.map { x => x*2 }
        println(dobles)
    }*/
    def main(args: Array[String]): Unit ={
        println(factorial(4))
    }

    def factorial(numero: Int) : Int = {
        if(numero == 0) 1 else numero*factorial(numero-1)
    }
   
}

/*class Persona(primerNombre: String, segundoNombre: Option[String], apellido: String){
    def nombreCompleto = {
        segundoNombre match {
            case Some(i) => println(primerNombre+" "+i+" "+apellido)
            case None => println(primerNombre+" "+apellido)
        }
    }

    val persona = new Persona("Pepito", Some("Arnulfo"), "Pérez")
    persona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

    val otraPersona = new Persona("Juan", None, "Gutiérrez")
    otraPersona.nombreCompleto //Retorna "Pepito Arnulfo Pérez"

}*/