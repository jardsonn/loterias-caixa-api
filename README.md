# Loterias Caixa API
API REST Loterias CAIXA retorna os resultados da **Mega-Sena**, **Lotofacil**, **Lotomania** e **Quina**.
No momento, essa API só retorna o resultados desses quatros jogos, porém pretendo aprimora-lo no futuro.

## Exemplos de como é retornado
* [Mega-Sena](https://leterias-caixa.herokuapp.com/api/v0/megasena)
~~~
{
  "concurso": 2400,
  "dataDoConcurso": "14/08/2021",
  "valorArrecadacaoTotal": "44.648.055,00",
  "localDoSorteio": "ESPAÇO LOTERIAS CAIXA EM SÃO PAULO, SP",
  "acumulou": true,
  "dezenasSorteadas": [
    9,
    21,
    25,
    26,
    36,
    53
  ],
  "cidades": [],
  "premiacoes": [
    {
      "nome": "Sena",
      "quantidadeGanhadores": 0,
      "premio": "0,00"
    },
    {
      "nome": "Quina",
      "quantidadeGanhadores": 52,
      "premio": "49.503,96"
    },
    {
      "nome": "Quadra",
      "quantidadeGanhadores": 3623,
      "premio": "1.015,02"
    }
  ],
  "valorEstimadoPremioProximoConcurso": "34.000.000,00",
  "valorAcumuladoEspecial": "50.603.381,35",
  "observacao": "",
  "numeroDeGanhadoresSena": 0,
  "numeroDeGanhadoresQuina": 52,
  "numeroDeGanhadoresQuadra": 3623,
  "premioSena": "0,00",
  "premioQuina": "49.503,96",
  "premioQuadra": "1.015,02"
}
~~~

* [Lotofacil](https://leterias-caixa.herokuapp.com/api/v0/lotofacil)
~~~
{
  "concurso": 2308,
  "dataDoConcurso": "14/08/2021",
  "valorArrecadacaoTotal": "20.868.475,00",
  "localDoSorteio": "ESPAÇO LOTERIAS CAIXA EM SÃO PAULO, SP",
  "quantGanhadores15Dezenas": 1,
  "quantGanhadores14Dezenas": 265,
  "quantGanhadores13Dezenas": 8835,
  "quantGanhadores12Dezenas": 117444,
  "quantGanhadores11Dezenas": 690695,
  "premio15Pontos": "3.340.869,43",
  "premio14Pontos": "1.441,47",
  "premio13Pontos": "25,00",
  "premio12Pontos": "10,00",
  "premio11Pontos": "5,00",
  "valorAcumulado15Numeros": "0,00",
  "valorEstimadoPremioProximoConcurso": "1.500.000,00",
  "valorAcumuladoEspecial": "98.434.778,24",
  "acumulou": false,
  "dezenasSorteadas": [
    1,
    2,
    3,
    4,
    6,
    10,
    15,
    17,
    18,
    19,
    20,
    22,
    23,
    24,
    25
  ],
  "cidades": [
    "CANAL ELETRONICO - --"
  ],
  "premiacoes": [
    {
      "nome": "15 PONTOS",
      "quantidadeGanhadores": 1,
      "premio": "3.340.869,43"
    },
    {
      "nome": "14 PONTOS",
      "quantidadeGanhadores": 265,
      "premio": "1.441,47"
    },
    {
      "nome": "13 PONTOS",
      "quantidadeGanhadores": 8835,
      "premio": "25,00"
    },
    {
      "nome": "12 PONTOS",
      "quantidadeGanhadores": 117444,
      "premio": "10,00"
    },
    {
      "nome": "11 PONTOS",
      "quantidadeGanhadores": 690695,
      "premio": "5,00"
    }
  ]
}
~~~

* [Lotomania](https://leterias-caixa.herokuapp.com/api/v0/lotomania)
~~~
{
  "concurso": 2204,
  "dataDoConcurso": "13/08/2021",
  "dezenasSorteadas": [
    1,
    4,
    13,
    27,
    35,
    36,
    38,
    46,
    54,
    55,
    56,
    59,
    60,
    63,
    69,
    74,
    78,
    81,
    82,
    99
  ],
  "valorArrecadacaoTotal": "5.684.392,50",
  "premiacoes": [
    {
      "nome": "20 Acertos",
      "quantidadeGanhadores": 0,
      "premio": null
    },
    {
      "nome": "19 Acertos",
      "quantidadeGanhadores": 5,
      "premio": "102.760,70"
    },
    {
      "nome": "18 Acertos",
      "quantidadeGanhadores": 74,
      "premio": "2.330,98"
    },
    {
      "nome": "17 Acertos",
      "quantidadeGanhadores": 578,
      "premio": "298,43"
    },
    {
      "nome": "16 Acertos",
      "quantidadeGanhadores": 4016,
      "premio": "42,95"
    },
    {
      "nome": "15 Acertos",
      "quantidadeGanhadores": 17823,
      "premio": "9,67"
    }
  ],
  "cidades": [
    "VITORIA - ES"
  ],
  "valorAcumuladoProximoConcurso": "2.357.862,60",
  "valorEstimativaProximoConcurso": "2.206.778,54",
  "localDoSorteio": "ESPAÇO LOTERIAS CAIXA EM SÃO PAULO, SP",
  "premio20Numeros": null,
  "premio19Numeros": "102.760,70",
  "premio18Numeros": "2.330,98",
  "premio17Numeros": "298,43",
  "premio16Numeros": "42,95",
  "premio15Numeros": "9,67",
  "premio0Numeros": null,
  "numeroDeGanhadores20": "0",
  "numeroDeGanhadores19": "5",
  "numeroDeGanhadores18": "74",
  "numeroDeGanhadores17": "578",
  "numeroDeGanhadores16": "4016",
  "numeroDeGanhadores15": "17823",
  "numeroDeGanhadores0": "0,00"
}
~~~

* [Quina](https://leterias-caixa.herokuapp.com/api/v0/quina)
~~~
{
  "concurso": 5632,
  "dataDoConcurso": "14/08/2021",
  "valorArrecadacaoTotal": "18.543.882,00",
  "localDoSorteio": "ESPAÇO LOTERIAS CAIXA EM SÃO PAULO, SP",
  "acumulou": false,
  "dezenasSorteadas": [
    4,
    16,
    32,
    41,
    69
  ],
  "cidades": [
    "CANAL ELETRONICO - --"
  ],
  "premiacoes": [
    {
      "nome": "Quina",
      "quantidadeGanhadores": 1,
      "premio": "18.669.331,02"
    },
    {
      "nome": "Quadra",
      "quantidadeGanhadores": 133,
      "premio": "8.038,78"
    },
    {
      "nome": "Terno",
      "quantidadeGanhadores": 10186,
      "premio": "157,83"
    },
    {
      "nome": "Duque",
      "quantidadeGanhadores": 247333,
      "premio": "3,57"
    }
  ],
  "valorEstimadoPremioProximoConcurso": "0,00",
  "valorAcumuladoEspecial": "18.380.951,62",
  "valorAcumulado": "0,00",
  "numeroDeGanhadoresQuina": 1,
  "numeroDeGanhadoresQuadra": 133,
  "numeroDeGanhadoresTerno": 10186,
  "numeroDeGanhadoresDuque": 247333,
  "premioQuina": "18.669.331,02",
  "premioQuadra": "8.038,78",
  "premioTerno": "157,83",
  "premioDuque": "3,57"
}
~~~

## Documentação
A documentação foi feita com o **Swagger**, então para mais informações acesse:
https://leterias-caixa.herokuapp.com/swagger-ui.html#/loterias-controller
