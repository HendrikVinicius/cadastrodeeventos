package br.com.hendrik.projetoevento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.hendrik.projetoevento.model.LocalModel;

public interface LocalRepository extends JpaRepository<LocalModel, Long>{

}