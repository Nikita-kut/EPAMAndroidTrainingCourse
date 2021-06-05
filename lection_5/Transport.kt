
sealed class Transport {

    abstract val model: String
    abstract val maxSpeed: Int
    abstract val wheelCount: Int

    data class Car(
        override val model: String,
        override val maxSpeed: Int,
        override val wheelCount: Int,
        val doorCount: Int
    ) : Transport()

    data class Bike(
        override val model: String,
        override val maxSpeed: Int,
        override val wheelCount: Int,
        val isSportBike: Boolean
    ) : Transport()
}

data class TransportUIModel(val model: String)