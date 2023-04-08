package ru.misha.study.building.company.model.repository.implimentation

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import ru.misha.study.building.company.model.impl.Document
import ru.misha.study.building.company.repository.implimentation.DocumentRepository
import java.io.File

class DocumentRepositoryTest {
    private val documentRepository: DocumentRepository = DocumentRepository(mutableSetOf())

    private val document = Document (
            name = "Dogovor",
            file = File("application.properties"),
    )
    @Test
    @Order(0)
    fun `Happy pass - save a new document`() {
        documentRepository.save(
                document
        )
        Assertions.assertThat(documentRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(2)
    fun findOne() {
        documentRepository.save(
                document
        )
        Assertions.assertThat(documentRepository.findOne(document.id)).isEqualTo(document)
    }

    @Test
    @Order(3)
    fun findAll() {
        documentRepository.save(
                document
        )
        Assertions.assertThat(documentRepository.findAll()).size().isEqualTo(1)
    }

    @Test
    @Order(5)
    fun delete() {
        documentRepository.save(
                document
        )
        org.junit.jupiter.api.Assertions.assertTrue(documentRepository.delete(document))
        Assertions.assertThat(documentRepository.findAll()).size().isEqualTo(0)
    }
}