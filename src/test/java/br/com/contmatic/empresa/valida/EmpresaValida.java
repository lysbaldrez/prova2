package br.com.contmatic.empresa.valida;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import br.com.contmatic.empresa.Empresa;

public class EmpresaValida {

    public static boolean valida(Empresa empresa) {
        System.out.println(empresa);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Empresa>> violacoes = validator.validate(empresa);
        for(ConstraintViolation<Empresa> constraintViolation : violacoes) {
            System.out.println(constraintViolation.getMessage());
            return false;
        }
        return true;
    }
}
