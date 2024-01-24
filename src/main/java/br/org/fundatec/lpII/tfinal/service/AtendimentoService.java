package br.org.fundatec.lpII.tfinal.service;

public class AtendimentoService {

    // Para quando atendimento tem a relação com produto
    public void iniciarAtendimento(Atendimento atendimento) {
        // para cada produto dentro de atendimento, buscar o produto no banco
        // produtoRepository.findById()
        // Buscar o cliente no banco pelo id
        // atendimento.setCliente()
        // atendimento.setProdutos = produtos do banco
        // salvar atendimento

    }

    // Para quando o produto tem a relação com atendimento
    public void iniciarAtendimento(IniciarAtendimento iniciarAtendimento) {
        // criar um novo atendimento
        // buscar todos os produtos
        // buscar o cliente
        // atendimento.setCliente()
        // atendimento.setProdutos = produtos do banco


        // salvar atendimento
    }
}
