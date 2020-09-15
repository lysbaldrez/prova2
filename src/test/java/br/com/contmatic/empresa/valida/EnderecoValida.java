package br.com.contmatic.empresa.valida;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;

import br.com.contmatic.empresa.Endereco;

public class EnderecoValida {

    public static boolean valida(Endereco endereco) {
        System.out.println(endereco);
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Endereco>> violacoes = validator.validate(endereco);
        for(ConstraintViolation<Endereco> constraintViolation : violacoes) {
            System.out.println(constraintViolation.getMessage());
            return false;
        }
        return true;
    }

}

