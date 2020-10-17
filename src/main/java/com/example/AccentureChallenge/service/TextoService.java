package com.example.AccentureChallenge.service;

import com.example.AccentureChallenge.domain.Texto;
import org.springframework.stereotype.Service;

@Service
public class TextoService {

    public String converterNumerosParaTexto(String textoASerConvertido) {
        String textoConvertido = Texto.converterNumerosParaTexto(textoASerConvertido);

        return textoConvertido;
    }
}
