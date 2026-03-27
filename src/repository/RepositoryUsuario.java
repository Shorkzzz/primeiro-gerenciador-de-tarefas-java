package repository;
import java.util.ArrayList;
import model.Usuario;

public class RepositoryUsuario {

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarPorNome(String nome) {
        for (Usuario u : usuarios) {
            if (u.getNome().equals(nome)) {
                return u;
            }
        }
        return null; 
    }
}