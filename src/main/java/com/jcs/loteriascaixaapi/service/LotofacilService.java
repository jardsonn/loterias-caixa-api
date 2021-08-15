package com.jcs.loteriascaixaapi.service;

import com.jcs.loteriascaixaapi.model.Lotofacil;
import com.jcs.loteriascaixaapi.model.Premiacao;
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
public class LotofacilService {

    private static final String URL = URLBase.URL_LOTOFACIL;

    public Lotofacil lotofacilResults() {

        Lotofacil lotofacil = new Lotofacil();

        try {
            Document doc = Jsoup.connect(URL).maxBodySize(0).get();
            Elements trs = doc.select("tr[bgcolor]");
            Element content = trs.get(trs.size() - 1);
            Elements contentWithoutTable = content.select("td[rowspan]");

            List<Premiacao> premiacoes = new ArrayList<>();
            Premiacao premiacaoFaixa15 = new Premiacao();
            Premiacao premiacaoFaixa14 = new Premiacao();
            Premiacao premiacaoFaixa13 = new Premiacao();
            Premiacao premiacaoFaixa12 = new Premiacao();
            Premiacao premiacaoFaixa11 = new Premiacao();

            List<Integer> dezenas = new ArrayList<>();
            List<String> cidades = new ArrayList<>();
            int index = 0;
            for (Element element : contentWithoutTable) {

                if (index == 0) // concurso
                    lotofacil.setConcurso(Integer.parseInt(element.text()));
                if (index == 1) // data
                    lotofacil.setDataDoConcurso(element.text());
                if (index > 1 && index < 17) // dezenas
                    dezenas.add(Integer.parseInt(element.text()));
                if (index == 17) // arrecadação total
                    lotofacil.setValorArrecadacaoTotal(element.text());

                if (index == 18) { // número de ganhadores de 15 dezenas
                    int ganhadores = Integer.parseInt(element.text());
                    lotofacil.setQuantGanhadores15Dezenas(ganhadores);
                    lotofacil.hasAcumulou(ganhadores == 0);
                }
                if (index == 19) // número de ganhadores de 14 dezenas
                    lotofacil.setQuantGanhadores14Dezenas(Integer.parseInt(element.text()));
                if (index == 20) // número de ganhadores de 13 dezenas
                    lotofacil.setQuantGanhadores13Dezenas(Integer.parseInt(element.text()));
                if (index == 21) // número de ganhadores de 12 dezenas
                    lotofacil.setQuantGanhadores12Dezenas(Integer.parseInt(element.text()));
                if (index == 22) // número de ganhadores de 11 dezenas
                    lotofacil.setQuantGanhadores11Dezenas(Integer.parseInt(element.text()));
                if (index == 23) // valor do rateio de 15 dezenas
                    lotofacil.setPremio15Pontos(element.text());
                if (index == 24) // valor do rateio de 14 dezenas
                    lotofacil.setPremio14Pontos(element.text());
                if (index == 25) // valor do rateio de 13 dezenas
                    lotofacil.setPremio13Pontos(element.text());
                if (index == 26) // valor do rateio de 12 dezenas
                    lotofacil.setPremio12Pontos(element.text());
                if (index == 27) // valor do rateio de 11 dezenas
                    lotofacil.setPremio11Pontos(element.text());
                if (index == 28) // valor acumulado de 15 dezenas
                    lotofacil.setValorAcumulado15Numeros(element.text());
                if (index == 29) // valor estimado
                    lotofacil.setValorEstimadoPremioProximoConcurso(element.text());
                if (index == 30) // valor acumulado especial
                    lotofacil.setValorAcumuladoEspecial(element.text());

                index++;
            }

//            for (Element element : content.getElementsByTag("TBODY").get(0).getElementsByTag("TR")) {
//                cidades.add(element.getElementsByTag("TD").text());
//            }

            WinningCities wc = new WinningCities(content);
            wc.addCitiesWithWinners(cidades, "table", "td");

            premiacaoFaixa15.setNome("15 PONTOS");
            premiacaoFaixa15.setPremio(lotofacil.getPremio15Pontos());
            premiacaoFaixa15.setQuantidadeGanhadores(lotofacil.getQuantGanhadores15Dezenas());

            premiacaoFaixa14.setNome("14 PONTOS");
            premiacaoFaixa14.setPremio(lotofacil.getPremio14Pontos());
            premiacaoFaixa14.setQuantidadeGanhadores(lotofacil.getQuantGanhadores14Dezenas());

            premiacaoFaixa13.setNome("13 PONTOS");
            premiacaoFaixa13.setPremio(lotofacil.getPremio13Pontos());
            premiacaoFaixa13.setQuantidadeGanhadores(lotofacil.getQuantGanhadores13Dezenas());

            premiacaoFaixa12.setNome("12 PONTOS");
            premiacaoFaixa12.setPremio(lotofacil.getPremio12Pontos());
            premiacaoFaixa12.setQuantidadeGanhadores(lotofacil.getQuantGanhadores12Dezenas());

            premiacaoFaixa11.setNome("11 PONTOS");
            premiacaoFaixa11.setPremio(lotofacil.getPremio11Pontos());
            premiacaoFaixa11.setQuantidadeGanhadores(lotofacil.getQuantGanhadores11Dezenas());

            premiacoes.add(premiacaoFaixa15);
            premiacoes.add(premiacaoFaixa14);
            premiacoes.add(premiacaoFaixa13);
            premiacoes.add(premiacaoFaixa12);
            premiacoes.add(premiacaoFaixa11);

            lotofacil.setDezenasSorteadas(dezenas);
            lotofacil.setCidades(cidades);
            lotofacil.setPremiacoes(premiacoes);
            lotofacil.setLocalDoSorteio(LocalSorteio.localDoSorteio());

        } catch (IOException ignored) {

        }

        return lotofacil;
    }
}
