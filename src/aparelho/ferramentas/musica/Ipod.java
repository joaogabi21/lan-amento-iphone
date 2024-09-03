package aparelho.ferramentas.musica;

public class Ipod implements ReprodutorMusical {
    public void tocar () {
        System.out.println("Tocando a musica...");
    }

    public void pausar () {
        System.out.println("Pausando a musica...");
    }

    public void selecionarMusica () {
        System.out.println("Selecionando a musica...");
    }
}
