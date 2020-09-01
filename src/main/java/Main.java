import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import br.com.contmatic.empresa.*;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class Main {
    public static void main(String[] args) {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa.clienttemplate.loader");
        Empresa empresa = Fixture.from(Empresa.class).gimme("empresa");
        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Empresa>> violations = validator.validate(empresa);
        if (!violations.isEmpty()) {
            System.out.println("Inválido");
        }
    }
}
