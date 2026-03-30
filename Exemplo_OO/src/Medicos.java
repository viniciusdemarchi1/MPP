
public class Medicos {
   private String nome;
   private double vconsulta;
   private int qtdeconsulta;
   private double salario;
   
   
   
   
   public Medicos(){
       nome = "";
       vconsulta = 0;
       qtdeconsulta = 0;
       salario = 0;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVconsulta() {
        return vconsulta;
    }

    public void setVconsulta(double vconsulta) {
        this.vconsulta = vconsulta;
    }

    public int getQtdeconsulta() {
        return qtdeconsulta;
    }

    public void setQtdeconsulta(int qtdeconsulta) {
        this.qtdeconsulta = qtdeconsulta;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    public void calcularSal(){
         salario = this.qtdeconsulta * this.vconsulta;
    }
}
