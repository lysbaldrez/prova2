package br.com.contmatic.empresa.fixturefactory;

import br.com.contmatic.empresa.Empresa;
import br.com.contmatic.empresa.Endereco;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;

public class EmpresaTemplateFixtureFactory {

	    public void load() {


	        //geral

	        Fixture.of(Empresa.class).addTemplate("valido", new Rule () {{
	            add("codigo", random("079", "341", "085x", "0817"));
	            add("nome", random("Cooperativa Central de Crédito Urbano-CECRED", "Cooperativa Unicred Central Santa Catarina", "Itaú Unibanco S.A.", "Banco Real S.A."));
	        }});

	        Fixture.of(Empresa.class).addTemplate("outroValido", new Rule () {{
	            add("codigo", random("M24", "735", "655", "633"));
	            add("nome", random("Banco PSA Finance Brasil S.A.", "Banco Pottencial S.A.", "Banco Prosper S.A.", "Banco Votorantim S.A."));
	        }});
	        
	        Fixture.of(Endereco.class).addTemplate("augustaStreet").inherits("valid", new Rule(){{
	            add("street", "Augusta Street");
	            add("bairro", has(1).of(Endereco.class, "valido")); 
	        }});

	        
	    }
}
