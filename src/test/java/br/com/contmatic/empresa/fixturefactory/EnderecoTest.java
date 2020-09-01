package br.com.contmatic.empresa.fixturefactory;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.contmatic.empresa.Empresa;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class EnderecoTest {

    @Test
    public void test() {
        FixtureFactoryLoader.loadTemplates("EmpresaTemplateFixtureFactory");
        EnderecoTest endereco = Fixture.from(EmpresaTemplateFixtureFactory.class).gimme("valid");
    }

}
