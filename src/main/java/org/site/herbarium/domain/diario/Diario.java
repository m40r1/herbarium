package org.site.herbarium.domain.diario;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.mongodb.core.mapping.Document;

//Use a colletion of interfaces with records
// idk it this will work
// the records are Documents in mongo

@Document
public final class Diario {
    // Diario e uma colecao de paginas
    private Collection<Folha> paginas;

    public Optional<Folha> acharTitulo(String titulo) {
        return paginas.stream().filter(folha -> folha.titulo() == titulo).findFirst();
    }

}
