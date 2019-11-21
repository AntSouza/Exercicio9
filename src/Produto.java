public abstract class Produto {
    private String cod;
    private String nome;
    private String descricao;
    private double preco;
    
    public Produto(String c, String n, String d, double p){
        this.setCod(c);
        this.setNome(n);
        this.setDescricao(d);
        this.setPreco(p);        
    }
    
    public void setCod(String c){
        this.cod = c;
    }
    public String getCod(){
        return this.cod;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setDescricao(String d){
        this.descricao = d;
    }
    public String getDescricao(){
        return this.descricao;
    }
    
    public void setPreco(double p){
        this.preco = p;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public abstract double calcularPrecoFinal();
    public abstract String imprimirDados();
}
