package service;

import model.Tarefa;
import repository.RepositoryTarefas;

public class TarefaService {

    private RepositoryTarefas repo = new RepositoryTarefas();

    public void adicionar(String usuario, String descricao) {
        repo.adicionar(usuario, new Tarefa(descricao));
    }

    public void listar(String usuario) {
        int i = 1;

        for (Tarefa t : repo.listar(usuario)) {
            System.out.println(i + " - " + t.getDescricao() +
                (t.isConcluida() ? " [X]" : " [ ]"));
            i++;
        }
    }

    public void concluir(String usuario, int indice) {
        repo.listar(usuario).get(indice).setConcluida(true);
    }

    public void remover(String usuario, int indice) {
        repo.remover(usuario, indice);
    }
}