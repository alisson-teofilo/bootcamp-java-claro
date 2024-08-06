package desafio_1.iphone;


public class SmartPhone implements  ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{

    // ReprodutorMusical
    @Override
    public void tocar(){
        System.out.println("Tocando musica");
    }

    @Override
    public void pausou(){
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(){
        System.out.println("Música selecionada");
    }

    //Navegador de Internet
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo Pagina");
    }

    @Override
    public void adicionarNovaAba(){

        System.out.println("Nova aba");
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando Pagina");
    }

    // Aparelho de internet
    @Override
    public void ligar(){
        System.out.println("Aparelho Ligado!");
    }

    @Override
    public void atender(){
        System.out.println("Atender ligação");
    }

    @Override
    public void iniciarCorrioVoz(){
        System.out.println("Iniciando correio de voz");
    }
}
