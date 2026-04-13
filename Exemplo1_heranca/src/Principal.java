public class Principal {

  
    public static void main(String[] args) {
       
       Supervisor objeto = new Supervisor();
       
       objeto.setNome("Vinicius");
       objeto.setTempo(10);
       objeto.calcularSalario();
       
       System.out.println("O salario é do Supervisor " + objeto.getSalario());
       
       
       
       
       Gerente objeto2 = new Gerente("Victor", 4);
       objeto2.calcularSalario();
       System.out.println("O salario é do Gerente " + objeto2.getSalario());
       
    }
    
}
