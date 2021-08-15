package com.jcs.loteriascaixaapi.service;

import com.jcs.loteriascaixaapi.model.Premiacao;
import com.jcs.loteriascaixaapi.model.Quina;
import com.jcs.loteriascaixaapi.utils.LocalSorteio;
import com.jcs.loteriascaixaapi.utils.URLBase;
import com.jcs.loteriascaixaapi.utils.WinningCities;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuinaService {

    private static final String URL = URLBase.URL_QUINA;

    public Quina quinaResults() {
        Quina quina = new Quina();

        try {

            Document doc = Jsoup.connect(URL).maxBodySize(0).get();
            Elements trs = doc.select("tr[bgcolor]");
            Element content = trs.get(trs.size() - 1);

            List<Premiacao> premiacaos = new ArrayList<>();
            Premiacao premiacaoQuina = new Premiacao();
            Premiacao premiacaoQuadra = new Premiacao();
            Premiacao premiacaoTerno = new Premiacao();
            Premiacao premiacaoDuque = new Premiacao();

            List<Integer> dezenas = new ArrayList<>();
            List<String> cidades = new ArrayList<>();

            int index = 0;
            for (Element element : content.select("td[rowspan]")) {
                if (index == 0)
                    quina.setConcurso(Integer.parseInt(element.text()));
                if (index == 1)
                    quina.setDataDoConcurso(element.text());
                if (index > 1 & index < 7)
                    dezenas.add(Integer.parseInt(element.text()));
                if (index == 7)
                    quina.setValorArrecadacaoTotal(element.text());
                if (index == 8)
                    quina.setNumeroDeGanhadoresQuina(Integer.parseInt(element.text()));
                if (index == 10)
                    quina.setPremioQuina(element.text());
                if (index == 11)
                    quina.setNumeroDeGanhadoresQuadra(Integer.parseInt(element.text()));
                if (index == 12)
                    quina.setPremioQuadra(element.text());
                if (index == 13)
                    quina.setNumeroDeGanhadoresTerno(Integer.parseInt(element.text()));
                if (index == 14)
                    quina.setPremioTerno(element.text());
                if (index == 15)
                    quina.setNumeroDeGanhadoresDuque(Integer.parseInt(element.text()));
                if (index == 16)
                    quina.setPremioDuque(element.text());
                if (index == 17)
                    quina.setAcumulou(element.text().equals("SIM"));
                if (index == 18)
                    quina.setValorAcumulado(element.text());
                if (index == 19)
                    quina.setValorEstimado(element.text());
                if (index == 20)
                    quina.setValorAcumuladoEspecial(element.text());

                index++;
            }

//            List<String> cidadeTemp = new ArrayList<>();
//            for (Element cidade : content.select("table").select("td")) {
//                cidadeTemp.add(cidade.text());
//            }
//            StringBuilder stringBuilder = null;
//            // Laço de repetição para pegar e manipular elementos da lista de cidades temporária.
//            // Se o índice for par o stringBuilder recebe o nome da cidade
//            // se for ímpar recebe o valor dele mesmo, que no caso é o nome de uma cidade,
//            // e insere um traço e a UF da cidade.
//            // A cidade sempre fica em um índice par
//            // A UF sempre fica em um índice ímpar.
//            for (int i = 0; i < cidadeTemp.size(); i++) {
//                if (i % 2 == 0) // se o índice do elemento for par
//                    stringBuilder = new StringBuilder(cidadeTemp.get(i)); // stringBuilder recebe o nome da cidade
//                if (i % 2 == 1) { // se o índice for ímpar
//                    stringBuilder = new StringBuilder(stringBuilder.insert(stringBuilder.toString().length(),
//                            " - " + cidadeTemp.get(i)));
//                    cidades.add(stringBuilder.toString());
//                }
//            }

            WinningCities wc = new WinningCities(content);
            wc.addCitiesWithWinners(cidades, "table", "td");

            premiacaoQuina.setNome("Quina");
            premiacaoQuina.setPremio(quina.getPremioQuina());
            premiacaoQuina.setQuantidadeGanhadores(quina.getNumeroDeGanhadoresQuina());

            premiacaoQuadra.setNome("Quadra");
            premiacaoQuadra.setPremio(quina.getPremioQuadra());
            premiacaoQuadra.setQuantidadeGanhadores(quina.getNumeroDeGanhadoresQuadra());

            premiacaoTerno.setNome("Terno");
            premiacaoTerno.setPremio(quina.getPremioTerno());
            premiacaoTerno.setQuantidadeGanhadores(quina.getNumeroDeGanhadoresTerno());

            premiacaoDuque.setNome("Duque");
            premiacaoDuque.setPremio(quina.getPremioDuque());
            premiacaoDuque.setQuantidadeGanhadores(quina.getNumeroDeGanhadoresDuque());

            premiacaos.add(premiacaoQuina);
            premiacaos.add(premiacaoQuadra);
            premiacaos.add(premiacaoTerno);
            premiacaos.add(premiacaoDuque);

            quina.setDezenasSorteadas(dezenas);
            quina.setCidades(cidades);
            quina.setPremiacoes(premiacaos);
            quina.setLocalDoSorteio(LocalSorteio.localDoSorteio());
        } catch (IOException ignored) {

        }

        return quina;
    }
}
