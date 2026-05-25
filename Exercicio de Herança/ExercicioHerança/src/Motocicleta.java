


public class Motocicleta extends Veiculo {
 private int cilindradas;
 
    public Motocicleta() {
        super();
    }

    public Motocicleta(String nome, String fabricante, double precoVenda,int cilindradas) {
        super(nome, fabricante, precoVenda);
        this.cilindradas = cilindradas; 
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
       return "Motocicleta";
    }
    
    public double calcularIpva(){
        double ipva = getPrecoVenda() * 0.02;
        
        return ipva;
        
        
    }
    
    
    
}
