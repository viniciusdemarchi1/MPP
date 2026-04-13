public class Supervisor extends Empregado {

    public Supervisor() {
    }

    public Supervisor(String nome, int tempo) {
        super(nome, tempo);
    }

    @Override
    public void calcularSalario() {
        double salarioBase = 10000;
        
        if(getTempo() >=5 ){
            salarioBase = salarioBase * 1.2;
        }
        this.salario = salarioBase;
        
        }
    
}
