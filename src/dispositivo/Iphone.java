package dispositivo;

import aparelho.AparelhoTelefonico;
import navegador.NavegadorInternet;
import reprodutor.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    private boolean tocandoMusica = false;
    private String musicaAtual = "Nenhuma";
    private boolean emChamada = false;
    private String urlAtual = "about:blank";

    @Override
    public void tocar() {
        tocandoMusica = true;
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        tocandoMusica = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void parar() {
        tocandoMusica = false;
        musicaAtual = "Nenhuma";
        System.out.println("Música parada.");
    }

    @Override
    public void avancarFaixa() {
        System.out.println("Avançando para a próxima faixa.");
    }

    @Override
    public void fazerChamada(String numero) {
        emChamada = true;
        System.out.println("Fazendo chamada para " + numero);
    }

    @Override
    public void atender() {
        emChamada = true;
        System.out.println("Chamada atendida.");
    }

    @Override
    public void desligar() {
        emChamada = false;
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void abrirURL(String url) {
        urlAtual = url;
        System.out.println("Abrindo URL: " + url);
    }

    @Override
    public void voltar() {
        System.out.println("Voltando na navegação.");
    }

    @Override
    public void avancar() {
        System.out.println("Avançando na navegação.");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando página: " + urlAtual);
    }
}
