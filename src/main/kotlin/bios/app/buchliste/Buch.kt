package bios.app.buchliste

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Buch(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Long? = null,
        val titel: String
)

