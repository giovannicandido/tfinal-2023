package br.org.fundatec.lpII.tfinal.repository;

import br.org.fundatec.lpII.tfinal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    @Query(value = "select c from Cliente c where c.nome like :nome")
    List<Cliente> buscarClientePeloNome(String nome);

    // spring name convention (magic names)
    List<Cliente> findAllByNomeIsLike(String nome);

    @Query(value = "update c set c.nome = :nome from Cliente c where c.id = :id")
    @Modifying
    void editarClientePeloNome(String id, String nome);
}
