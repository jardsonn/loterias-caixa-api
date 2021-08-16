package com.jcs.loteriascaixaapi.controller;

import com.jcs.loteriascaixaapi.utils.ResultExamples;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping(value = "/")
    public String index(ModelMap model) {
        model.addAttribute("responseMegaSena", ResultExamples.RESULT_MEGASENA);
        model.addAttribute("responseLotofacil", ResultExamples.RESULT_LOTOFACIL);
        model.addAttribute("responseLotomania", ResultExamples.RESULT_LOTOMANIA);
        model.addAttribute("responseQuina", ResultExamples.RESULT_QUINA);
        return "index";
    }


}
