package dao;

import java.util.List;
import modelo.Usuario;

public interface DaoUsuario{

    public Usuario obtenerPorId(Integer key);
    
    public Usuario obtenerPorCodigoUsuario(String key);
    
    public void actualizar(Usuario usuario);
    
    public void eliminar(Usuario usuario);

    public void insertar(Usuario usuario);

    public List<Usuario> obtenerPorApellido(Usuario usuario);
    
    public List<Usuario> obtenerUltimosRegistros();
    
}











