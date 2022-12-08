//Should not make this a db representation
//maybe i will do it for now
package org.site.herbarium.domain.jardim;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;

import org.site.herbarium.domain.generico.Estacao;
import org.site.herbarium.generico.Clima;
import org.site.herbarium.generico.Terra;

public class JardimVo {

    private String Nome;

    // Anotacoes sao achadas por quando sao adicionadas
    private Diario diario;

    public Diario getDiario() {
        return diario;
    }

    // or a list,Stream,Vector
    // idk yet
    // REVIEW do i need to store the values here?
    // i think so
    // Vo uses Vo from same domain
    // to compose a complex data type?
    private Collection<PlantaVo> plantas;

    private Boolean existemPragas;

    private Terra terra;
    private Clima clima;
    // Uma forma de manter a estacao certa
    // possivel automatizar de acordo com a data
    private Estacao estacao;

    // NOTE a ton of getters & setters
    public void setExistemPragas(final Boolean existemPragas) {
        this.existemPragas = existemPragas;
    }

    public void setEstacao(final Estacao estacao) {
        this.estacao = estacao;
    }

    public String getNome() {
        return Nome;
    }

    public Collection<PlantaVo> getPlantas() {
        return plantas;
    }

    public Boolean getExistemPragas() {
        return existemPragas;
    }

    public Terra getTerra() {
        return terra;
    }

    public Clima getClima() {
        return clima;
    }

    public Estacao getEstacao() {
        return estacao;
    }

    public JardimVo(final String nome, final HashMap<LocalDateTime, String> anotacoes,
            final Collection<PlantaVo> plantas, final Boolean existemPragas, final Terra terra, final Clima clima,
            final Estacao estacao) {
        Nome = nome;
        this.plantas = plantas;
        this.existemPragas = existemPragas;
        this.terra = terra;
        this.clima = clima;
        this.estacao = estacao;
    }

    // REVIEW do i need this contructor
    public JardimVo(final HashMap<LocalDateTime, String> anotacoes, final Collection<PlantaVo> plantas,
            final Boolean existemPragas) {
        this.plantas = plantas;
        this.existemPragas = existemPragas;
    }

    public JardimVo(final String nome, final Terra terra, final Clima clima, final Estacao estacao) {
        Nome = nome;
        this.terra = terra;
        this.clima = clima;
        this.estacao = estacao;
    }

}
