package com.example.cadastroCiaf.sevicesImpl;

import com.example.cadastroCiaf.entities.ClienteEntidade;
import com.example.cadastroCiaf.repositories.ClienteRepositorio;
import com.example.cadastroCiaf.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServicoImpl implements ClienteService {

    @Autowired
    private ClienteRepositorio clienteRepositorio;
    @Override
    public ClienteEntidade salvarCliente(ClienteEntidade cliente) {
       return clienteRepositorio.save(cliente);
    }

    @Override
    public List<ClienteEntidade> buscarTodosClientes() {
        return clienteRepositorio.findAll();
    }
}
