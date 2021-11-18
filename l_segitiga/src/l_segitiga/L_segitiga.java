package l_segitiga;
import java.util.Scanner;
public class L_segitiga {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan alas : ");
        double alas=input.nextDouble();
        System.out.print("Masukan tinggi : ");
        double tinggi=input.nextDouble();
        double L=0.5*alas*tinggi;
        System.out.println("Luas segitiga adalah = "+L+" cm");
    }
    
}
