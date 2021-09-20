public class App {
    public static void main(String[] args) {
        new Pessoa().estado();
    }
      
      interface Crianca {
        default void estado() {
          System.out.println("A criança está com sono.");
        }
      }
      
      interface Adulto extends Crianca {
        default void estado() {
          System.out.println("O adulto está com fome.");
        }
      }
      
      static class Pessoa implements Adulto {
        
      }  
}
