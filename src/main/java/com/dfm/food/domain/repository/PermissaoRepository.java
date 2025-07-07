package com.dfm.food.domain.repository;

import com.dfm.food.domain.model.Permissao;

import java.util.List;

public interface PermissaoRepository {

    List<Permissao>listar();
    Permissao buscar(Long id);
    Permissao salvar(Permissao permissao);
    void remover(Permissao permissao);

}
