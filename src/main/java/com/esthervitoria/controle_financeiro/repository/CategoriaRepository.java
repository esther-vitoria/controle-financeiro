package com.esthervitoria.controle_financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esthervitoria.controle_financeiro.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {}