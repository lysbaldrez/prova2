package br.com.contmatic.empresa.fixturefactory;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import br.com.contmatic.empresa.Empresa;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class EmpresaTest {

    @Test
    public void test() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa");
        Empresa empresa = Fixture.from(EmpresaTemplateFixtureFactory.class).gimme("valido");
        empresa.setCnpj(null);
        Empresa empresa2 = new Empresa();
        empresa2.setCnpj("26.870.272/0001-36");
        assertNotEquals(empresa, empresa2);
        assertThat(empresa.equals(empresa2), is(false));
        assertFalse(empresa.hashCode() == empresa2.hashCode());

    }

}
