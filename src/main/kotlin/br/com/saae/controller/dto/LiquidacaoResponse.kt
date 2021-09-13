package br.com.saae.controller.dto

import java.time.LocalDate

class LiquidacaoResponse (
    val document:String,
    val empenho:String,
    val initialDate:LocalDate,
    val finalDate:LocalDate,
    val supplier:String,
)