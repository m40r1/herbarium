package org.site.herbarium.domain.vo;

import org.site.herbarium.domain.Planta;

import java.util.Collection;

public class JardimVo {
    private String Nome;
    private String Anotacoes;
    //or a list,Stream,Vector
    //idk yet
    private Collection<Planta> plantas;
    private Boolean existemPragas;
    private Terra terra;
    private Clima clima;
    //Uma forma de manter a estacao certa
    //possivel automatizar de acordo com a data
    private Estacao estacao;

    public void setExistemPragas(Boolean existemPragas) {
        this.existemPragas = existemPragas;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    public String getNome() {
        return Nome;
    }

    public String getAnotacoes() {
        return Anotacoes;
    }

    public Collection<Planta> getPlantas() {
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

    public JardimVo(String nome, String anotacoes, Collection<Planta> plantas, Boolean existemPragas, Terra terra, Clima clima, Estacao estacao) {
        Nome = nome;
        Anotacoes = anotacoes;
        this.plantas = plantas;
        this.existemPragas = existemPragas;
        this.terra = terra;
        this.clima = clima;
        this.estacao = estacao;
    }

    public JardimVo(String anotacoes, Collection<Planta> plantas, Boolean existemPragas) {
        Anotacoes = anotacoes;
        this.plantas = plantas;
        this.existemPragas = existemPragas;
    }

    public JardimVo(String nome, Terra terra, Clima clima, Estacao estacao) {
        Nome = nome;
        this.terra = terra;
        this.clima = clima;
        this.estacao = estacao;
    }
}
