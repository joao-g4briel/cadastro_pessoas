import java.util.ArrayList;
import java.util.Scanner;

import Classes.Pessoa;

public class App {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Pessoa> cadastro = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
       
        int opcao;

            do {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastro");
                System.out.println("2 - Editar");
                System.out.println("3 - Listar");
                System.out.println("4 - Remover");
                System.out.println("0 - Sair");

                opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        cadastrarPessoa();
                        break;
                    case 2:
                        editarPessoa();
                        break;
                    case 3:
                        //listarPessoas();
                        break;
                    case 4:
                
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                        break;
                }
            } while (opcao != 0);


    }

    public static void cadastrarPessoa() {
        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite seu cpf: ");
        String cpf = sc.next();

        System.out.println("Digite seu email: ");
        String email = sc.next();

        Pessoa pessoa = new Pessoa(nome, cpf, email);

        cadastro.add(pessoa);

        System.out.println("Cadastrado com sucesso!");
        System.out.println(pessoa);

    }

    public static void editarPessoa() {
       for(Pessoa pessoa : cadastro) {
        System.out.println(pessoa);
       }
    }
}
