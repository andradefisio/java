/*
Implemente uma classe Professor cujas propriedades são: matrícula e nome. 
Nesta classe devem ser implementados os métodos construtores, getters, setters
e um método para calcular o salário do professor. Em seguida, implemente uma 
outra classe denominada ProfessorConcursado que herde as características da
classe Professor. Faça o mesmo para outra classe denominada ProfessorHorista. 
Para ambas as classes implemente os métodos setters e getters também. 
Ainda no caso da classe ProfessorHorista você deve implementar um método 
que calcule o salário em função do valor da hora e da quantidade de horas. 
Para finalizar, implemente uma classe chamada TesteProfessor e exiba o salário
e matricula do professor concursado e do professor horista. 
*/
package toni.projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        System.out.println("Exercício POO - Classses e Objetos (ex. instanciar Professor)");
        
        ProfessorConcursado profconcur = new ProfessorConcursado();
        ProfessorHorista profhora = new ProfessorHorista();
        
        profconcur.setMatricula(2011); 

        profconcur.setNome("Julio"); 

        profconcur.setSalario(1000); 

        profhora.setMatricula(2021); 
    
        profhora.setNome("João"); 

        profhora.setValorHora(70); 

        profhora.setNumeroHoras(15); 
        
        System.out.println("Salario Professor Concursado = "+profconcur.getSalario()); 

        System.out.println("Matrícula Professor Horista = "+profhora.getMatricula()); 

        System.out.println("Salario Professor Concursado = "+profconcur.getSalario()); 

        System.out.println("Matrícula Professor Horista = "+profhora.getMatricula()); 

    }
}
