package bios.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WetterController {

    @GetMapping("/api/wetter")
    fun wetter() : List<Wetter> {
        return listOf(
                Wetter("Vechta", GradCelsius(17.5)),
                Wetter("Damme", GradCelsius(22.7))
        )
    }

}
inline class GradCelsius(val wert: Double)
data class Wetter(val stadt: String, val temperatur: GradCelsius)