package br.com.contmatic.empresa.valida;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import br.com.contmatic.empresa.Funcionario;

public class FuncionarioValida {

    
    public static boolean valida(Funcionario funcionario) {
        System.out.println(funcionario);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Funcionario>> violacoes = validator.validate(funcionario);
        for(ConstraintViolation<Funcionario> constraintViolation : violacoes) {
            System.out.println(constraintViolation.getMessage());
            return false;
        }
        return true;
    }
}
