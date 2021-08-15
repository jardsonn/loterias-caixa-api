package com.jcs.loteriascaixaapi.service;

import com.jcs.loteriascaixaapi.model.MegaSena;
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
public class MegaSenaService {
    private static final String URL = URLBase.URL_MEGA_SENA;

    public MegaSena megaSenaResults() {
        MegaSena megaSena = new MegaSena();

        try {
            Document doc = Jsoup.connect(URL).maxBodySize(0).get();
            Elements trs = doc.select("tr");
            Element content = trs.get(trs.size() - 1);

            List<Premiacao> premiacaos = new ArrayList<>();
            Premiacao sena = new Premiacao();
            Premiacao quina = new Premiacao();
            Premiacao quadra = new Premiacao();

            List<Integer> dezenas = new ArrayList<>();
            List<String> cidades = new ArrayList<>();
            int index = 0;
            for (Element element : content.select("td[align]")) {
                if (index == 0)
                    megaSena.setConcurso(Integer.parseInt(element.text()));
                if (index == 2)
                    megaSena.setDataDoConcurso(element.text());
                if (index > 2 & index < 9)
                    dezenas.add(Integer.parseInt(element.text()));
                if (index == 9)
                    megaSena.setNumeroDeGanhadoresSena(Integer.parseInt(element.text()));
                if (index == 10)
                    megaSena.setNumeroDeGanhadoresQuina(Integer.parseInt(element.text()));
                if (index == 11)
                    megaSena.setNumeroDeGanhadoresQuadra(Integer.parseInt(element.text()));
                if (index == 12)
                    megaSena.setPremioSena(element.text());
                if (index == 13)
                    megaSena.setPremioQuina(element.text());
                if (index == 14)
                    megaSena.setPremioQuadra(element.text());
                if (index == 16)
                    megaSena.setValorArrecadacaoTotal(element.text());
                if (index == 17)
                    megaSena.setValorEstimadoPremioProximoConcurso(element.text());
                if (index == 18)
                    megaSena.setValorAcumuladoEspecial(element.text());
                if (index == 19)
                    megaSena.setAcumulou(element.text().equals("SIM"));
                if (index == 21)
                    megaSena.setObservacao(element.text());

                index++;
            }

            WinningCities wc = new WinningCities(content);
            wc.addCitiesWithWinners(cidades, "table", "td");

            sena.setNome("Sena");
            sena.setPremio(megaSena.getPremioSena());
            sena.setQuantidadeGanhadores(megaSena.getNumeroDeGanhadoresSena());

            quina.setNome("Quina");
            quina.setPremio(megaSena.getPremioQuina());
            quina.setQuantidadeGanhadores(megaSena.getNumeroDeGanhadoresQuina());

            quadra.setNome("Quadra");
            quadra.setPremio(megaSena.getPremioQuadra());
            quadra.setQuantidadeGanhadores(megaSena.getNumeroDeGanhadoresQuadra());

            premiacaos.add(sena);
            premiacaos.add(quina);
            premiacaos.add(quadra);
            megaSena.setDezenasSorteadas(dezenas);
            megaSena.setCidades(cidades);
            megaSena.setPremiacoes(premiacaos);
            megaSena.setLocalDoSorteio(LocalSorteio.localDoSorteio());

        } catch (IOException ignored) {
        }

        return megaSena;
    }
}
