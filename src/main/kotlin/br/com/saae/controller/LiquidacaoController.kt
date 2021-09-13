package br.com.saae.controller

import br.com.saae.controller.dto.LiquidacaoRequest
import br.com.saae.model.Liquidacao
import br.com.saae.service.LiquidacaoServiceImpl
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.validation.Valid

@Validated
@Controller("/api/v1/liquidacoes")
class LiquidacaoController(
    private val repository: LiquidacaoServiceImpl
) {

    @Get
    fun listAllLiquidacoes() = repository.findAllLiquidacoes()

    @Post
    fun saveLiquidacoes(@Body @Valid liquidacaoRequest: LiquidacaoRequest)=
        repository.saveLiquidacao(liquidacaoRequest)

}