package br.com.hendrik.projetoevento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hendrik.projetoevento.model.CardapioModel;

public interface CardapioRepository extends JpaRepository<CardapioModel, Long>{

}