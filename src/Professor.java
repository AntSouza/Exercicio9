public abstract class Professor {
    private String nome;
    
    public Professor(String n){
        this.setNome(n);
    }
    
    public void setNome(String n){
        this.nome = n; 
    }
    public String getNome(){
        return this.nome;
    }
    public abstract double calcularSalarioLiquido();    
}