package br.com.contmatic.empresa;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

// TODO: Auto-generated Javadoc
/**
 * The Class EmpresaTest.
 */
public class EmpresaTest {
    

	/** The empresa. */
	private Empresa empresa;
	
	/** The funcionarios. */
	private List<String> funcionarios;

	/**
	 * Set up.
	 */
	@Before
	public final void setUp() {
		empresa = new Empresa();
	}

	/**
	 * Tear down.
	 */
	@After
	public final void tearDown() {
		empresa = null;
	}

	/**
	 * Check argument.
	 *
	 * @param b the b
	 * @param string the string
	 */
	private void checkArgument(boolean b, String string) {
        
    }
	
	/**
	 * Deve atribuir nome corretamente.
	 */
	@Test(timeout = 500)
	public void deve_atribuir_nome_corretamente() {
		empresa = new Empresa();
		empresa.setNome("Contmatic");
		assertEquals("Contmatic", empresa.getNome());

	}

	/**
	 * Deve testar cnpj.
	 */
	@Test
	public void deve_testar_cnpj() {
		empresa = new Empresa();
		empresa.setCnpj("58.119.371/0001-77");
		assertEquals("58.119.371/0001-77", empresa.getCnpj());
	}

	/**
	 * Deve testar cnpj nulo e nao nulo.
	 */
	@Test
	public void deve_testar_cnpj_nulo_e_nao_nulo() {
		empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		assertNotEquals(null, empresa.getCnpj());
	}

	/**
	 * Deve testar nova empresa tipo.
	 */
	@Test
	public void deve_Testar_Nova_Empresa_Tipo() {
		empresa = new Empresa();
		empresa.setTipoDeEmpresa("MEI");
		assertEquals("MEI", empresa.getTipoDeEmpresa());
	}

	/**
	 * Deve testar porte.
	 */
	@Test
	public void deve_testar_porte() {
		empresa = new Empresa();
		empresa.setPorteDaEmpresa("Médio");
		assertEquals("Médio", empresa.getPorteDaEmpresa());

	}

	/**
	 * Deve testar nome fantasia.
	 */
	@Test
	public void deve_testar_nomeFantasia() {
		empresa = new Empresa();
		empresa.setNomeFantasia("CONTENTE COMERCIO E NEGOCIOS");
		assertEquals("CONTENTE COMERCIO E NEGOCIOS", empresa.getNomeFantasia());

	}

	/**
	 * Deve testar telefone.
	 */
	@Test
	public void deve_testar_telefone() {
		empresa = new Empresa();
		empresa.setTelefone("(0011) 6942-9811");
		assertEquals("(0011) 6942-9811", empresa.getTelefone());

	}

	/**
	 * Deve testar situacao cadastral.
	 */
	@Test
	public void deve_testar_situacaoCadastral() {
		empresa = new Empresa();
		empresa.setSituacaoCadastral("Ativa");
		assertEquals("Ativa", empresa.getSituacaoCadastral());

	}

	/**
	 * Deve testar data situacao cadastral.
	 */
	@Test
	public void deve_testar_dataSituacaoCadastral() {
		empresa = new Empresa();
		empresa.setData("26/06/2004");
		assertEquals("26/06/2004", empresa.getData());

	}

	/**
	 * Deve testar email.
	 */
	@Test
	public void deve_testar_email() {
		empresa = new Empresa();
		empresa.setEmail("autoatendimento@contmatic.com.br");
		assertEquals("autoatendimento@contmatic.com.br", empresa.getEmail());
	}

	/**
	 * Deve testar situacao especial.
	 */
	@Test
	public void deve_testar_situacaoEspecial() {
		empresa = new Empresa();
		empresa.setSituacaoEspecial("Ativada");
		assertEquals("Ativada", empresa.getSituacaoEspecial());

	}

	/**
	 * Deve testar data situacao especial.
	 */
	@Test
	public void deve_testar_dataSituacaoEspecial() {
		empresa = new Empresa();
		empresa.setData("26/06/2004");
		assertEquals("26/06/2004", empresa.getData());
	}

	/**
	 * Deve testar lista de funcionarios.
	 */
	@Test
	public void deve_testar_listaDeFuncionarios() {
		Funcionario funcionario = new Funcionario();
		List<Funcionario> funcionarios = new ArrayList<>();
		funcionarios.add(funcionario);
		Funcionario funcionario2 = new Funcionario();
		List<Funcionario> funcionarios2 = new ArrayList<>();
		funcionarios2.add(funcionario2);
		Empresa empresa2 = new Empresa();
		assertThat(funcionarios.equals(funcionarios2), is(true));
		assertTrue(funcionarios.hashCode() == funcionarios2.hashCode());
		assertEquals(empresa.getFuncionarios(), empresa2.getFuncionarios());
	}

	/**
	 * Deve acontecer null pointer.
	 */
	@Test(expected = NullPointerException.class)
	public void deve_acontecer_NullPointer() {
		empresa = null;
		assertThat(empresa.equals(null), is(true));
	}

	/**
	 * Teste cpf nulo.
	 */
	@Test
	public void teste_cpf_nulo() {
		empresa = new Empresa();
		empresa.setCnpj(null);
		assertEquals(null, empresa.getCnpj());

	}

	/**
	 * Teste cpf nulo 2.
	 */
	@Test
	public void teste_cpf_nulo2() {
		empresa = new Empresa();
		empresa.setCnpj("12345");
		assertNotEquals(null, empresa.getCnpj());

	}

	/**
	 * Deve testar cnpj iguais.
	 */
	@Test
	public void deve_testar_cnpj_iguais() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26870272/0001-36");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("26870272/0001-36");
		assertTrue(empresa.hashCode() == empresa2.hashCode());

	}

	/**
	 * Deve testar cnpj diferentes.
	 */
	@Test
	public void deve_testar_cnpj_diferentes() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("35.876.272/0001-98");
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}

	/**
	 * Deve testar empresa e funcionario.
	 */
	@Test
	public void deve_testar_empresa_e_funcionario() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		Funcionario funcionario = new Funcionario();
		assertThat(empresa.equals(funcionario), is(false));
		assertFalse(empresa.hashCode() == funcionario.hashCode());

	}

	/**
	 * Deve testar cnpj 2.
	 */
	@Test
	public void deve_testar_cnpj2() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("56.980.272/0001-86");
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}

	/**
	 * Deve testar cnpj 3.
	 */
	@Test
	public void deve_testar_cnpj3() {
		Empresa empresa = new Empresa();
		empresa.setCnpj(null);
		Empresa empresa2 = new Empresa();
		empresa2.setCnpj("26.870.272/0001-36");
		assertNotEquals(empresa, empresa2);
		assertThat(empresa.equals(empresa2), is(false));
		assertFalse(empresa.hashCode() == empresa2.hashCode());

	}

	/**
	 * Testar tostring.
	 */
	@Test
	public void testar_tostring() {
		Empresa empresa = new Empresa();
		empresa.setCnpj("26.870.272/0001-36");
		assertNotEquals("26.870.272/0001-36", empresa.toString());
	}

	/**
	 * Testar doisobjetos.
	 */
	@Test
	public void testar_doisobjetos() {
		Empresa empresa = new Empresa();
		Empresa empresa1 = empresa;
		assertEquals(empresa, empresa1);
	}

	/**
	 * Testar null.
	 */
	@Test
	public void testar_null() {
		Empresa empresa = new Empresa();
		Empresa empresa1 = null;
		assertNotEquals(empresa, empresa1);
	}

	/**
	 * Nao deve retornar tostring nulo.
	 */
	@Test
	public void nao_deve_retornar_tostring_nulo() {
		Empresa empresa = new Empresa();
		assertNotEquals(empresa.toString(), null);
	}
	
	/**
	 * Deve testar joda time.
	 */
	@Test
    public void deve_testar_JodaTime() {
        Empresa empresa = new Empresa();
        empresa.setDiaCadastro(null);
        
    }
	
	/**
	 * Teste fixturefactory.
	 */
	@Test
	public void teste_fixturefactory () {
	    FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa.clienttemplate.loader");
        Empresa empresa = Fixture.from(Empresa.class).gimme("empresa");
        javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Empresa>> violations = validator.validate(empresa);
        if (!violations.isEmpty()) {
            System.out.println("Inválido");
        }
	}
	
	/**
	 * Validation.
	 */
	@Test
	public void validation () {
	    Empresa empresa = new Empresa(); 
	    empresa.setCnpj("XXXXXXXXXXX"); 

	    javax.validation.Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

	    Set<ConstraintViolation<Empresa>> violations = validator.validate(empresa);

	    checkArgument(!violations.isEmpty(), "Existem documentos inválidos");
	    
	}

	@Test
    public void nao_deve_adicionar_enderecos_iguais() {
	    empresa.setEnderecos(new HashSet<Endereco>() );
        Endereco endereco1 = new Endereco();       
        endereco1.setCep("04304010");
        endereco1.setNumero("539");
        empresa.getEnderecos().add(endereco1);
        Endereco endereco2 = new Endereco ();
        endereco2.setCep("04304010");
        endereco2.setNumero("539");
        empresa.getEnderecos().add(endereco2);
        assertThat(empresa.getEnderecos().size(), is(1));
        
    }
	@Test
    public void nao_deve_adicionar_enderecos_diferentes() {
        empresa.setEnderecos(new HashSet<Endereco>() );
        Endereco endereco1 = new Endereco();       
        endereco1.setCep("04304010");
        endereco1.setNumero("539");
        empresa.getEnderecos().add(endereco1);
        Endereco endereco2 = new Endereco ();
        endereco2.setCep("04304050");
        endereco2.setNumero("975");
        empresa.getEnderecos().add(endereco2);
        assertThat(empresa.getEnderecos().size(), is(2));
        
    }
    
	
}