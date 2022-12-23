package org.site.herbarium.domain.horta;

import java.util.Optional;

// Vaso serve para uma planta de grande porte
// Things are wrong here
public final class Vaso {
    final Terra terra;
    final Semente semente;

    private Vaso(Semente semente, Terra terra) {
        this.semente = semente;
        this.terra = terra;
    }

    public static Optional<Vaso> ofVaso(final Vaso vaso, final Terra terra) {
        if (terra.altura() < 15 & terra.comprimento() < 5 & terra.largura() < 5) {
            System.out.println("vaso deve ter pelo menos 15 de altura por 5 de comprimento e largura");
            return Optional.of(vaso);
        } else {
            return Optional.empty();
        }
    }
}
