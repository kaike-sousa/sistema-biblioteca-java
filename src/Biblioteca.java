import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros = new ArrayList<>();
    ArrayList<Membro> membros = new ArrayList<>();
    ArrayList<Emprestimo> emprestimos = new ArrayList<>();


    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }


    public void removerLivro(Livro livro) {
        livros.remove(livro);
        System.out.println("Livro removido.");
    }


    public void registrarMembro(Membro membro) {
        membros.add(membro);
        System.out.println("Membro registrado.");
    }


    public void registrarEmprestimo(Livro livro, Membro membro, String data) {
        Emprestimo emp = new Emprestimo(livro, membro, data);
        emprestimos.add(emp);
        System.out.println("Empréstimo registrado.");
    }


    public void devolverLivro(Emprestimo emprestimo) {
        emprestimos.remove(emprestimo);
        System.out.println("Livro devolvido.");
    }
}