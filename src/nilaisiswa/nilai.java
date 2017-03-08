package nilaisiswa;
import java.util.Scanner;
public class nilai {
    public nilai(String nama, int nilai) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in);
         
         System.out.print("Masukkan Nama Anda :");    
         String nama = scan.next();
         System.out.print("Masukkan Nilai Anda :");    
         int nilai = scan.nextInt();
        
        nilai siswa = new nilai (nama,nilai);
      
        System.out.println("============");
        System.out.println("Nama  :"+nilai.getNama());
        System.out.println("Nilai :"+nilai.getNilai());
        System.out.println("Grade :"+nilai.hitungGrade());      
          }
}