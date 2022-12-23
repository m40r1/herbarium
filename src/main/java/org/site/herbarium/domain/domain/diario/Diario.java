package org.site.herbarium.domain.diario;

import java.util.Optional;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public final class Diario {
    // Diario de uma colecao de paginas
    private Set<Folha> paginas;

    public Optional<Folha> acharTitulo(final String titulo) {
        return paginas.stream().filter(folha -> folha.titulo() == titulo).findFirst();
    }

}
