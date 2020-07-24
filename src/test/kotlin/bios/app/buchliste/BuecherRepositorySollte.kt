package bios.app.buchliste

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldContainAll
import org.amshove.kluent.shouldHaveSingleItem
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BuecherRepositorySollte {
    @Autowired
    lateinit var buchRepository: BuchRepository

    @AfterEach
    fun nachJedem() {
        buchRepository.deleteAll()
    }

    @Test
    fun `kein Buch anhand des Titels finden, falls es keine Buecher gibt`() {
        buchRepository.findeBuecher("JSF").shouldBeEmpty()
    }

    @Test
    fun `ein Buch anhand des Titels finden`() {
        val buecher = listOf(
                Buch(titel = "JSF-Dokumentation von 1997"),
                Buch(titel = "JSF-Dokumentation von 1998 (neuste Auflage)"))
        buchRepository.saveAll(buecher)
        buchRepository.findeBuecher("JSF").shouldContainAll(buecher)
    }

    @Test
    fun `kein Buch anhand des Titels finden, auch wenn andere Buecher vorhanden sind`() {
        buchRepository.save(Buch(titel = "Ducktales"))
        buchRepository.findeBuecher("Dagobert").shouldBeEmpty()
    }

    @Test
    fun `ein Buch anhand des Teils eines Titels finden`() {
        val titel = "Ducktales, Dagobert und Donald gehen ab"
        buchRepository.save(Buch(titel = titel))
        buchRepository
                .findeBuecher("Dagobert")
                .shouldHaveSingleItem()
                .titel
                .shouldBe(titel)
    }
}