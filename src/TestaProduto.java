public class TestaProduto {
    public static void main(String[] args){
        Motor motor1 = new Motor("001","Yellow","Motor primário",420.50,13500,450);
        Parafuso parafuso1 = new Parafuso("002","Red","Parafuso fino",3.0,12,2.5);
        
        
        System.out.println(motor1.imprimirDados());
        System.out.println(parafuso1.imprimirDados());
        System.out.println("Preço final do motor: "+motor1.calcularPrecoFinal());
        System.out.println("Preço final do parafuso: "+parafuso1.calcularPrecoFinal());
    }
}
