package br.com.saae.service

import br.com.saae.controller.dto.LiquidacaoRequest
import br.com.saae.controller.dto.LiquidacaoResponse
import br.com.saae.repository.LiquidacaoRepository
import br.com.saae.utils.Mapper
import jakarta.inject.Singleton

@Singleton
class LiquidacaoServiceImpl(
    private val repository: LiquidacaoRepository
):LiquidacaoService {

    override fun saveLiquidacao(liquidacaoRequest: LiquidacaoRequest)=
       Mapper.liquidacaoToLiquidacaoResponse(
           repository.save(Mapper.liquidacaoRequestToLiquidacao(liquidacaoRequest)))

    override fun findAllLiquidacoes()=
        Mapper.listLiquidacaoToListLiquidacaoResponse(repository.findAll())

}