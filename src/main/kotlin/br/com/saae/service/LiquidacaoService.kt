package br.com.saae.service

import br.com.saae.controller.dto.LiquidacaoRequest
import br.com.saae.controller.dto.LiquidacaoResponse
import jakarta.inject.Singleton

@Singleton
interface LiquidacaoService{

    fun saveLiquidacao(liquidacaoRequest: LiquidacaoRequest):LiquidacaoResponse
    fun findAllLiquidacoes():List<LiquidacaoResponse>

}