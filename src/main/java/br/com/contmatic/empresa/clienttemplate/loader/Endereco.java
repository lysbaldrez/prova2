package br.com.contmatic.empresa.clienttemplate.loader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class Endereco implements TemplateLoader {
    @Override
    public void load () {
        Fixture.of(Endereco.class).addTemplate("endereco", new Rule(){{
            add("logradouro", "");
            add("numero", "");
            add("cidade", "");
            add("pais", "${apelido}@gmail.com");
            add("cep", "");
         }});
    }
}