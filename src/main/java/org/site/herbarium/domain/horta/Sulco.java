package org.site.herbarium.domain.horta;

import java.util.Optional;

import jakarta.validation.constraints.NotNull;

public class Sulco {

    public int getTotal() {
        return total;
    }

    private int total;

    public int getVerticais() {
        return verticais;
    }

    private int verticais;

    public int getHorizontais() {
        return horizontais;
    }

    private int horizontais;

    @NotNull
    private int distancia;

    public Optional<Integer> Semear(final Semente semente) {
        if (total < 0) {
            return Optional.of(--total);
        } else {
            return Optional.empty();
        }
    }

    public int Sulcar(final int largura, final int altura) {
        verticais = distancia / altura;
        horizontais = distancia / largura;
        total = verticais * horizontais;
        return total;
    }
}
