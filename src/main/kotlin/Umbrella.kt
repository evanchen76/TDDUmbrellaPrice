class Umbrella(val weather: IWeather) {
    fun totalPrice(quantity: Int, price: Int): Int {
        var unitPrice = price

        if (weather.isSunny()) {
            unitPrice = (price * 0.9).toInt()
        }
        return quantity * unitPrice
    }
}
