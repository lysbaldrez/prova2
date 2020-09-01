package br.com.contmatic.empresa.clienttemplate.loader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class Funcionario implements TemplateLoader {
    @Override
    public void load () {
        Fixture.of(Funcionario.class).addTemplate("funcionario", new Rule(){{
            add("nome", "");
            add("idade","");
            add("cpf", "");
            add("cargo", "${apelido}@gmail.com");
            add("date", "");
         }});
    }
}