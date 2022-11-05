
package toni.projetopessoas;

public class ProfessorHorista extends Professor {
   private float valorHora;
   private float numeroHoras;
    
    public ProfessorHorista(){
    }
    public ProfessorHorista(float valorHora, float numeroHoras, String nome, int matricula) {
        super(nome, matricula);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(float numeroHoras) {
        this.numeroHoras = numeroHoras;
    }
   
    public float getSalario(){
        return this.numeroHoras * this.valorHora;
    }
}
