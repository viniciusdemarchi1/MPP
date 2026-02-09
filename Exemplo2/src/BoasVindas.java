import javax.swing.JOptionPane;

public class BoasVindas 
{
    
 public static void main(String args[])
 {
    JOptionPane.showMessageDialog(null, "ola mundo");
    
    String nome;
    int idade;
    double altura;
    
    nome = JOptionPane.showInputDialog("Digite seu nome");
    idade = Integer.parseInt(JOptionPane.showInputDialog( "Digite sua idade") );
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura") );
    
    String mensagem = "*** Dados do Aluno" + "\nNome é " + nome + "\nIdade é " + idade + "\n é " + altura;
    
    JOptionPane.showMessageDialog( null,mensagem);
    
 }
    
    
        
}
