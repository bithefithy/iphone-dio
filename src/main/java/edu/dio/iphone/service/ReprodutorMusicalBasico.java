package edu.dio.iphone.service;

import edu.dio.iphone.repository.ReprodutorMusical;

// Implementação concreta da interface ReprodutorMusical
public class ReprodutorMusicalBasico implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}
