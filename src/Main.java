public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", "12345");

        Membro membro1 = new Membro("Kaike Sousa", 10, "kaike.cyw@email.com");

        biblioteca.adicionarLivro(livro1);

        biblioteca.registrarMembro(membro1);

        biblioteca.registrarEmprestimo(livro1, membro1, "11/03/2026");
    }
}