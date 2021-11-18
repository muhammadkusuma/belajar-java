package operator_aritmatika;
import java.util.Scanner;
public class Operator_aritmatika {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bilangan 1 : ");
        int bilA=input.nextInt();
        System.out.print("Bilangan 2 : ");
        int bilB=input.nextInt();
        int jumlah,kurang,kali,bagi,sisa;
        jumlah=bilA+bilB;
        kurang=bilA-bilB;
        kali=bilA*bilB;
        bagi=bilA/bilB;
        sisa=bilA%bilB;
        System.out.println();
        System.out.println("Hasil Operator Aritmatika");
        System.out.println("===========================");
        System.out.println("Jumlah  = "+jumlah);
        System.out.println("Kurang  = "+kurang);
        System.out.println("Kali    = "+kali);
        System.out.println("Bagi    = "+bagi);
        System.out.println("Sisa    = "+sisa);
        System.out.println("Press any key to continue ... ");
    }
    
}
