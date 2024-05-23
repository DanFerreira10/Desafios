import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) throws Exception {
        try(Scanner scanner = new Scanner(System.in)) {
            ReprodutorMusical musica = new ReprodutorMusical();
            AparelhoTelefonico celular = new AparelhoTelefonico();
            NavegadorInternet navegador = new NavegadorInternet();

            System.out.println("----- SISTEMA IPHONE -----");
            System.out.println("Escolha o que deseja fazer: ");
            System.out.println("[1] Reproduzir música");
            System.out.println("[2] Aparelho telefônico");
            System.out.println("[3] Acessar Internet");
            int escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("----- SISTEMA IPHONE -----");
                System.out.println("Escolha o que deseja fazer: ");
                System.out.println("[1] Tocar música");
                System.out.println("[2] Pausar Música");
                System.out.println("[3] Selecionar Música");
                int escolhamusica = scanner.nextInt();
                if (escolhamusica==1) {
                    musica.tocar();
                }
                else if (escolhamusica==2) {
                    musica.pausar();
                }
                else {
                    musica.selecionarMusica(null);
                }

            }
            else if (escolha==2) {
                System.out.println("----- SISTEMA IPHONE -----");
                System.out.println("Escolha o que deseja fazer: ");
                System.out.println("[1] Ligar para alguém");
                System.out.println("[2] Atender telefone");
                System.out.println("[3] Verificar correiro de voz");
                int escolhatelefone = scanner.nextInt();
                if (escolhatelefone==1) {
                    celular.ligar(null);
                }
                else if (escolhatelefone==2) {
                    celular.atender();
                }
                else {
                    celular.iniciarCorreioVoz();
                }
            }
            else {
                System.out.println("----- SISTEMA IPHONE -----");
                System.out.println("Escolha o que deseja fazer: ");
                System.out.println("[1] Exibir Página Web");
                System.out.println("[2] Adicionar nova aba");
                System.out.println("[3] Atualizar página Web");
                int escolhainternet = scanner.nextInt();
                if (escolhainternet==1) {
                    navegador.exibirPagina(null);
                }
                else if (escolhainternet==2) {
                    navegador.adicionarNovaAba();
                }
                else {
                    navegador.atualizarPagina();
                }
            }
        }
    }
}
