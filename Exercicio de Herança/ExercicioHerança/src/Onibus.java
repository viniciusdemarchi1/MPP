
public class Onibus extends Veiculo {
    private int qtdePassageiros;

    public Onibus() {
        super();
    }

    public Onibus(String nome, String fabricante, double precoVenda , int qtdePassageiros) {
        super(nome, fabricante, precoVenda);
        this.qtdePassageiros = qtdePassageiros;
    }

    public int getQtdePassageiros() {
        return qtdePassageiros;
    }

    public void setQtdePassageiros(int qtdePassageiros) {
        this.qtdePassageiros = qtdePassageiros;
    }

    
    public double calcularIpva(){
        double ipva = getPrecoVenda() * 1.5;
        
        return ipva;
        
        
    }
    
    
    
    
    
    @Override
    public String toString() {
        return "Onibus";
    }
    
    
    
    
}
