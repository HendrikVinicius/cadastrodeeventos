package br.com.hendrik.projetoevento.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AgendaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;
	
	@Column
	private Long idLocal;
	
	@Column
	private Long idTerceirizado;
	
	@Column
	private Date dataEvento;
	
	@Column
	private String cardapio;
	
	@Column
	private String horaEvento;
	
	@Column
	private String descricao;

	public AgendaModel() {
	}

	public AgendaModel(Long idAgenda, Long idLocal, Long idTerceirizado, Date dataEvento, String cardapio,
			String horaEvento, String descricao) {
		this.idAgenda = idAgenda;
		this.idLocal = idLocal;
		this.idTerceirizado = idTerceirizado;
		this.dataEvento = dataEvento;
		this.cardapio = cardapio;
		this.horaEvento = horaEvento;
		this.descricao = descricao;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Long getIdLocal() {
		return idLocal;
	}

	public void setIdLocal(Long idLocal) {
		this.idLocal = idLocal;
	}

	public Long getIdTerceirizado() {
		return idTerceirizado;
	}

	public void setIdTerceirizado(Long idTerceirizado) {
		this.idTerceirizado = idTerceirizado;
	}

	public Date getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getCardapio() {
		return cardapio;
	}

	public void setCardapio(String cardapio) {
		this.cardapio = cardapio;
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