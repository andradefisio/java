
package toni.projetopessoas;

public class Professor {
    private String nome;
    private int matricula;

    public Professor(){
    }
    public Professor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public float getSalario(){
        return 0;
    }
 
    
}
