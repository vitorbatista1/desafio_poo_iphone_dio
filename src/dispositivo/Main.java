package dispositivo;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando o reprodutor musical
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando o aparelho telefônico
        meuIphone.fazerChamada("1234-5678");
        meuIphone.atender();
        meuIphone.desligar();

        // Testando o navegador
        meuIphone.abrirURL("https://www.apple.com");
        meuIphone.atualizar();
    }
}
