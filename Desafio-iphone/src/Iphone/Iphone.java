package Iphone;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical smi = null;
        AparelhoTelefonico sim = null;
        NavegadorInternet mis = null;

        String appEscolhido = "Telefone";

        if(appEscolhido.equals("Musica")){
            smi = new ReprodutorMusical();
            smi.selecionarMusica();
            smi.tocar();
            smi.pausar();
            }
        else if(appEscolhido.equals("Telefone")){
            sim = new AparelhoTelefonico();
            String telefone = "Ligar";
                sim.ligar();
                sim.atender();
                sim.iniciarCorreioVoz();
            }
        else if(appEscolhido.equals("Navegador"))
            mis = new NavegadorInternet();
            mis.adicionarNovaAba();
            mis.atualizarpagina();

    }
}
