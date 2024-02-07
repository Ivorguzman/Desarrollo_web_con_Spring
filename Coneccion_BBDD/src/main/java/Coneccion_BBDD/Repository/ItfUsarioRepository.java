package Coneccion_BBDD.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Coneccion_BBDD.entity.Usuario;




/*
 * Esto significa que ItfUsarioRepository es una interfaz que extiende la interfaz JpaRepository,
 * que es una de las interfaces principales de Spring Data JPA. JpaRepository proporciona métodos
 * para realizar operaciones básicas de persistencia con entidades, como guardar, actualizar,
 * eliminar, contar y buscar por identificador.
 * 
 * En este caso, el primer argumento de JpaRepository es Usuario, que es la clase de la entidad que
 * se va a gestionar. El segundo argumento es Serializable, que es el tipo del identificador de la
 * entidad. Al usar Serializable, se permite que el identificador pueda ser de cualquier tipo que
 * implemente la interfaz Serializable, como String, Long, Integer, etc.
 * 
 * Al extender JpaRepository, ItfUsarioRepository hereda todos los métodos de esa interfaz y puede
 * definir métodos adicionales según las necesidades del dominio. Por ejemplo, se podría definir un
 * método para buscar usuarios por nombre, correo electrónico o rol.
 */
@Repository("itfUsarioRepository")
public interface ItfUsarioRepository extends JpaRepository<Usuario, Serializable> {
}




















