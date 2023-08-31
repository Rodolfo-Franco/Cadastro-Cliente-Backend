package com.example.cadastroCiaf.controller;

import ch.qos.logback.core.net.server.Client;
import com.example.cadastroCiaf.entities.ClienteEntidade;
import com.example.cadastroCiaf.services.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @GetMapping()
    public List<ClienteEntidade> listar(){
       return  clienteService.buscarTodosClientes();
    }

    @PostMapping()
    public ResponseEntity<?> salvar(@RequestBody @Valid ClienteEntidade clienteEntidade){
        return ResponseEntity.ok(clienteService.salvarCliente(clienteEntidade));
    }
}
