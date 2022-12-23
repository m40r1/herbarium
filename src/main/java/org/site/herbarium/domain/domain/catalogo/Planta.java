package org.site.herbarium.domain.catalogo;

import org.site.herbarium.domain.generico.Bioma;
import org.site.herbarium.domain.generico.Estacao;

record PlantaVo(String NomePopular, String NomeCientifico, String EfeitosMedicinais, String ContraIndicacoes,
        Bioma bioma, Estacao estacao) {
}

public class Planta {
}
