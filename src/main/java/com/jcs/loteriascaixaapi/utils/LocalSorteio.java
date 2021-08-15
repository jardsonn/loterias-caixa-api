package com.jcs.loteriascaixaapi.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.List;

public class LocalSorteio {
    private static final String URL = "http://loterias.caixa.gov.br/wps/portal/loterias/landing/megasena/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOLNDH0MPAzcDbwMPI0sDBxNXAOMwrzCjA0sjIEKIoEKnN0dPUzMfQwMDEwsjAw8XZw8XMwtfQ0MPM2I02-AAzgaENIfrh-FqsQ9wNnUwNHfxcnSwBgIDUyhCvA5EawAjxsKckMjDDI9FQE-F4ca/dl5/d5/L2dBISEvZ0FBIS9nQSEh/pw/Z7_HGK818G0K8DBC0QPVN93KQ10G1/res/id=historicoHTML/c=cacheLevelPage/=/";

    public static String localDoSorteio() {
        String local = null;
        try {
            Document doc = Jsoup.connect(URL).maxBodySize(0).get();
            Elements trs = doc.select("td[align]");
            Element content = trs.get(trs.size() - 21);
            local = content.text();

            if (content.text().equalsIgnoreCase("são paulo, sp"))
                local = String.format("ESPAÇO LOTERIAS CAIXA EM %s", content.text());
            else if (content.text().equalsIgnoreCase("brasília, df"))
                local = String.format("AUDITÓRIO DA CAIXA EM %s", content.text());
            else
                local = content.text();

        } catch (IOException ignored) {

        }

        return local;
    }

}
