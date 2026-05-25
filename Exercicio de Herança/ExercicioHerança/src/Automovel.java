
public class Automovel extends Veiculo {
    private int potencia;

    public Automovel() {
        super();
    }

    public Automovel(String nome, String fabricante, double precoVenda,int potencia) {
        super(nome, fabricante, precoVenda);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
    public double calcularIpva(){
        double ipva = getPrecoVenda() * 4.0;
        
        return ipva;
        
        
    }
    
    
    @Override
    public String toString() {
        return "Automovel";
    }
    
    
    
    
    
}
