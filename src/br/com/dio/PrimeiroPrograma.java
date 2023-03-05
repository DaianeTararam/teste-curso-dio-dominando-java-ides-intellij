package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problemas dos três corpos", 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));
    }*/

    }

    static class Livro {
        private final String nome;
        private final Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;

        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }
}