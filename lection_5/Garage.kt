
class Garage<T : Transport>(private val transport: T) {

    private var cars: MutableList<Car> = mutableListOf()

    private var bikes: MutableList<Bike> = mutableListOf()

    fun addTransport(newTransport: T) {
        when (newTransport) {
            is Car -> cars.add(newTransport)
            is Bike -> bikes.add(newTransport)
        }
    }

    fun removeLastTransport() {
        when (transport) {
            is Car -> {
                if (cars.isNotEmpty()) cars =
                    (cars - cars.last()).toMutableList() else println("cars list empty")
            }
            is Bike -> {
                if (bikes.isNotEmpty()) bikes = (bikes - bikes.last()).toMutableList() else println(
                    "bikes list empty"
                )
            }
        }
    }

    fun getTransportList(): List<Transport> {
        return when (transport) {
            is Car -> cars.toList()
            is Bike -> bikes.toList()
            else -> listOf()
        }
    }

}