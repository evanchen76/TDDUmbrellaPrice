class Umbrella(weather: IWeather) {
    fun totalPrice(quantity: Int, price: Int): Int {
        return quantity * price
    }

}
