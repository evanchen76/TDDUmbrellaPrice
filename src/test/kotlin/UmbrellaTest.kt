import io.mockk.every
import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class UmbrellaTest {

    @Test
    fun totalPrice(){
        val umbrella = Umbrella()
        val actual = umbrella.totalPrice(3, 100)
        val expected = 300
        Assert.assertEquals(expected,actual)
    }
}