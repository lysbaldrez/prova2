package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.contmatic.empresa.clienttemplate.loader.TelefoneLoader;
import br.com.six2six.fixturefactory.Fixture;

public class TelefoneTest {
    private Telefone telefone;
    
    @BeforeClass
    public static void load() {
        new TelefoneLoader().load();
    }
    
    @Before
    public void init () {
       telefone = Fixture.from(Telefone.class).gimme("telefone");
     }
    
    @Test
    public void nao_aceitar_ddd_nulo() {
       telefone.setDdd(null);
       assertThat(telefone.equals(null), is(true));
    }

    @Test
    public void nao_aceitar_numero_nulo() {
       telefone.setNumero(null);
       assertThat(telefone.equals(null), is(true));
    }
    
    @Test
    public void nao_aceitar_tipodecelular_nulo() {
       telefone.setTipoDoTelefone(null);
       assertThat(telefone.equals(null), is(true));
    }
}
