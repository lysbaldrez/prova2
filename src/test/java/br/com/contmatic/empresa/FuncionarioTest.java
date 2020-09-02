package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.junit.Ignore;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class FuncionarioTest {

	@Test
	public void deve_testar_nome() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Raimundo");
		assertEquals("Raimundo", funcionario.getNome());
	}

	@Test
	public void deve_testar_idade() {
		Funcionario funcionario = new Funcionario();
		funcionario.setIdade("22");
		assertEquals("22", funcionario.getIdade());

	}

	@Test
	public void deve_testar_cpf() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("885.082.875-11");
		assertEquals("885.082.875-11", funcionario.getCpf());
	}

	@Test
	public void deve_testar_cargo() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo("Analista");
		assertEquals("Analista", funcionario.getCargo());
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setCargo("Analista");
		assertEquals("Analista", funcionario.getCargo());
		assertThat(funcionario.equals(funcionario2), is(true));
		assertTrue(funcionario.hashCode() == funcionario2.hashCode());

	}

	@Test
	public void testar_outro_cpf_() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("654321");
		assertNotEquals(funcionario.getCpf(), "123456");

	}

	@Test
	public void deve_testar_data() {
		Funcionario funcionario = new Funcionario();
		funcionario.setDate("3 anos");
		assertEquals("3 anos", funcionario.getDate());

	}

	@Test
	public void deve_testar_empresa_e_funcionario() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("12345");
		Funcionario funcionario = new Funcionario();
		assertThat(empresa.equals(funcionario), is(false));
		assertFalse(empresa.hashCode() == funcionario.hashCode());

	}

	@Ignore("Teste desnecessário")
	@Test
	public void deve_atribuir_cargonulo() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCargo(null);

		assertThat(funcionario.getCargo(), (null));
	}

	@Test
	public void deve_testar_cpf_iguais() {
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("885.082.875-11");
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setCpf("885.082.875-11");
		assertThat(funcionario.getCpf().equals(funcionario1.getCpf()), is(true));
		assertTrue(funcionario.hashCode() == funcionario1.hashCode());

	}

	@Test
	public void nao_deve_retornar_tostring_nulo() {
		Funcionario funcionario = new Funcionario();
		assertNotEquals(funcionario.toString(), null);
	}

	@Test
	public void testar_doisobjetos() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = funcionario;
		assertEquals(funcionario, funcionario1);
	}

	@Test
	public void testar_null() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = null;
		assertNotEquals(funcionario, funcionario1);
	}

	@Test
	public void testar_dois_objetos_nulo() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf(null);
		funcionario1.setCpf(null);
		assertEquals(funcionario, funcionario1);
	}

	@Test
	public void testar_um_objeto_nulo() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf(null);
		funcionario1.setCpf("12345678");
		assertNotEquals(funcionario, funcionario1);
	}

	@Test
	public void testar_cpfs_diferentes() {
		Funcionario funcionario = new Funcionario();
		Funcionario funcionario1 = new Funcionario();
		funcionario.setCpf("8743212");
		funcionario1.setCpf("12345678");
		assertNotEquals(funcionario, funcionario1);
	}

	@Test
	public void testar_classes_diferentes() {
		Funcionario funcionario = new Funcionario();
		Empresa empresa = new Empresa();
		assertNotEquals(empresa.getClass(), funcionario.getClass());
		assertThat(funcionario.equals(empresa), is(false));

	}
	@Test
    public void teste_fixturefactory () {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa.clienttemplate.loader");
        Funcionario funcionario = Fixture.from(Funcionario.class).gimme("funcionario");
        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Funcionario>> violations = validator.validate(funcionario);
        if (!violations.isEmpty()) {
            System.out.println("Inválido");
        }
    }
	@Test
    public void validation () {
	    Funcionario funcionario = new Funcionario(); 
        funcionario.setCpf("XXXXXXXXXXX"); 

        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

        Set<ConstraintViolation<Funcionario>> violations = validator.validate(funcionario);

        if(!violations.isEmpty())
            System.err.println("Existem documentos inválidos");
    }
}
