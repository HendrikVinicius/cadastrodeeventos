package br.com.hendrik.projetoevento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TerceirizadoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTerceirizado;
	
	@Column
	private String CNPJ;
	
	@Column
	private String Ramo;
	
	@Column
	private String Funcionarios;

	public TerceirizadoModel() {
	}

	public TerceirizadoModel(Long idTerceirizado, String cNPJ, String ramo, String funcionarios) {
		this.idTerceirizado = idTerceirizado;
		CNPJ = cNPJ;
		Ramo = ramo;
		Funcionarios = funcionarios;
	}

	public Long getIdTerceirizado() {
		return idTerceirizado;
	}

	public void setIdTerceirizado(Long idTerceirizado) {
		this.idTerceirizado = idTerceirizado;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRamo() {
		return Ramo;
	}

	public void setRamo(String ramo) {
		Ramo = ramo;
	}

	public String getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(String funcionarios) {
		Funcionarios = funcionarios;
	}

}