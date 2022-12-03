package org.site.herbarium.domain.vo;

public class PlantaVo {

    private String NomePopular;
    /*TODO are there macros in java?
    * if there are i can hava a macro
    * to update a struct of biominal names
    * with all the cataloged biominal names so that i can use it as a type
    * and its a "easy" way to make ir adaptative
    * */
    private String NomeBinomial;
    private String EfeitosMedicinais;
    private String Indicacoes;
    private String ContraIndicacoes;
    //Tempo medio para germinar
    private Long germinar;
    private  Bioma bioma;
    private Estacao estacao;

    public PlantaVo(String nomePopular, String nomeBinomial, String efeitosMedicinais, String indicacoes, String contraIndicacoes) {
        NomePopular = nomePopular;
        NomeBinomial = nomeBinomial;
        EfeitosMedicinais = efeitosMedicinais;
        Indicacoes = indicacoes;
        ContraIndicacoes = contraIndicacoes;
    }

    public String getNomePopular() {
        return NomePopular;
    }

    public String getNomeBinomial() {
        return NomeBinomial;
    }

    public String getEfeitosMedicinais() {
        return EfeitosMedicinais;
    }

    public String getIndicacoes() {
        return Indicacoes;
    }

    public String getContraIndicacoes() {
        return ContraIndicacoes;
    }
}
