package org.site.herbarium.domain.jardim;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Optional;

public class Diario {
    // REVIEW is this legal?
    // i think this is not good
    private final HashMap<LocalDateTime, String> anotacao = new HashMap<>();

    public Optional<HashMap<LocalDateTime, String>> todasAnotacoes() {
        return Optional.of(anotacao);
    }

    public void anotar(final String anotacao) {
        this.anotacao.put(LocalDateTime.now(), anotacao);
    }

    public Optional<String> lerHorario(final LocalDateTime dia) {
        if (this.anotacao.containsKey(dia)) {
            return Optional.of(anotacao.get(dia));
        } else {
            return Optional.empty();
        }
    }

}
