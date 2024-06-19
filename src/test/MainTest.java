package src.test;

import src.main.Main;
import src.model.Pessoa;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testGetListaDeMulheres() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana Alice", "F"));
        pessoas.add(new Pessoa("Pedro Henrique", "M"));
        pessoas.add(new Pessoa("Luciana", "F"));
        pessoas.add(new Pessoa("Carlos", "M"));
        pessoas.add(new Pessoa("Mariano", "F"));
        pessoas.add(new Pessoa("Paulo", "M"));
        pessoas.add(new Pessoa("Ana Paula", "F"));

        List<Pessoa> mulheres = Main.getListaDeMulheres(pessoas);

        assertTrue(mulheres.stream().allMatch(pessoa -> "F".equals(pessoa.getGenero())));
    }
}
