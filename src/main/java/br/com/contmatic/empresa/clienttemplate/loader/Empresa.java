package br.com.contmatic.empresa.clienttemplate.loader;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class Empresa implements TemplateLoader {
    @Override
    public void load () {
        Fixture.of(Empresa.class).addTemplate("empresa", new Rule(){{
            add("nome", "");
            add("nomeFantasia", "");
            add("cnpj", "");
            add("tipoDeEmpresa", "${apelido}@gmail.com");
            add("porteDaEmpresa", "");
            add("situacaoCadastral", "");
            add("data", "");
            add("telefone", "");
            add("email", "");
            add("situacaoEspecial", "");
            add("endereco","");
         }});
    }
}
