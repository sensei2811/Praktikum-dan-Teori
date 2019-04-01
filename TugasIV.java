package tugasiv;
import java.util.Scanner;
public class TugasIV {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    String name,addres;
    int age;
    System.out.println("Nama = "); name = keyboard.next();
    System.out.println("Alamat = "); addres = keyboard.next();
    System.out.println("Umur = "); age = keyboard.nextByte();
    System.out.println("Saudara = " +name);
    System.out.println("Alamat = " +addres);
    System.out.println("Berumur = " +age+ "Tahun");
    }
    
}
