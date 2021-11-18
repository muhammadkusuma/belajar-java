package kl_lingkaran;
import java.util.Scanner;
public class Kl_lingkaran {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Jari-jari : ");
        double r=input.nextDouble();
        double L,K;
        L=3.14*r*r;
        K=2*3.14*r;
        System.out.println("Luas Lingkaran adalah       : "+L+" cm");
        System.out.println("Keliling Lingkaran adalah   : "+K+" cm");
    }
    
}
