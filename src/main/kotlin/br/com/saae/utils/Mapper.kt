package br.com.saae.utils

import br.com.saae.controller.dto.LiquidacaoRequest
import br.com.saae.controller.dto.LiquidacaoResponse
import br.com.saae.model.Liquidacao

class Mapper {
    companion object{
        fun liquidacaoRequestToLiquidacao(liquidacaoRequest: LiquidacaoRequest)=
            Liquidacao(
                id = null,
                document = liquidacaoRequest.document,
                empenho = liquidacaoRequest.empenho,
                initialDate = liquidacaoRequest.initialDate,
                finalDate = liquidacaoRequest.finalDate,
                supplier = liquidacaoRequest.supplier
            )

        fun liquidacaoToLiquidacaoResponse(liquidacao: Liquidacao)=
            LiquidacaoResponse(
                document = liquidacao.document,
                empenho = liquidacao.empenho,
                initialDate = liquidacao.initialDate,
                finalDate = liquidacao.finalDate,
                supplier = liquidacao.supplier
            )

        fun listLiquidacaoToListLiquidacaoResponse(liquidacoes: List<Liquidacao>)=
            liquidacoes.map { item ->
                LiquidacaoResponse(
                    document = item.document,
                    empenho = item.empenho,
                    initialDate = item.initialDate,
                    finalDate = item.finalDate,
                    supplier = item.supplier
                ) }.toList()
    }

}