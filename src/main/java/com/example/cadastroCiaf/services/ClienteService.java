package com.example.cadastroCiaf.services;

import com.example.cadastroCiaf.entities.ClienteEntidade;

import java.util.List;

public interface ClienteService {
    ClienteEntidade salvarCliente(ClienteEntidade cliente);

    List<ClienteEntidade> buscarTodosClientes();
}
