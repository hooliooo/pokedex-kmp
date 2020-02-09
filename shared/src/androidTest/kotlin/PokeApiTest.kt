import com.julio.alorro.pokedex.api.PokeAPI
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Test
import kotlin.test.assertEquals

class PokeApiTest {

    val api = PokeAPI()

    @Test
    fun test() = runBlocking {
       val pokemon = api.getPokemon(1)
        delay(5_000)
        assertEquals("bulbasaur", pokemon.name, "Pokemon should be named bulbasaur")
    }
}