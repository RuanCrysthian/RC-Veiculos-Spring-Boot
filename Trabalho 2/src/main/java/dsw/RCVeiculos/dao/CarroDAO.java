package dsw.RCVeiculos.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dsw.RCVeiculos.domain.Carro;

@SuppressWarnings("unchecked")
public interface CarroDAO extends CrudRepository<Carro, Long>{
	
	Carro findById(long id);
	
	List<Carro> findAll();
	
	Carro save(Carro c);
	
	void deleteById(Long id);
	
	Loja findByPlaca(String placa);
}
