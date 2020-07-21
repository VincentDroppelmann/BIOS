package bios.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BiosBackend

fun main(args: Array<String>) {
    runApplication<BiosBackend>(*args)
}
