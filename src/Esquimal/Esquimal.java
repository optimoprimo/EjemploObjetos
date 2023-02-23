package Esquimal;

import persona.Persona;

public class Esquimal extends Persona {

	private Integer iglus = 1;
	private String sexo = "hombre";

	public Esquimal() {
	}

	public Esquimal(Integer iglus, String sexo) {
		this.iglus = iglus;
		this.sexo = sexo;
	}

	public Integer getIglus() {
		return iglus;
	}

	public void setIglus(Integer iglus) {
		this.iglus = iglus;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return "Esquimal";
	}
}
