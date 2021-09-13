package br.com.saae.repository

import br.com.saae.model.Liquidacao
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface LiquidacaoRepository: JpaRepository<Liquidacao, Long> {
}