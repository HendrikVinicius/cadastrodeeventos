package br.com.hendrik.projetoevento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CardapioModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCardapio;
	
	@Column
	private String bebidaentrada;
	
	@Column
	private String alimentoentrada;
	
	@Column
	private String bebidaprincipal;
	
	@Column
	private String alimentoprincipal;
	
	@Column
	private String bebidasobremesa;
	
	@Column
	private String alimentosobremesa;

	public CardapioModel() {
	}

	public CardapioModel(Long idCardapio, String bebidaentrada, String alimentoentrada, String bebidaprincipal,
			String alimentoprincipal, String bebidasobremesa, String alimentosobremesa) {
		this.idCardapio = idCardapio;
		this.bebidaentrada = bebidaentrada;
		this.alimentoentrada = alimentoentrada;
		this.bebidaprincipal = bebidaprincipal;
		this.alimentoprincipal = alimentoprincipal;
		this.bebidasobremesa = bebidasobremesa;
		this.alimentosobremesa = alimentosobremesa;
	}

	public Long getIdCardapio() {
		return idCardapio;
	}

	public void setIdCardapio(Long idCardapio) {
		this.idCardapio = idCardapio;
	}

	public String getBebidaentrada() {
		return bebidaentrada;
	}

	public void setBebidaentrada(String bebidaentrada) {
		this.bebidaentrada = bebidaentrada;
	}

	public String getAlimentoentrada() {
		return alimentoentrada;
	}

	public void setAlimentoentrada(String alimentoentrada) {
		this.alimentoentrada = alimentoentrada;
	}

	public String getBebidaprincipal() {
		return bebidaprincipal;
	}

	public void setBebidaprincipal(String bebidaprincipal) {
		this.bebidaprincipal = bebidaprincipal;
	}

	public String getAlimentoprincipal() {
		return alimentoprincipal;
	}

	public void setAlimentoprincipal(String alimentoprincipal) {
		this.alimentoprincipal = alimentoprincipal;
	}

	public String getBebidasobremesa() {
		return bebidasobremesa;
	}

	public void setBebidasobremesa(String bebidasobremesa) {
		this.bebidasobremesa = bebidasobremesa;
	}

	public String getAlimentosobremesa() {
		return alimentosobremesa;
	}

	public void setAlimentosobremesa(String alimentosobremesa) {
		this.alimentosobremesa = alimentosobremesa;
	}
}