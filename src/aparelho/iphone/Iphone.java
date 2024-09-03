package aparelho.iphone;

import aparelho.ferramentas.internet.NavegadorInternet;
import aparelho.ferramentas.musica.ReprodutorMusical;
import aparelho.ferramentas.telefone.AparelhoTelefonico;

public class Iphone implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {
    public void exibirPagina() {
        System.out.println("Exibindo pagina via Iphone...");
    }
    public void adicionarAba() {
        System.out.println("Adicionando outra aba pelo Iphone...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina pelo Iphone...");
    }
    public void tocar() {
        System.out.println("Tocando musica pelo Iphone...");
    }
    public void pausar() {
        System.out.println("Pausando musica pelo Iphone...");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando musica pelo Iphone...");
    }    
    public void ligar() {
        System.out.println("Ligando pelo Iphone...");
    }
    public void atender() {
        System.out.println("Atendendo ligacao pelo Iphone...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo Iphone...");
    } 
}
