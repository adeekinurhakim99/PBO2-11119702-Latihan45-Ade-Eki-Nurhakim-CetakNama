/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cetaknama;
import java.util.Scanner;
/**
 *
 * @author Ekiw
 */
public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        Scanner i = new Scanner(System.in);
        System.out.println("===== Aplikasi Pencetak Nama =====");
        System.out.println("Masukan Nama Anda : ");
        p.setNama(i.nextLine());
        System.out.println("Mau Cetak Nama Berapa Kali : ");
        p.setJmlCetak(i.nextInt());
        System.out.println("Hasil Cetak : "+p.getNama());
        p.cetak();
    }
}
