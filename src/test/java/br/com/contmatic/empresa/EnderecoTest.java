package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.com.contmatic.empresa.valida.EnderecoValida;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

// TODO: Auto-generated Javadoc
/**
 * The Class EnderecoTest.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EnderecoTest {
    
    private Endereco endereco;
    
    @Before
    public final void setup ( ) {
        endereco = new Endereco ();
    }
    
    @After
    public final void tearDown () {
        endereco = null;
    }
    
	/**
	 * Before.
	 */
	@BeforeClass
	public static void before() {
		System.out.println("Iniciando os testes");
	}

	/**
	 * After.
	 */
	@AfterClass
	public static void after() {
		System.out.println(" Terminando os testes");
	}

	 /**
 	 * Check argument.
 	 *
 	 * @param b the b
 	 * @param string the string
 	 */
 	private void checkArgument(boolean b, String string) {
	        // TODO Auto-generated method stub
	        
	    }
	
	/**
	 * Deve testar cep.
	 */
	@Test
	public void deve_testar_cep() {
		Endereco endereco = new Endereco();
		endereco.setCep("03.308-050");
		assertEquals("03.308-050", endereco.getCep());

	}

	/**
	 * Deve testar cidade.
	 */
	@Test
	public void deve_testar_cidade() {
		Endereco endereco = new Endereco();
		endereco.setCidade("Sao Paulo");
		assertEquals("Sao Paulo", endereco.getCidade());
	}

	/**
	 * Deve testar rua.
	 */
	@Test
	public void deve_testar_rua() {
		Endereco endereco = new Endereco();
		endereco.setLogradouro("R VISCONDE DE ITABORAI");
		assertEquals("R VISCONDE DE ITABORAI", endereco.getLogradouro());

	}

	/**
	 * Deve testar numero.
	 */
	@Test
	public void deve_testar_numero() {
		Endereco endereco = new Endereco();
		endereco.setNumero("368");
		assertEquals("368", endereco.getNumero());
	}

	/**
	 * Deve testar pais.
	 */
	@Test
	public void deve_testar_pais() {
		Endereco endereco = new Endereco();
		endereco.setPais("Brasil");
		assertEquals("Brasil", endereco.getPais());

	}

	/**
	 * Deve testar cep iguais.
	 */
	@Test
	public void deve_testar_cep_iguais() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340-070");
		Endereco endereco2 = new Endereco();
		endereco2.setCep("09340-070");
		assertThat(endereco.equals(endereco2), is(true));
		assertTrue(endereco.hashCode() == endereco2.hashCode());

	}

	/**
	 * Deve testar cep diferentes.
	 */
	@Test
	public void deve_testar_cep_diferentes() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340-070");
		Endereco endereco2 = new Endereco();
		endereco2.setCep("09350-070");
		assertThat(endereco.equals(endereco2), is(false));
		assertFalse(endereco.hashCode() == endereco2.hashCode());
	}

	/**
	 * Deve testar endereco e funcionario.
	 */
	@Test
	public void deve_testar_endereco_e_funcionario() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340-070");
		Funcionario funcionario = new Funcionario();
		assertThat(endereco.equals(funcionario), is(false));
		assertFalse(endereco.hashCode() == funcionario.hashCode());

	}

	/**
	 * Testar tostring.
	 */
	@Test
	public void testar_tostring() {
		Endereco endereco = new Endereco();
		endereco.setCep("09340-070");
		assertNotEquals("09340-070", endereco.toString());
	}

	/**
	 * Testar doisobjetos.
	 */
	@Test
	public void testar_doisobjetos() {
		Endereco endereco = new Endereco();
		Endereco endereco1 = endereco;
		assertEquals(endereco, endereco1);
	}

	/**
	 * Testar null.
	 */
	@Test
	public void testar_null() {
		Endereco endereco = new Endereco();
		Endereco endereco1 = null;
		assertNotEquals(endereco, endereco1);
	}

	/**
	 * Nao deve retornar tostring nulo.
	 */
	@Test
	public void nao_deve_retornar_tostring_nulo() {
		Endereco endereco = new Endereco();
		assertNotEquals(endereco.toString(), null);
	}

	/**
	 * Deve testar cep 2.
	 */
	@Test
	public void deve_testar_cep2() {
		Endereco endereco = new Endereco();
		endereco.setCep(null);
		Endereco endereco2 = new Endereco();
		endereco2.setCep("09340-070");
		assertThat(endereco.equals(endereco2), is(false));
		assertFalse(endereco.hashCode() == endereco2.hashCode());

	}

	/**
	 * Deve testar numero 2.
	 */
	@Test
	public void deve_testar_numero2() {
		Endereco endereco = new Endereco();
		endereco.setNumero(null);
		Endereco endereco2 = new Endereco();
		endereco2.setNumero("368");
		assertThat(endereco.equals(endereco2), is(false));
		assertFalse(endereco.hashCode() == endereco2.hashCode());

	}

	/**
	 * Deve testar numeros diferentes.
	 */
	@Test
	public void deve_testar_numeros_diferentes() {
		Endereco endereco = new Endereco();
		endereco.setNumero("567");
		Endereco endereco2 = new Endereco();
		endereco2.setNumero("369");
		assertThat(endereco.equals(endereco2), is(false));
		assertFalse(endereco.hashCode() == endereco2.hashCode());

	}
	
	/**
	 * Teste fixturefactory.
	 */
	@Test
    public void teste_fixturefactory () {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa.clienttemplate.loader");
        Endereco endereco = Fixture.from(Endereco.class).gimme("endereco");
        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Endereco>> violations = validator.validate(endereco);
        if (!violations.isEmpty()) {
            System.out.println("Inválido");
        }
    }
	
	/**
	 * Validation.
	 */
	@Test
    public void validation () {
        Endereco endereco = new Endereco(); 
        endereco.setCep("XXXXXXXXXXX"); 

        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        Set<ConstraintViolation<Endereco>> violations = validator.validate(endereco);

        checkArgument(!violations.isEmpty(), "Existem documentos inválidos");
    }

	
	 @Test
	    public void nao_deve_aceitar_logradouro_com_caracteres_especiais() {
	        endereco.setLogradouro("Rua Costa & Silva");
	        assertFalse(EnderecoValida.valida(endereco));
	        
	    }

	 
}
