public interface voar{
    void voando(); 
   default void pousar(){
       System.out.println("O avião pousou");

   }; 
}