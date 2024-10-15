package co.edu.konradlorenz.model;

public class Torero extends Persona{

	private String apodo;
	private String fechaAlternativa;
	private Torero padrino;
	private Manager apoderado;
	
	
	public Torero() {
		super();
	}

	public Torero(String apodo, String fechaAlternativa, Torero padrino, Manager apoderado) {
		super();
		this.apodo = apodo;
		this.fechaAlternativa = fechaAlternativa;
		this.padrino = padrino;
		this.apoderado = apoderado;
	}

	public Torero(String nombre, String cedula) {
		super(nombre, cedula);
	}
	
	public Torero(String nombre, String cedula, String apodo, String fechaAlternativa, Torero padrino, Manager apoderado) {
		super(nombre, cedula);
		this.apodo = apodo;
		this.fechaAlternativa = fechaAlternativa;
		this.padrino = padrino;
		this.apoderado = apoderado;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public String getFechaAlternativa() {
		return fechaAlternativa;
	}

	public void setFechaAlternativa(String fechaAlternativa) {
		this.fechaAlternativa = fechaAlternativa;
	}

	public Torero getPadrino() {
		return padrino;
	}

	public void setPadrino(Torero padrino) {
		this.padrino = padrino;
	}

	public Manager getApoderado() {
		return apoderado;
	}

	public void setApoderado(Manager apoderado) {
		this.apoderado = apoderado;
	}

	@Override
	public String toString() {
		return "Torero [apodo=" + apodo + ", fechaAlternativa=" + fechaAlternativa + ", padrino=" + padrino
				+ ", apoderado=" + apoderado + "]";
	}

	@Override
	public String mostrarDatos() {
		return null;
	}
	
}
