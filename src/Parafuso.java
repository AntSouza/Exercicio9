public class Parafuso extends Produto{
    private double comprimento;
    private double diametro;
    
    public Parafuso(String c, String n, String d, double p, double co, double di){
        super(c,n,d,p);
        this.setComprimento(co);
        this.setDiametro(di);
    }
    
    public void setComprimento(double c){
        this.comprimento = c;
    }
    public double getComprimento(){
        return this.comprimento;
    }
    
    public void setDiametro(double d){
        this.diametro = d;
    }
    public double getDiametro(){
        return this.diametro;
    }
    
    public double calcularPrecoFinal(){
        return getPreco() + (getPreco() * 0.15);    
    }   
        
    public String imprimirDados(){
        return ("Codigo: "+getCod()+" Nome:"+getNome()+" Descricao:"+getDescricao()+" Preco:"+getPreco()
                +" Comprimento do parafuso:"+getComprimento()+" Diametro do parafuso:"+getDiametro());
    }    
}
