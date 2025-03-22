package com.esthervitoria.controle_financeiro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esthervitoria.controle_financeiro.entity.Transacao;
import com.esthervitoria.controle_financeiro.repository.TransacaoRepository;

@Service
public class TransacaoService {
    @Autowired
    private TransacaoRepository transacaoRepository;

    public List<Transacao> listarTransacoes() {
        return transacaoRepository.findAll();
    }

    public Transacao salvarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }

    public Transacao updateTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao);
    }
    public void deletarTransacao(Long id) {
        transacaoRepository.deleteById(id);
    }
}