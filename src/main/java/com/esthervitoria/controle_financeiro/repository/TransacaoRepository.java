package com.esthervitoria.controle_financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esthervitoria.controle_financeiro.entity.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {}

//query method spring
