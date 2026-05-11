
public class DiretorServico extends AuxiliarAdministrativo{

    public DiretorServico() {
        super();
    }

    public DiretorServico(int matricula, String nome) {
        super(matricula, nome);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); 
        
        
        setSalario(getSalario() *1.5);
        
        
        
    }

    @Override
    public String toString() {
         String resposta = String.format("DirServ: %d - %s - R$ %.2f",  getMatricula(), getNome(), getSalario());
       
       return resposta;
    }
    
    
    
    
}
