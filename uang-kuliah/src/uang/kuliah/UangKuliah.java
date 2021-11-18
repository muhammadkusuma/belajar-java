package uang.kuliah;
import java.util.Scanner;
public class UangKuliah {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int kode_jur;
        int uang_spp;
        int uang_pratikum;
        int hasil;
        hasil = uang_spp+uang_pratikum;
        System.out.print("Masukan Kode Jurusan:");
        kode_jur=input.nextInt();
        if (kode_jur==1){
            uang_spp=5000000; uang_pratikum=100000;}
        else {
            uang_spp=1132323123;
        }
        System.out.println("Uang SPP + Uang Pratikum ="+hasil);
    }
    
}