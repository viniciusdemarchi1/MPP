
public class DiretorEscola extends Professor {

    public DiretorEscola() {
        super();
    }

    public DiretorEscola(int matricula, String nome, int cargaHoraria) {
        super(matricula, nome, cargaHoraria);
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario();
        
         
        double rea = getSalario() *1.5 + 2500;
        
        
        setSalario(rea);
    }

    @Override
    public String toString() {
        String resposta = String.format("Diretor: %d - %s - R$ %.2f",  getMatricula(), getNome(), getSalario(),getCargaHoraria());
       
       return resposta;
    }
    
    
    
    
}
