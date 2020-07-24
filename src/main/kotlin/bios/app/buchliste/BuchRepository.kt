package bios.app.buchliste

import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface BuchRepository : CrudRepository<Buch, Int> {
    @Query("select b from Buch b where b.titel like %:titel%")
    fun findeBuecher(@Param("titel") titel: String) : List<Buch>
}