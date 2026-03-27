package repository;

import java.util.ArrayList;
import java.util.HashMap;
import model.Tarefa;

public class RepositoryTarefas {

    private HashMap<String, ArrayList<Tarefa>> tarefasPorUsuario = new HashMap<>();

    public void adicionar(String usuario, Tarefa tarefa) {
        tarefasPorUsuario
        .computeIfAbsent(usuario, k -> new ArrayList<>())
        .add(tarefa);
    }

    public ArrayList<Tarefa> listar(String usuario) {
        return tarefasPorUsuario.getOrDefault(usuario, new ArrayList<>());
    }

public void remover(String usuario, int indice) {
    ArrayList<Tarefa> tarefas = tarefasPorUsuario.get(usuario);
    if (tarefas != null && indice >= 0 && indice < tarefas.size()) {
        tarefas.remove(indice);
    }
}
}