package br.com.saae.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Liquidacao (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long?,
    val document:String,
    val empenho:String,
    val initialDate:LocalDate,
    val finalDate:LocalDate,
    val supplier:String
)