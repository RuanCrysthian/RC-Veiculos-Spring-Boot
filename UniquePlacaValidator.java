package dsw.RCVeiculos.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import dsw.RCVeiculos.dao.CarroDAO;
import dsw.RCVeiculos.domain.Carro;

@Component
public class UniquePlacaValidator implements ConstraintValidator<UniquePlaca, String> {

	@Autowired
	private CarroDAO dao;

	@Override
	public boolean isValid(String placa, ConstraintValidatorContext context) {
		if (dao != null) {
			Carro carro = dao.findByPlaca(Placa);
			return carro == null;
		} else {
			// Durante a execução da classe LivrariaMvcApplication
			// não há injeção de dependência
			return true;
		}

	}
}