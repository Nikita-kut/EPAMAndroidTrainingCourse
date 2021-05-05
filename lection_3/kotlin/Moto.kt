class Moto(
    override val color: Color,
    override val transportName: String,
    override val wheelCount: Int,
    override val maxPassengerCount: Int
) : Transport() {
    override fun displayTransportInfo() {
        println(
            """
            Moto: $transportName
            Color: $color
            Wheel count: $wheelCount
            Max passenger count: $maxPassengerCount
            
        """.trimIndent()
        )
    }
}