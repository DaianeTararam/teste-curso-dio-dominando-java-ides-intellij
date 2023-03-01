package br.com.dio;

public class PrimeiroPrograma {
    public void main(String[] args) {
        /*Gato gato = new Gato()
        System.out.println(gato);*/

        Livro livro1 = new Livro("O problemas dos três corpos", 300);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a+b));
    }*/

    }

    class Livro {
        private String nome;
        private Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
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