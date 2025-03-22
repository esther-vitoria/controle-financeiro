package com.esthervitoria.controle_financeiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esthervitoria.controle_financeiro.entity.Transacao;
import com.esthervitoria.controle_financeiro.service.TransacaoService;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    @Autowired
    private TransacaoService transacaoService;

    @GetMapping
    public List<Transacao> listar() {
        return transacaoService.listarTransacoes();
    }

    @PostMapping
    public Transacao salvar(@RequestBody Transacao transacao) {
        return transacaoService.salvarTransacao(transacao);
    }

    @PutMapping
    public Transacao update(@RequestBody Transacao transacao) {
        return transacaoService.updateTransacao(transacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        transacaoService.deletarTransacao(id);
    }
}
