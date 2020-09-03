package br.com.contmatic.empresa.clienttemplate.loader;

import br.com.contmatic.empresa.Endereco;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class EnderecoLoader implements TemplateLoader {
    
    /**
     * Load.
     */
    @Override
    public void load () {
        Fixture.of(Endereco.class).addTemplate("endereco", new Rule(){{
            add("logradouro", "Rua Padre Estevão Pernet");
            add("numero", "215");
            add("cidade", "São Paulo");
            add("pais", "Brasil");
            add("cep", "03315-000");
         }});
    }
}