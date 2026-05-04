
public class Professor extends Funcionario{
    private int cargaHoraria;

    public Professor() {
        super();
    }

    public Professor(int matricula, String nome, int cargaHoraria) {
        super(matricula, nome);
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public void calcularSalario() {
        super.calcularSalario(); 
        
        double salProfessor = getCargaHoraria()* 50.0*4.5;
       setSalario(salProfessor);
    }

    @Override
    public String toString() { 
      String resposta = String.format("AuxAdm: %d - %s - R$ %.2f",  getMatricula(), getNome(), getSalario());
       
       return resposta;
    }
    
    
    
    
    
    
    
    
    
}
