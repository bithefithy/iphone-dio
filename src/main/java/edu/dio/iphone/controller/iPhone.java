package edu.dio.iphone.controller;

import edu.dio.iphone.service.NavegadorWebBasico;
import edu.dio.iphone.service.ReprodutorMusicalBasico;
import edu.dio.iphone.service.TelefoneBasico;
import edu.dio.iphone.repository.NavegadorWeb;
import edu.dio.iphone.repository.ReprodutorMusical;
import edu.dio.iphone.repository.Telefone;

// Classe principal que usa as interfaces e suas implementações
public class iPhone implements ReprodutorMusical, Telefone, NavegadorWeb {
    private final ReprodutorMusical reprodutorMusical;
    private final Telefone telefone;
    private final NavegadorWeb navegadorWeb;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusicalBasico();
        this.telefone = new TelefoneBasico();
        this.navegadorWeb = new NavegadorWebBasico();
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos da interface Telefone
    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    // Métodos da interface NavegadorWeb
    @Override
    public void exibirPagina(String url) {
        navegadorWeb.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegadorWeb.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorWeb.atualizarPagina();
    }
}
