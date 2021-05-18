
fun main() {
    val defaultCar = Transport.Car(model = "BMW", maxSpeed = 180, wheelCount = 4, doorCount = 4)
    val defaultBike =
        Transport.Bike(model = "Yamaha", maxSpeed = 200, wheelCount = 2, isSportBike = false)

    val carGarage = Garage(defaultCar)
    val bikeGarage = Garage(defaultBike)

    val carList = carGarage.getTransportList()

    val carUIModel = carList.filter { it.maxSpeed >= 100 }.map {
        it.getTransportUIModel()
    }
}