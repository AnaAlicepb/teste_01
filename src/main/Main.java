package src.main;

import src.model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<Pessoa> getListaDeMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
            .filter(pessoa -> "F".equals(pessoa.getGenero()))
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Criação da lista com homens e mulheres
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana Alice", "F"));
        pessoas.add(new Pessoa("Pedro Henrique", "M"));
        pessoas.add(new Pessoa("Luciana", "F"));
        pessoas.add(new Pessoa("Carlos", "M"));
        pessoas.add(new Pessoa("Mariano", "F"));
        pessoas.add(new Pessoa("Paulo", "M"));
        pessoas.add(new Pessoa("Ana Paula", "F"));

        // Impressão da lista original no console
        System.out.println("Lista original:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome() + "-" + pessoa.getGenero());
        }

        // Criação de outra lista filtrando apenas as mulheres usando lambda
        List<Pessoa> mulheres = getListaDeMulheres(pessoas);

        // Impressão da lista de mulheres no console
        System.out.println("\nLista de mulheres:");
        for (Pessoa mulher : mulheres) {
            System.out.println(mulher.getNome());
        }
    }
}
