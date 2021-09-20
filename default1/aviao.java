public class aviao implements voar,pousa {
    public void voando() {
        System.out.println("O avião esta voando.");
    }
    public void pousar(){
        pousa.super.pousar();
    }
}
