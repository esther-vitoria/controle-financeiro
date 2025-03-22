package com.esthervitoria.controle_financeiro.controller;

import org.springframework.web.bind.annotation.*;

import com.esthervitoria.controle_financeiro.entity.Categoria;
import com.esthervitoria.controle_financeiro.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.listarCategorias();
    }

    @PostMapping
    public Categoria salvar(@RequestBody Categoria categoria) {
        return categoriaService.salvarCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        categoriaService.deletarCategoria(id);
    }
}
