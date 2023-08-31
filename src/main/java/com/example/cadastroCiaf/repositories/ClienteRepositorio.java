package com.example.cadastroCiaf.repositories;

import com.example.cadastroCiaf.entities.ClienteEntidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepositorio extends JpaRepository<ClienteEntidade, Long> {

}
