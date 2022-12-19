package org.site.herbarium.domain.horta;

import java.util.Optional;

public final class Vaso extends Terra {
    public static Optional<Vaso> ofVaso(Vaso vaso) {
        if (vaso.altura < 15 & vaso.comprimento < 5 & vaso.largura < 5) {
            System.out.println("vaso deve ter pelo menos 15 de altura por 5 de comprimento e largura");
            return Optional.of(vaso);
        } else {
            return Optional.empty();
        }
    }
}
