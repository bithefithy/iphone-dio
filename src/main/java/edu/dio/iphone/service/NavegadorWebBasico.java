package edu.dio.iphone.service;

import edu.dio.iphone.repository.NavegadorWeb;

// Implementação concreta da interface NavegadorWeb
public class NavegadorWebBasico implements NavegadorWeb {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
