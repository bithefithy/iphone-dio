package edu.dio.iphone.service;

import edu.dio.iphone.repository.Telefone;

// Implementação concreta da interface Telefone
public class TelefoneBasico implements Telefone {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
