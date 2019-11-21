public class Motor extends Produto{
    private double rpm;
    private double potencia;
    
    public Motor(String c, String n, String d, double p, double r, double po){
        super(c,n,d,p);        
        this.setRPM(r);
        this.setPotencia(po);
    }
    
    public void setRPM(double r){
        this.rpm = r;
    }
    public double getRPM(){
        return this.rpm;
    }
    
    public void setPotencia(double po){
        this.potencia = po;
    }
    public double getPotencia(){
        return this.potencia;
    }
    public double calcularPrecoFinal(){
        return getPreco() - (getPreco() * 0.05);
    }
    public String imprimirDados(){
        return ("Codigo: "+getCod()+" Nome:"+getNome()+" Descricao:"+getDescricao()+" Preco:"+getPreco()
                +" RPM do motor:"+getRPM()+" Potencia do motor:"+getPotencia());
    }
}
