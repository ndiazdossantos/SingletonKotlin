class Persona(nombre:String,apellido:String,edad:Int) {
    var nombre:String = ""
    var apellido:String = ""
    var edad:Int = 0

    init {
        this.nombre=nombre
        this.apellido=apellido
        this.edad=edad
        cantidad++
    }
    override fun toString():String{

        return "Nombre: $nombre , Apellido: $apellido , Edad: $edad"
    }
    companion object Contador{
        var cantidad:Int=0
        override fun toString(): String {
            if (cantidad>=5)
                return "$cantidad personas. Exceso de poblacion. Inicializar exterminación inminente."
            else
                return "$cantidad personas"
        }
    }

}