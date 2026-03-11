public class Emprestimo {

    Livro livro;
    Membro membro;
    String dataEmprestimo;

    public Emprestimo(Livro nome, Membro membro, String dataEmprestimo){
        this.livro = nome;
        this.membro = membro;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void exibirEmprestimo(){
        System.out.println("Livro Emprestado: " + livro);
        System.out.println("Membro: " + membro);
        System.out.println("Data do Empréstimo: " + dataEmprestimo);
    }
}
