package org.site.herbarium.domain.jardim;

import org.site.herbarium.domain.generico.Estacao;
import org.site.herbarium.generico.Bioma;

public class PlantaVo {
    // TODO planta para o contexto do jardim

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

    // TODO anotacoes sobre a planta
    private Diario anotacoes;

    // Tempo medio para germinar
    private final Bioma bioma;

    // TODO usar estacao para mostrar caso seja a estacao da planta
    // conferindo contra a estacao definida pela data
    private final Estacao estacao;

    public PlantaVo(final String nomePopular, final String nomeBinomial, final String efeitosMedicinais,
            final String indicacoes, final String contraIndicacoes, final Bioma bioma, final Estacao estacao) {
        NomePopular = nomePopular;
        NomeBinomial = nomeBinomial;
        EfeitosMedicinais = efeitosMedicinais;
        Indicacoes = indicacoes;
        ContraIndicacoes = contraIndicacoes;
        this.bioma = bioma;
        this.estacao = estacao;
    }
}
