
public class Coordenador extends Professor{
    private int qtdTurmas;

    public Coordenador() {
        super();
        
    }

    public Coordenador(int matricula, String nome, int cargaHoraria, int qtdTurmas) {
        super(matricula, nome, cargaHoraria);
        this.qtdTurmas = qtdTurmas;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); 
        
        double novosal = getSalario() + 150 * getQtdTurmas();
        
        
        setSalario(novosal);
        
    }
public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }
    
    
    
    @Override
    public String toString() {
        String resposta = String.format("Coordenador: %d - %s - R$ %.2f",  getMatricula(), getNome(), getSalario(),getCargaHoraria(), getQtdTurmas());
       
       return resposta;
    }

    
    
    
    
    
}
