package edu.dio.iphone;

import edu.dio.iphone.controller.iPhone;

public class App {
    public static void main(String[] args) {
        // Criar uma instância do iPhone
        iPhone meuIphone = new iPhone();

        // Testar funcionalidades do reprodutor musical
        meuIphone.tocar();
        meuIphone.selecionarMusica("Raça negra");
        meuIphone.pausar();

        // Testar funcionalidades do telefone
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testar funcionalidades do navegador web
        meuIphone.exibirPagina("https://www.youtube.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
