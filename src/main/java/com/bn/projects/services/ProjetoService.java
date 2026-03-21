package com.bn.projects.services;

import com.bn.projects.models.ProjetoModel;
import com.bn.projects.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;

    public ProjetoModel criarProjeto(ProjetoModel projetoModel) {
        return projetoRepository.save(projetoModel);
    }

    public List<ProjetoModel> buscarTodosProjetos() {
        return projetoRepository.findAll();
    }

    public Optional<ProjetoModel> buscarPorId(Long id) {
        return projetoRepository.findById(id);
    }

    public void deletarProjeto(Long id) {
        projetoRepository.deleteById(id);
    }

}
