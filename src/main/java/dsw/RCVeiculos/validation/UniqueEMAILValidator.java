package dsw.RCVeiculos.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dsw.RCVeiculos.dao.LojaDAO;
import dsw.RCVeiculos.domain.Loja;

@Component
public class UniqueEMAILValidator implements ConstraintValidator<UniqueEMAIL, String> {

	@Autowired
	private LojaDAO dao;

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if (dao != null) {
			Loja loja = dao.findByemail(email);
			return loja == null;
		} else {
			// Durante a execução da classe LivrariaMvcApplication
			// não há injeção de dependência
			return true;
		}

	}
}