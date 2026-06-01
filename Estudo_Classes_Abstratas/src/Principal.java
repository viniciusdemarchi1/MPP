
public abstract class Principal {
   public static void main(String[]args){
       System.out.println("Estudo de Classes Abstratas");
       
     Cachorro objeto = new Cachorro("totó");
     
       System.out.println("Ola" + objeto.getNome());
       objeto.emitirSom();
       
       (new Gato("Pandora")).emitirSom();
       (new Pinguim("Oliver")).emitirSom();
   }
}
