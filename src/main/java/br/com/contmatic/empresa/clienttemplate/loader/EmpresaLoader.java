package br.com.contmatic.empresa.clienttemplate.loader;

import br.com.contmatic.empresa.Empresa;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class EmpresaLoader implements TemplateLoader {
    @Override
    public void load () {
        Fixture.of(Empresa.class).addTemplate("empresa", new Rule(){{
            add("nome", "Contmatic");
            add("nomeFantasia", "Contmatic");
            add("cnpj", "58119371000177");
            add("tipoDeEmpresa", "Contabilidade");
            add("porteDaEmpresa", "Grande");
            add("situacaoCadastral", "Ativo");
            add("data", "01/01/2001");
            add("telefone", "");
            add("email", "contato@contmatic.com.br");
            add("situacaoEspecial", "preencher");
         }});
    }
}
