public class ProfessorIntegral extends Professor{
    private double salario;
    
    public ProfessorIntegral(String n, double s){
        super(n);
        this.setSalario(s);
    }
    
    public void setSalario(double s){
        this.salario = s;
    }
    public double getSalario(){
        return this.salario;
    }
    
    public double calcularSalarioLiquido(){
        return this.getSalario() * 0.89;
    }
}
