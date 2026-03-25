package service;

import java.util.ArrayList;
import model.Tarefa;

public class TarefaService {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void addTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));

    }
    public void listarTarefas(){
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
            }
            int i = 1;
            for(Tarefa t: tarefas){
               System.out.println(i + " - " + t.getDescricao() +
                (t.isConcluida() ? " (Concluída)" : ""));
                i++;
        }

    }
    public void concluirTarefa(int indice){
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).marcarComoConcluida();
        }else {
            System.out.println("Índice inválido.");
        }

    }
    public void removerTarefa(int indice){
        if (indice >=0 && indice < tarefas.size()) {
            tarefas.remove(indice);
    }
}
}