
public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    private int meses;
    
    public Pessoa(){
       nome = "";
       sexo = "";
       idade = 0;
       meses = 0;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
    
    
    public void Calcular(){
        meses = idade*12;
        
    }
    
}
