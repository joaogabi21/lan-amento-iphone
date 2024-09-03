package aparelho.ferramentas.internet;

public class Safari implements NavegadorInternet {
    public void exibirPagina() {
        System.out.println("Exibindo pagina...");
    }    

    public void adicionarAba() {
        System.out.println("Adicionando outra aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }
}
