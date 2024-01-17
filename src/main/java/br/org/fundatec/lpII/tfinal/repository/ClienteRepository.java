package br.org.fundatec.lpII.tfinal.repository;

import br.org.fundatec.lpII.tfinal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
