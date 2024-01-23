package br.org.fundatec.lpII.tfinal.service;

import br.org.fundatec.lpII.tfinal.model.Cliente;
import br.org.fundatec.lpII.tfinal.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente criarNovo(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente editarCliente(Integer id, Cliente cliente) {
        Cliente existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não existe no banco de dados com id: " + id));

        existente.setCpf(cliente.getCpf());
        existente.setNome(cliente.getNome());
        existente.setEnderecos(cliente.getEnderecos());

        return repository.save(existente);
    }

    public List<Cliente> listarCliente(String nome) {
        if(nome == null || nome.trim().equals("")) {
            return repository.findAll();
        }
        return repository.buscarClientePeloNome("%" + nome + "%");
//        return repository.findAllByNomeIsLike(nome);
    }
}
