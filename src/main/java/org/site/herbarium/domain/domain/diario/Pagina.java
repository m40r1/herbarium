package org.site.herbarium.domain.diario;

import java.util.Optional;

//maybe this is shit
sealed public interface Pagina permits Planta {
    Folha Escrever(String titulo, String texto);

    // achar por titulo ou data sla
    Optional<Folha> Reescrever(Diario diario, String titulo, String texto);
}
