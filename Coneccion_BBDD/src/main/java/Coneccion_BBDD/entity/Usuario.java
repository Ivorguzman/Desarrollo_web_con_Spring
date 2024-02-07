package Coneccion_BBDD.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Anotacion de jpa
@Table(name = "usuario") // Anotacion de jpa
public class Usuario { // representa el nombre de la tabla en la base de datos

	@Id
	@GeneratedValue // Genera automaticamente el numero continuo del id
	@Column(name = "id")
	private int id;// representa la columna en la base de datos


	@Column(name = "nombres", length = 50)
	private String nombres;// representa la columna en la base de datos


	@Column(name = "apellidos", length = 50)
	private String apellidos;// representa la columna en la base de datos


	@Column(name = "telefono", length = 13)
	private String telefono;// representa la columna en la base de datos


	@Column(name = "correo", length = 100)
	private String correo;// representa la columna en la base de datos


	@Column(name = "direccion", length = 150)
	private String direccion;// representa la columna en la base de datos



	public Usuario(int id, String nombres, String apellidos, String telefono, String correo, String direccion) {
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;

	}



	public Usuario( ) {

	}




	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}




	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}




	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public String setDireccion() {
		return this.direccion;
	}



}
