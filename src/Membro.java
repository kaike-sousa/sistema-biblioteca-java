public class Membro {

    String nome;
    int id;
    String email;

    public Membro(String nome, int id, String email){
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public void exibirMembro(){
        System.out.println("Nome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
    }
}
