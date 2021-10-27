package br.com.hendrik.projetoevento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hendrik.projetoevento.model.AgendaModel;

public interface AgendaRepository extends JpaRepository<AgendaModel, Long>{


}
