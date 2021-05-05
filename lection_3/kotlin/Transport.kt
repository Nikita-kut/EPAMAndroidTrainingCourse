abstract class Transport {
    abstract val color: Color
    abstract val transportName: String
    abstract val wheelCount: Int
    abstract val maxPassengerCount: Int
    abstract fun displayTransportInfo()
}