package com.generation.streaming_filme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.streaming_filme.model.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long>{

	public List<Filme> findAllByNomeFilmeContainingIgnoreCase(@Param("nomeFilme") String nomeFilme);
}
