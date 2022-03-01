package main.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cientifico")
public class Cientifico {
	// Atributos
	@Id
	private String dni;
	private String nomApels;

	@OneToMany(mappedBy = "cientifico", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Asignado_A> asignado_A;

	// Constructores
	public Cientifico() {
	}

	public Cientifico(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
	}

	// Getters and setters
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_A")
	public List<Asignado_A> getAsignado_A() {
		return asignado_A;
	}

	public void setAsignado_A(List<Asignado_A> asignado_A) {
		this.asignado_A = asignado_A;
	}

	// toString
	@Override
	public String toString() {
		return "Cientifico [dni=" + dni + ", nomApels=" + nomApels + "]";
	}

}
