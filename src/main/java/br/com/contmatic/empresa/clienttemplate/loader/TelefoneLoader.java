package br.com.contmatic.empresa.clienttemplate.loader;

import br.com.contmatic.empresa.Telefone;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

public class TelefoneLoader implements TemplateLoader {

    @Override
    public void load () {
        Fixture.of(Telefone.class).addTemplate("telefone", new Rule () {{
            add("ddd", "11");
            add("numero","942307890");
            add("tipoDoTelefone", "CELULAR");
        }});
    }
    
}
