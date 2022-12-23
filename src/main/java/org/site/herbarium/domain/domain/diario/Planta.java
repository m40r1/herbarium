package org.site.herbarium.domain.diario;

import java.time.LocalDateTime;
import java.util.Optional;

public final class Planta implements Pagina {
    @Override
    public Optional<Folha> Reescrever(final Diario diario, final String titulo, final String texto) {
        if (diario.acharTitulo(titulo).isPresent()) {
            final var folha = diario.acharTitulo(titulo).get();
            String.join(folha.texto(), texto);
            return Optional.of(folha);
        } else {
            return Optional.empty();
        }

    }

    @Override
    public Folha Escrever(final String titulo, final String texto) {
        final Folha folha = new Folha(titulo, LocalDateTime.now(), texto);
        return folha;
    }
}
