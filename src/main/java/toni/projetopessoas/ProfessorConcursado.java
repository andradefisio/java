
package toni.projetopessoas;

public class ProfessorConcursado extends Professor {
    private float salario;

    public ProfessorConcursado(){
        
    }
    public ProfessorConcursado(float salario, String nome, int matricula) {
        super(nome, matricula);
        this.salario = salario;
    }

    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
}
