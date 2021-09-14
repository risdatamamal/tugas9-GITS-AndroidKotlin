class Car() {
    companion object desc
    {

    }

    inner class Mazda()
    {
        fun desc()
        {
            val _nameCar = "Mazda"
            println("Mobil 1")
            println("Nama: " + _nameCar)
        }
    }

    inner class Lamborgini()
    {
        fun desc()
        {
            val _nameCar = "Lamborgini"
            println("\nMobil 2")
            println("Nama: " + _nameCar)
        }
    }

    inner class BMW()
    {
        fun desc()
        {
            val _nameCar = "BMW"
            println("\nMobil 3")
            println("Nama: " + _nameCar)
        }
    }
}