package com.example.AccentureChallenge.domain;

import java.util.Arrays;
import java.util.List;

public class Texto {

    public static String converterNumerosParaTexto(String textoASerConvertido){
        List<String> palavras = Arrays.asList(textoASerConvertido.split("  "));

        StringBuilder textoCompletoConvertido = new StringBuilder();

        for (String palavra: palavras) {

            List<String> letras = Arrays.asList(palavra.split(" "));

            StringBuilder palavraConvertida = new StringBuilder();

            for (String letra: letras) {
                palavraConvertida.append(buscarNumeroDigitado(letra.charAt(0)).get(letra.length() - 1));
            }

            palavraConvertida.append(" ");

            textoCompletoConvertido.append(palavraConvertida);

        }

        return textoCompletoConvertido.toString();
    }

    public static List<String> buscarNumeroDigitado(char letra) {
        switch (letra) {
            case '2':
                return Arrays.asList("a","b","c");
            case '3':
                return Arrays.asList("d","e","f");
            case '4':
                return Arrays.asList("g","h","i");
            case '5':
                return Arrays.asList("j","k","l");
            case '6':
                return Arrays.asList("m","n","o");
            case '7':
                return Arrays.asList("p","q","r","s");
            case '8':
                return Arrays.asList("t","u","v");
            case '9':
                return Arrays.asList("w","x","y","z");
        }
        return Arrays.asList("Número Inválido");
    }

}
