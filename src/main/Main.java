package main;

import java.util.Scanner;
import model.Usuario;
import service.UsuarioService;
import service.TarefaService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UsuarioService usuarioService = new UsuarioService();
        TarefaService tarefaService = new TarefaService();

        Usuario usuarioLogado = null;

        while (usuarioLogado == null) {

            System.out.println("1 - Login");
            System.out.println("2 - Cadastro");

            int op = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Senha: ");
            String senha = sc.nextLine();

            if (op == 1) {
                usuarioLogado = usuarioService.login(nome, senha);
                if (usuarioLogado == null) {
                    System.out.println("Erro no login!");
                }
            } else {
                if (usuarioService.cadastrar(nome, senha)) {
                    System.out.println("Cadastrado!");
                } else {
                    System.out.println("Usuário já existe!");
                }
            }
        }

        int opcao;

        do {
            System.out.println("\n--- TAREFAS ---");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Concluir");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String desc = sc.nextLine();
                    tarefaService.adicionar(usuarioLogado.getNome(), desc);
                    break;

                case 2:
                    tarefaService.listar(usuarioLogado.getNome());
                    break;

                case 3:
                    tarefaService.listar(usuarioLogado.getNome());
                    int c = sc.nextInt();
                    tarefaService.concluir(usuarioLogado.getNome(), c - 1);
                    break;

                case 4:
                    tarefaService.listar(usuarioLogado.getNome());
                    int r = sc.nextInt();
                    tarefaService.remover(usuarioLogado.getNome(), r - 1);
                    break;
            }

        } while (opcao != 5);

        sc.close();
    }
}