package dsw.RCVeiculos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dsw.RCVeiculos.dao.PropostaDAO;
import dsw.RCVeiculos.domain.Proposta;
import dsw.RCVeiculos.domain.Cliente;
import dsw.RCVeiculos.domain.Carro;
import dsw.RCVeiculos.service.spec.IPropostaService;

@Service
@Transactional(readOnly = false)
public class PropostaService implements IPropostaService {
	@Autowired
	PropostaDAO dao;
	
	public void salvar(Proposta proposta) {
		dao.save(proposta);
	}

	public void excluir(Long id) {
		dao.deleteById(id);
	}

	@Transactional(readOnly = true)
	public Proposta buscarPorId(Long id) {
		return dao.findById(id.longValue());
	}
	
	@Transactional(readOnly = true)
	public List<Proposta> buscarTodos() {
		return dao.findAll();
	}
	

	public List<Proposta> buscarPorClienteId(Cliente cliente) {
		return dao.findByIdCliente(cliente);
	}
	

	public List<Proposta> buscarPorCarroId(Carro carro) {
		return dao.findByIdCarro(carro);
	}
}
