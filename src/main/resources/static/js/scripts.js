class ShowReturn {
    constructor(megaSena, lotofacil, lotomania, quina, resultMega, resultLotofacil, resultLotomania, resultQuina) {
        this.megaSena = document.querySelector(megaSena);
        this.lotofacil = document.querySelector(lotofacil);
        this.lotomania = document.querySelector(lotomania);
        this.quina = document.querySelector(quina);
        this.resultMega = document.querySelector(resultMega);
        this.resultLotofacil = document.querySelector(resultLotofacil);
        this.resultLotomania = document.querySelector(resultLotomania);
        this.resultQuina = document.querySelector(resultQuina);
        this.show = 'show';

        this.toggleClickMega = this.toggleClickMega.bind(this);
        this.toggleClickLotofacil = this.toggleClickLotofacil.bind(this);
        this.toggleClickLotomania = this.toggleClickLotomania.bind(this);
        this.toggleClickQuina = this.toggleClickQuina.bind(this);
    }

    toggleClickMega() {
        let isShow = this.resultMega.classList.toggle(this.show);
        if (isShow) this.megaSena.style.borderRadius = '10px 10px 0 0';
        else this.megaSena.style.borderRadius = '10px';
    }

    toggleClickLotofacil() {
        let isShow = this.resultLotofacil.classList.toggle(this.show);
        if (isShow) this.lotofacil.style.borderRadius = '10px 10px 0 0';
        else this.lotofacil.style.borderRadius = '10px';

    }

    toggleClickLotomania() {
        let isShow = this.resultLotomania.classList.toggle(this.show);
        if (isShow) this.lotomania.style.borderRadius = '10px 10px 0 0';
        else this.lotomania.style.borderRadius = '10px';

    }

    toggleClickQuina() {
        let isShow = this.resultQuina.classList.toggle(this.show);
        if (isShow) this.quina.style.borderRadius = '10px 10px 0 0';
        else this.quina.style.borderRadius = '10px';

    }


    addEventClick() {
        this.megaSena.addEventListener("click", this.toggleClickMega);
        this.lotofacil.addEventListener("click", this.toggleClickLotofacil);
        this.lotomania.addEventListener("click", this.toggleClickLotomania);
        this.quina.addEventListener("click", this.toggleClickQuina);
    }

    init() {
        this.addEventClick();
        return this;
    }

}

const showReturn = new ShowReturn(
    ".mega-sena",
    ".lotofacil",
    ".lotomania",
    ".quina",
    ".result-megasena",
    ".result-lotofacil",
    ".result-lotomania",
    ".result-quina",
);

showReturn.init();