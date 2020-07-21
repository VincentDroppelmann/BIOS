package bios.app

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WetterController {

    @GetMapping("/api/wetter")
    fun wetter() : List<Wetter> {
        return listOf(Wetter(false), Wetter(false))
    }

}

data class Wetter(val schoen: Boolean)