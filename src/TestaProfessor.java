public class TestaProfessor {
    public static void main(String[] args){
        ProfessorIntegral pi = new ProfessorIntegral("Yellow", 8200);
        ProfessorHorista ph = new ProfessorHorista("Red", 4100);  
        
        System.out.println(pi.calcularSalarioLiquido());
        System.out.println(ph.calcularSalarioLiquido());
       
    }
}
