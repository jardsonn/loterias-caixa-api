package com.jcs.loteriascaixaapi.service;

import com.jcs.loteriascaixaapi.model.Lotomania;
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
public class LotomaniaService {

    private static final String URL = URLBase.URL_LOTOMANIA;

    public Lotomania lotomaniaResults() {
        Lotomania lotomania = new Lotomania();

        try {
            Document doc = Jsoup.connect(URL).maxBodySize(0).get();
            Elements trs = doc.select("tr[bgcolor]");
            Element content = trs.get(trs.size() - 1);

            List<Premiacao> premiacaos = new ArrayList<>();
            Premiacao acertos20 = new Premiacao();
            Premiacao acertos19 = new Premiacao();
            Premiacao acertos18 = new Premiacao();
            Premiacao acertos17 = new Premiacao();
            Premiacao acertos16 = new Premiacao();
            Premiacao acertos15 = new Premiacao();
            Premiacao acertos0 = new Premiacao();

            List<Integer> dezenas = new ArrayList<>();
            List<String> cidades = new ArrayList<>();

            int index = 0;
            for (Element element : content.select("td[rowspan]")) {
                if (index == 0)
                    lotomania.setConcurso(Integer.parseInt(element.text()));
                if (index == 1)
                    lotomania.setDataDoConcurso(element.text());
                if (index >= 2 && index <= 21)
                    dezenas.add(Integer.parseInt(element.text()));
                if (index == 22)
                    lotomania.setValorArrecadacaoTotal(element.text());
                if (index == 23)
                    lotomania.setNumeroDeGanhadores20(element.text());
                if (index == 25)
                    lotomania.setNumeroDeGanhadores19(element.text());
                if (index == 26)
                    lotomania.setNumeroDeGanhadores18(element.text());
                if (index == 27)
                    lotomania.setNumeroDeGanhadores17(element.text());
                if (index == 28)
                    lotomania.setNumeroDeGanhadores16(element.text());
                if (index == 29)
                    lotomania.setNumeroDeGanhadores15(element.text());
                if (index == 30)
                    lotomania.setNumeroDeGanhadores0(element.text());
                if (index == 31)
                    lotomania.setPremio19Numeros(element.text());
                if (index == 32)
                    lotomania.setPremio18Numeros(element.text());
                if (index == 33)
                    lotomania.setPremio17Numeros(element.text());
                if (index == 34)
                    lotomania.setPremio16Numeros(element.text());
                if (index == 35)
                    lotomania.setPremio15Numeros(element.text());
                if (index == 36)
                    lotomania.setValorAcumuladoProximoConcurso(element.text());
                if (index == 37)
                    lotomania.setValorEstimativaProximoConcurso(element.text());
                if (index == 38)
                    lotomania.setValorEstimativaProximoConcurso(element.text());
                index++;
            }
            WinningCities wc = new WinningCities(content);
            wc.addCitiesWithWinners(cidades, "table", "td");

            acertos20.setNome("20 Acertos");
            acertos20.setPremio(lotomania.getPremio20Numeros());
            acertos20.setQuantidadeGanhadores(Integer.parseInt(lotomania.getNumeroDeGanhadores20()));

            acertos19.setNome("19 Acertos");
            acertos19.setPremio(lotomania.getPremio19Numeros());
            acertos19.setQuantidadeGanhadores(Integer.parseInt(lotomania.getNumeroDeGanhadores19()));

            acertos18.setNome("18 Acertos");
            acertos18.setPremio(lotomania.getPremio18Numeros());
            acertos18.setQuantidadeGanhadores(Integer.parseInt(lotomania.getNumeroDeGanhadores18()));

            acertos17.setNome("17 Acertos");
            acertos17.setPremio(lotomania.getPremio17Numeros());
            acertos17.setQuantidadeGanhadores(Integer.parseInt(lotomania.getNumeroDeGanhadores17()));

            acertos16.setNome("16 Acertos");
            acertos16.setPremio(lotomania.getPremio16Numeros());
            acertos16.setQuantidadeGanhadores(Integer.parseInt(lotomania.getNumeroDeGanhadores16()));

            acertos15.setNome("15 Acertos");
            acertos15.setPremio(lotomania.getPremio15Numeros());
            acertos15.setQuantidadeGanhadores(Integer.parseInt(lotomania.getNumeroDeGanhadores15()));

            premiacaos.add(acertos20);
            premiacaos.add(acertos19);
            premiacaos.add(acertos18);
            premiacaos.add(acertos17);
            premiacaos.add(acertos16);
            premiacaos.add(acertos15);

            lotomania.setDezenasSorteadas(dezenas);
            lotomania.setCidades(cidades);
            lotomania.setPremiacoes(premiacaos);
            lotomania.setLocalDoSorteio(LocalSorteio.localDoSorteio());

        } catch (IOException ignored) {

        }
        return lotomania;
    }
}
