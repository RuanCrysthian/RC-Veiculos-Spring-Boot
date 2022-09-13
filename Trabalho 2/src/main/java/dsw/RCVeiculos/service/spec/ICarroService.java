package dsw.RCVeiculos.service.spec;

import java.util.List;

import dsw.RCVeiculos.domain.Carro;

public interface ICarroService {
	Carro buscarPorId(Long id);
	
	List<Carro> buscarTodos();
	
	void salvar(Carro carro);
	
	void excluir(Long id);
	
	Carro findByPlaca(String placa);
}