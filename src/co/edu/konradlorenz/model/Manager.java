package co.edu.konradlorenz.model;

public class Manager extends Persona{

	private String direccion;
	private long telefono;
	
	
	public Manager() {
		super();
	}

	public Manager(String direccion, long telefono) {
		super();
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public Manager(String nombre, String cedula) {
		super(nombre, cedula);
	}

	public Manager(String nombre, String cedula ,String direccion, long telefono) {
		super(nombre, cedula);
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Manager [direccion=" + direccion + ", telefono=" + telefono + "]";
	}

	@Override
	public String mostrarDatos() {
		return null;
	}
	
	
	
}
