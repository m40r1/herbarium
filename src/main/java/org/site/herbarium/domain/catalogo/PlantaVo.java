package org.site.herbarium.domain.catalogo;

import org.site.herbarium.domain.generico.Estacao;
import org.site.herbarium.domain.generico.Bioma;

public class PlantaVo {

    private final String NomePopular;
    /*
     * TODO are there macros in java? if there are i can hava a macro to update a
     * struct of biominal names with all the cataloged biominal names so that i can
     * use it as a type and its a "easy" way to make ir adaptative
     */
    private final String NomeBinomial;
    private final String EfeitosMedicinais;
    private final String Indicacoes;
    private final String ContraIndicacoes;
    // Tempo medio para germinar
    private Long germinar;
    private Bioma bioma;
    private Estacao estacao;

    public PlantaVo(final String nomePopular, final String nomeBinomial, final String efeitosMedicinais,
            final String indicacoes, final String contraIndicacoes) {
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
