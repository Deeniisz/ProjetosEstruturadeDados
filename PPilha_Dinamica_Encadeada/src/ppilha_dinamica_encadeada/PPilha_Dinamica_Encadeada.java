package ppilha_dinamica_encadeada;

import java.util.Scanner;

public class PPilha_Dinamica_Encadeada {
    public static void main(String[] args) {
        Pilha_Jogos mpj = new Pilha_Jogos();
        Scanner sc = new Scanner(System.in);
        int opc;
        do
        {
            System.out.println("PILHA DINAMICA:\n");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Imprimir");
            System.out.println("0 - Sair");
            System.out.println("Informe sua opção:");
            opc = sc.nextInt(); 
            switch(opc)
            {
                case 1: mpj.push(ler_jogo());
                        break;
                case 2: mpj.pop();
                        break;
                case 3: mpj.print();
                        break;
                case 0: System.out.println(">>> FIM <<<");
                        break;
                default:System.out.println("opcao invalida!");
            }
        }while (opc !=0);
    }
    
    public static Jogo ler_jogo()
    {
        int id;
        String nome, genero;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nInforme os dados do NOVO JOGO:");
        System.out.println("ID:");
        id = sc.nextInt();
        System.out.println("NOME:");
        nome = sc.next();
        System.out.println("GENERO:");
        genero = sc.next();
        return (new Jogo(id, nome, genero));
    }
}
