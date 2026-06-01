
public class Pinguim extends Animal{

    public Pinguim(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
       String msg = String.format("O Pinguim %s faz bray bray !",getNome());
        System.out.println(msg);
    }
    
    
    
    
}
