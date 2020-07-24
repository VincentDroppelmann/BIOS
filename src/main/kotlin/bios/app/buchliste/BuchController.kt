package bios.app.buchliste

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class BuchController(@Autowired val repository: BuchRepository) {
    @GetMapping("/api/buecher")
    fun index(@RequestParam titel: String?): List<Buch> {
        if (titel != null) {
            return repository.findeBuecher(titel)
        }
        return repository.findAll().toList()
    }

    @PostMapping("/api/buecher")
    fun neu(@RequestBody buch: Buch) {
        repository.save(buch)
    }
}