package br.com.hendrik.projetoevento.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LocalModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocal;
	
	@Column
	private Date dataEvento;
	
	@Column
	private String horaEvento;
	
	@Column
	private String descricao;

	public LocalModel() {
	}

	public LocalModel(Long idLocal, Date dataEvento, String horaEvento, String descricao) {
		this.idLocal = idLocal;
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
		this.descricao = descricao;
	}

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getHoraEvento() {
		return horaEvento;
	}

	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}