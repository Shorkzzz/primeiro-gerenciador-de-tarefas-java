package main;

import java.util.Scanner;
import service.TarefaService;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TarefaService service = new TarefaService();

        int opcao;

        do {
            System.out.println("\n--- GERENCIADOR DE TAREFAS ---");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Concluir tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    service.addTarefa(desc);
                    break;

                case 2:
                    service.listarTarefas();
                    break;

                case 3:
                    service.listarTarefas();
                    System.out.print("Número da tarefa: ");
                    int num = sc.nextInt();
                    service.concluirTarefa(num - 1);
                    break;
                case 4:
                     service.listarTarefas();
                    System.out.println("Remover tarefa de numero");
                    int remover = sc.nextInt();
                    service.removerTarefa(remover - 1);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao !=5);

        sc.close();
    }
}