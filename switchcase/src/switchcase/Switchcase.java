package switchcase;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        int bil;
        Scanner input=new Scanner(System.in);
        System.out.println("Masukkan sebuah bilangan 1-7 :");
        bil=input.nextInt();
        
        switch (bil)
        {
        case 1 : System.out.println("Senin");
		break;
        case 2 : System.out.println("Selasa");
		break;
        case 4 : System.out.println("Kamis");
		break;
        case 5 : System.out.println("Jumat");
		break;
        case 6 : System.out.println("Sabtu");
		break;
        case 7 : System.out.println("Minggu");
        default : System.out.println("Bilangan yg anda masukan salah");
        }

    }
    
}
