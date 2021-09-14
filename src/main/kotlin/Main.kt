fun main() {
    val mazda1 = Car().Mazda()
    val lambo1 = Car().Lamborgini()
    val bmw1 = Car().BMW()

    val mazda2 = Car()
    val lambo2 = Car()
    val bmw2 = Car()

    println("Inner Class")
    mazda1.desc()
    lambo1.desc()
    bmw1.desc()

    println("\nOuter Class")
    mazda2.Mazda().desc()
    lambo2.Lamborgini().desc()
    bmw2.BMW().desc()
}