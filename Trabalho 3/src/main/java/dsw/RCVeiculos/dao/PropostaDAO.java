package dsw.RCVeiculos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import dsw.RCVeiculos.domain.Proposta;
import dsw.RCVeiculos.domain.Cliente;
import dsw.RCVeiculos.domain.Carro;

@SuppressWarnings("unchecked")
public interface PropostaDAO extends CrudRepository<Proposta, Long>{
	Proposta findById(long id);

	List<Proposta> findAll();
	
	Proposta save(Proposta proposta);

	void deleteById(Long id);
	
	@Query("SELECT proposta FROM Proposta proposta WHERE proposta.cliente = :cliente")
	public List<Proposta> findByIdCliente(@Param ("cliente") Cliente cliente);
	
	@Query("SELECT proposta FROM Proposta proposta  WHERE proposta.carro = :carro")
	public List<Proposta> findByIdCarro(@Param ("carro") Carro carro);

}
