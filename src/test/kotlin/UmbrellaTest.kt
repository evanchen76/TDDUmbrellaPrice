import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class UmbrellaTest {

    @Test
    fun totalPrice(){
        val weather = mockk<IWeather>()
        val umbrella = Umbrella(weather)
        every { weather.isSunny() } returns (false)
        val actual = umbrella.totalPrice( 3, 100)
        val expected = 300
        Assert.assertEquals(expected,actual)
    }

    @Test
    fun totalPrice_sunnyDay() {
        val weather = mockk<IWeather>()
        val umbrella = Umbrella(weather)
        every { weather.isSunny() } returns (true)

        val actual = umbrella.totalPrice(3, 100)
        val expected = 270
        Assert.assertEquals(expected, actual)
    }
}