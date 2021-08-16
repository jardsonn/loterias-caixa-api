package com.jcs.loteriascaixaapi.controller;

import com.jcs.loteriascaixaapi.model.Lotofacil;
import com.jcs.loteriascaixaapi.model.Lotomania;
import com.jcs.loteriascaixaapi.model.MegaSena;
import com.jcs.loteriascaixaapi.model.Quina;
import com.jcs.loteriascaixaapi.service.LotofacilService;
import com.jcs.loteriascaixaapi.service.LotomaniaService;
import com.jcs.loteriascaixaapi.service.MegaSenaService;
import com.jcs.loteriascaixaapi.service.QuinaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v0")
public class LoteriasController {

    @Autowired
    private MegaSenaService megaSenaService;

    @Autowired
    private LotofacilService lotofacilService;

    @Autowired
    private LotomaniaService lotomaniaService;

    @Autowired
    private QuinaService quinaService;

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna os resultados da Mega-Sena"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping("megasena")
    public MegaSena megaSenaResults() {
        return megaSenaService.megaSenaResults();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna os resultados da Lotofacil"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping("lotofacil")
    public Lotofacil lotofacilResults() {
        return lotofacilService.lotofacilResults();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna os resultados da Lotomania"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping("lotomania")
    public Lotomania lotomaniaResults() {
        return lotomaniaService.lotomaniaResults();
    }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Retorna os resultados da Quina"),
            @ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
            @ApiResponse(code = 500, message = "Foi gerada uma exceção"),
    })
    @GetMapping("quina")
    public Quina quinaResults() {
        return quinaService.quinaResults();
    }

}
