package data_pribadi;
import java.util.Scanner;
public class Data_pribadi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan Nama: ");
        String nama=input.nextLine();
        System.out.print("Masukan NIM: ");
        String nim=input.nextLine();
        System.out.print("Masukan Alamat: ");
        String alamat=input.nextLine();
        System.out.print("Masukan Jurusan: ");
        String jurusan=input.nextLine();
        System.out.print("Masukan Semester: ");
        String semester=input.nextLine();
        System.out.println();
        System.out.println("NAMA        : "+nama);
        System.out.println("NIM         : "+nim);
        System.out.println("ALAMAT      : "+alamat);
        System.out.println("JURUSAN     : "+jurusan);
        System.out.println("SEMESTER    : "+semester);
    }
    
}
