package service;

import model.Usuario;
import repository.RepositoryUsuario;
import repository.RepositoryUsuario;

public class UsuarioService {

    private RepositoryUsuario repo = new RepositoryUsuario();

    public boolean cadastrar(String nome, String senha) {
        if (repo.buscarPorNome(nome) != null) {
            return false;
        }

        repo.salvar(new Usuario(nome, senha));
        return true;
    }

    public Usuario login(String nome, String senha) {
        Usuario u = repo.buscarPorNome(nome);

        if (u != null && u.getSenha().equals(senha)) {
            return u;
        }

        return null;
    }
}