package com.example.AccentureChallenge.controller;

import com.example.AccentureChallenge.controller.DTO.TextoDTO;
import com.example.AccentureChallenge.service.TextoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/texto")
public class TextoController {

    @Autowired
    TextoService textoService;

    @GetMapping
    public String converterNumerosParaTexto(@RequestBody TextoDTO textoDTO) {
        String textoConvertido = textoService.converterNumerosParaTexto(textoDTO.getTexto());

        return textoConvertido;
    }
}
