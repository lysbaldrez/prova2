import br.com.contmatic.empresa.*;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

public class Main {
    public static void main(String[] args) {
        FixtureFactoryLoader.loadTemplates("br.com.contmatic.empresa");
        Empresa empresa = Fixture.from(Empresa.class).gimme("empresa");
        
        System.out.println(empresa);
    }
}
