package br.com.contmatic.empresa.clienttemplate.loader;

import br.com.contmatic.empresa.Funcionario;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class FuncionarioLoader implements TemplateLoader {
    
    /**
     * Load.
     */
    @Override
    public void load () {
        Fixture.of(Funcionario.class).addTemplate("funcionario", new Rule(){{
            add("nome", "Lys");
            add("idade","22");
            add("cpf", "22650917811");
            add("cargo", "Estagiária");
            add("date", "15/07/2020");
         }});
    }
}