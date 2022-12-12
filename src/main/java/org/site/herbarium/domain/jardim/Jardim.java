package org.site.herbarium.domain.jardim;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Jardim {
    // TODO criar jardim

    // TODO plantar(planta || Vec<planta>)

    // TODO mudar terra

    // TODO publicar jardim && privar jardim

    // TODO anotarDiario && ler diario
    // o diario contido no jardim
    // posso passar um jardim.getDiario
    // REVIEW acho que to fazendo alguma coisa errada aqui
    // anemic domain model?
    public void anotarDiario(Diario diario, String anotacao) {
        diario.anotar(anotacao);
    }

    public HashMap<LocalDateTime, String> lerDiario(Diario diario) {

        return diario.todasAnotacoes().get();
    }

}
