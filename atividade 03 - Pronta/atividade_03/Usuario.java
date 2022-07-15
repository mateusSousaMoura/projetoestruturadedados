package atividade_03;

import java.io.IOException;
import java.util.Scanner;
public class Usuario {
    public static void main(String[] args) throws IOException {

        ListaEncadeada minhaLista = new ListaEncadeada();

        String menu="Menu de opcoes:\n1. Inserir no início\n2. Inserir no final\n3.Alterar nome\n4. Excluir nome\n5. Mostrar lista\n6. sair";
        Scanner sc = new Scanner(System.in);
        String option;
        int opcao = 0;
        while (opcao!=6) {
            System.out.println(menu);
            option = sc.nextLine();
            opcao = Integer.parseInt(option);
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome:");
                    String nome = sc.nextLine();
                    minhaLista.inserirNoInicio(nome);
                    break;
                case 2:
                    System.out.println("Digite o nome:");
                    nome = sc.nextLine();
                    minhaLista.inserirNoFim(nome);
                    break;
                case 3:
                    System.out.println("Digite o novo nome:");
                    nome = sc.nextLine();
                    System.out.println("Digite o nome que você quer alterar:");
                    String trocaNome = sc.nextLine();
                    minhaLista.alterarNome(trocaNome, nome);
                    break;
                case 4:
                    System.out.println("Digite o nome que você quer excluir:");
                    nome = sc.nextLine();
                    minhaLista.excluiNomes(nome);
                    break;
                case 5:
                    minhaLista.listaNomes(minhaLista);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Digite Opção Valida POr favor!!!");

            }
        }
        System.out.println("end of program");
    }
}
