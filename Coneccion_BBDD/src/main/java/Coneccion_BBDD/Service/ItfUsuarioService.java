package Coneccion_BBDD.Service;

import java.util.List;

import Coneccion_BBDD.entity.Usuario;

/*
 * todos los métodos de una interfaz son implícitamente abstractos y públicos, y no pueden tener un
 * cuerpo.
 */
public interface ItfUsuarioService {

	
	// Metodo para listar usuarios
	public abstract List<Usuario> listAllUsuario();
	
	
	// Metodo para añadir Usuarios
	public abstract Usuario addUsuario();


}
