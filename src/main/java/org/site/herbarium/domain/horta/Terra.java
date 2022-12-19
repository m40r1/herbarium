package org.site.herbarium.domain.horta;

import org.site.herbarium.domain.generico.Solo;

sealed abstract class Terra permits Sementeira,Vaso {
    public int largura;
    public int comprimento;
    public int altura;
    private Solo solo;
}
