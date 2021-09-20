package ex2_static;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        System.out.print("Insira dois valores para serem calculado: ");
        Scanner scan = new Scanner(System.in);
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        System.out.println(Calculo.area(b,h));
        scan.close();
    }
}
