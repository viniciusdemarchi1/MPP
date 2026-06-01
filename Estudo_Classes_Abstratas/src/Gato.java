
public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
     String msg = String.format("O Gato %s faz Miauuuuu !",getNome());
        System.out.println(msg);
    }
    
    
    
}
