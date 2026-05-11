
public class Principal3 {

    public static void main(String[] args) {
     FolhaPagamento folha = new FolhaPagamento();
     
     
     folha.adicionarFuncionario(new AuxiliarAdministrativo(1001,"Marcelo"));
     folha.adicionarFuncionario(new DiretorServico(1002,"Danilo"));
     
     folha.adicionarFuncionario(new Professor(1003,"Henrique", 20));
     folha.adicionarFuncionario(new Coordenador(1006,"Guilherme", 40,2));
     folha.adicionarFuncionario(new DiretorEscola(1005,"Gustavo",20));
     
     System.out.println(String.format("O valor total da folha de pagamento é %2f", folha.calcularTotalSalarios()));
     
     
     System.out.println("\nAbaixo serao exibidos os funcionarios");
     folha.ExibirFuncionarios();
    }
    
}
