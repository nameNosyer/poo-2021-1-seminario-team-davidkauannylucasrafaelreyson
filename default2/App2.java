public class App2 {
    public static void main(String[] args) {
        new Pessoa().estadoCrianca();
        new Pessoa().estadoAdulto();
    }
      
      interface Crianca {
        default void estadoCrianca() {
          System.out.println("A criança está com sono.");
        }
      }
      
      interface Adulto{
        default void estadoAdulto() {
          System.out.println("O adulto está com fome.");
        }
      }
      
      static class Pessoa implements Crianca, Adulto {
        
      }
}
