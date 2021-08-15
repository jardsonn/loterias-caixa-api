package com.jcs.loteriascaixaapi.utils;

import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;

public class WinningCities {

    private final Element content;

    public WinningCities(Element content) {
        this.content = content;
    }

    public void addCitiesWithWinners(List<String> toList, String cssQuery, String query) {
        List<String> tempCity = new ArrayList<>();

        for (Element city : content.select(cssQuery).select(query)) {
            tempCity.add(city.text());
        }

        StringBuilder stringBuilder = null;
        // Laço de repetição para pegar e manipular elementos da lista de cidades temporária.
        // Se o índice for par o stringBuilder recebe o nome da cidade
        // se for ímpar recebe o valor dele mesmo, que no caso é o nome de uma cidade,
        // e insere um traço e a UF da cidade.
        // A cidade sempre fica em um índice par
        // A UF sempre fica em um índice ímpar.
        for (int i = 0; i < tempCity.size(); i++) {
            if (i % 2 == 0) stringBuilder = new StringBuilder(tempCity.get(i));
            else {
                stringBuilder = new StringBuilder(stringBuilder.insert(stringBuilder.length(), " - ") + tempCity.get(i));
                toList.add(stringBuilder.toString());
            }
        }
    }
}
