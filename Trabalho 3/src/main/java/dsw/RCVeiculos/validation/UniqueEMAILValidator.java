package dsw.RCVeiculos.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dsw.RCVeiculos.dao.UsuarioDAO;
import dsw.RCVeiculos.domain.Usuario;

@Component
public class UniqueEMAILValidator implements ConstraintValidator<UniqueEMAIL, String> {

	@Autowired
	private UsuarioDAO dao;

	@Override
	public boolean isValid(String Email, ConstraintValidatorContext context) {
		if (dao != null) {
			Usuario usuario = dao.findByEmail(Email);
			return usuario == null;
		} else {
			// Durante a execução da classe LivrariaMvcApplication
			// não há injeção de dependência
			return true;
		}

	}
}
