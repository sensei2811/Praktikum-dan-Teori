package tugas1;
import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int hours,minutes,second,totdek;
     System.out.println("Jam = ");
     hours=input.nextInt();
     
     System.out.println("Menit = ");
     minutes=input.nextInt();
     
     System.out.println("Detik = ");
     second=input.nextInt();
     
     totdek=hours*3600+minutes*60+second;
System.out.println("Total Detik Jam Adalah = " +totdek);
    }
    
}
