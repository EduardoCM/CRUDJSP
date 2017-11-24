package com.hsbc.registro.model;

public class Cliente {

	private int id_cliente;
	private String nombre;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private String email;
	private String telefono;

	public Cliente() {

	}

	public Cliente(int id_cliente, String nombre, String apellidoMaterno, String apellidoPaterno, String email,
			String telefono) {
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
		this.email = email;
		this.telefono = telefono;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellidoMaterno=" + apellidoMaterno
				+ ", apellidoPaterno=" + apellidoPaterno + ", email=" + email + ", telefono=" + telefono + "]";
	}

}
