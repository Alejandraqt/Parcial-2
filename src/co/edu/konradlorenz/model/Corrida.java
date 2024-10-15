package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class Corrida {

	private int numeroOrden;
	private String feria;
	private int anioCelebracion;
	private ArrayList<Torero> listaToreros = new ArrayList<>();
	
	
	public Corrida() {

	}
	
	public Corrida(int numeroOrden, String feria, int anioCelebracion, ArrayList<Torero> listaToreros) {
		super();
		this.numeroOrden = numeroOrden;
		this.feria = feria;
		this.anioCelebracion = anioCelebracion;
		this.listaToreros = listaToreros;
	}

	public int getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(int numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public String getFeria() {
		return feria;
	}

	public void setFeria(String feria) {
		this.feria = feria;
	}

	public int getAnioCelebracion() {
		return anioCelebracion;
	}

	public void setAnioCelebracion(int anioCelebracion) {
		this.anioCelebracion = anioCelebracion;
	}

	public ArrayList<Torero> getListaToreros() {
		return listaToreros;
	}

	public void setListaToreros(ArrayList<Torero> listaToreros) {
		this.listaToreros = listaToreros;
	}

	@Override
	public String toString() {
		return "Corrida [numeroOrden=" + numeroOrden + ", feria=" + feria + ", anioCelebracion=" + anioCelebracion
				+ ", listaToreros=" + listaToreros + "]";
	}

	
	
	
	
}
