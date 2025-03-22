package com.esthervitoria.controle_financeiro.service;

import org.springframework.stereotype.Service;

import com.esthervitoria.controle_financeiro.entity.Categoria;
import com.esthervitoria.controle_financeiro.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deletarCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}

