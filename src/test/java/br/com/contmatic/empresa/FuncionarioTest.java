package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

// TODO: Auto-generated Javadoc
/**
 * The Class FuncionarioTest.
 */
public class FuncionarioTest {

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
     * Set up.
     */
    @Before
    public final void setUp() {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa.clienttemplate.loader");
        Funcionario funcionario = Fixture.from(Funcionario.class).gimme("funcionario");
    }
    
	/**
	 * Deve testar nome.
	 */
	@Test
	public void deve_testar_nome() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Raimundo");
		assertEquals("Raimundo", funcionario.getNome());
	}

	/**
	 * Deve testar idade.
	 */
	@Test
	public void deve_testar_idade() {
		Funcionario funcionario = new Funcionario();
		funcionario.setIdade("22");
		assertEquals("22", funcionario.getIdade());

	}

	/**
	 * Deve testar cpf.
	 */
	@Test
	public void deve_testar_cpf() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("885.082.875-11");
		assertEquals("885.082.875-11", funcionario.getCpf());
	}

	/**
	 * Deve testar cargo.
	 */
	@Test
	public void deve_testar_cargo() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo("Analista");
		assertEquals("Analista", funcionario.getCargo());
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCargo("Analista");
		assertEquals("Analista", funcionario2.getCargo());
		assertTrue(funcionario.equals(funcionario2));
		assertTrue(funcionario.hashCode() == funcionario2.hashCode());

	}

	/**
	 * Testar outro cpf.
	 */
	@Test
	public void testar_outro_cpf_() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("654321");
		assertNotEquals(funcionario.getCpf(), "123456");

	}

	/**
	 * Deve testar data.
	 */
	@Test
	public void deve_testar_data() {
		Funcionario funcionario = new Funcionario();
		funcionario.setDate("3 anos");
		assertEquals("3 anos", funcionario.getDate());

	}

	/**
	 * Deve testar empresa e funcionario.
	 */
	@Test
	public void deve_testar_empresa_e_funcionario() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		Funcionario funcionario = new Funcionario();
		assertThat(empresa.equals(funcionario), is(false));
		assertFalse(empresa.hashCode() == funcionario.hashCode());

	}

	/**
	 * Deve atribuir cargonulo.
	 */
	@Ignore("Teste desnecessário")
	@Test
	public void deve_atribuir_cargonulo() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(null);

		assertThat(funcionario.getCargo(), (null));
	}

	/**
	 * Deve testar cpf iguais.
	 */
	@Test
	public void deve_testar_cpf_iguais() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("885.082.875-11");
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setCpf("885.082.875-11");
		assertThat(funcionario.getCpf().equals(funcionario1.getCpf()), is(true));
		assertTrue(funcionario.hashCode() == funcionario1.hashCode());

	}

	/**
	 * Nao deve retornar tostring nulo.
	 */
	@Test
	public void nao_deve_retornar_tostring_nulo() {
		Funcionario funcionario = new Funcionario();
		assertNotEquals(funcionario.toString(), null);
	}

	/**
	 * Testar doisobjetos.
	 */
	@Test
	public void testar_doisobjetos() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = funcionario;
		assertEquals(funcionario, funcionario1);
	}

	/**
	 * Testar null.
	 */
	@Test
	public void testar_null() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = null;
		assertNotEquals(funcionario, funcionario1);
	}

	/**
	 * Testar dois objetos nulo.
	 */
	@Test
	public void testar_dois_objetos_nulo() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf(null);
		funcionario1.setCpf(null);
		assertEquals(funcionario, funcionario1);
	}

	/**
	 * Testar um objeto nulo.
	 */
	@Test
	public void testar_um_objeto_nulo() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf(null);
		funcionario1.setCpf("12345678");
		assertNotEquals(funcionario, funcionario1);
	}

	/**
	 * Testar cpfs diferentes.
	 */
	@Test
	public void testar_cpfs_diferentes() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf("8743212");
		funcionario1.setCpf("12345678");
		assertNotEquals(funcionario, funcionario1);
	}

	/**
	 * Testar classes diferentes.
	 */
	@Test
	public void testar_classes_diferentes() {
		Funcionario funcionario = new Funcionario();
		Empresa empresa = new Empresa();
		assertNotEquals(empresa.getClass(), funcionario.getClass());
		assertThat(funcionario.equals(empresa), is(false));

	}
	
	/**
	 * Teste fixturefactory.
	 */
	@Test
    public void teste_fixturefactory () {
	    Funcionario funcionario = Fixture.from(Funcionario.class).gimme("funcionario");
        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Funcionario>> violations = validator.validate(funcionario);
        assertTrue(!violations.isEmpty());
    }
	
	/**
	 * Validation.
	 */
	@Test
    public void validation () {
	    Funcionario funcionario = new Funcionario(); 
        funcionario.setCpf("XXXXXXXXXXX"); 

        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        Set<ConstraintViolation<Funcionario>> violations = validator.validate(funcionario);

        checkArgument(!violations.isEmpty(), "Existem documentos inválidos");

	}
}
