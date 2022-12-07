package org.site.herbarium.domain.jardim;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Optional;

public class Diario {
    private HashMap<LocalDateTime, String> anotacao;

    public HashMap<LocalDateTime, String> todasAnotacoes() {
        return anotacao;
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
