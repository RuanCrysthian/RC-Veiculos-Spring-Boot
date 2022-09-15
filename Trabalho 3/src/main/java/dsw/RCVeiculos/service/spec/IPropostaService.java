package dsw.RCVeiculos.service.spec;

import java.util.List;

import dsw.RCVeiculos.domain.Proposta;
import dsw.RCVeiculos.domain.Carro;
import dsw.RCVeiculos.domain.Cliente;

public interface IPropostaService {
	Proposta buscarPorId(Long id);
	
	List<Proposta> buscarTodos();
	
	List<Proposta> buscarPorClienteId(Cliente cliente);
	
	List<Proposta> buscarPorCarroId(Carro carro);
	
	void salvar(Proposta proposta);
	
	void excluir(Long id);
}
