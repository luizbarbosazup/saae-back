package br.com.saae.controller.dto

import io.micronaut.core.annotation.Introspected
import java.time.LocalDate
import javax.validation.constraints.NotBlank

@Introspected
class LiquidacaoRequest (
    @field: NotBlank
    val document: String,
    @field: NotBlank
    val empenho: String,
    val initialDate: LocalDate,
    val finalDate: LocalDate,
    @field: NotBlank
    val supplier: String,

)