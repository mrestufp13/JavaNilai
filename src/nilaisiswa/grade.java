package nilaisiswa;

public class grade {
	 //class nilai
    private String nama;
    private char grade;
    private int nilai;
    
  public void Nilai(String n,int m){  //method konstruktor
        nama=n;    
        nilai=m;
     }
 
   public String getNama(){ //method kirim nama
    return nama;
      }
         
      public int getNilai(){        //method kirim nilai  
          return nilai;
      }
      
      public char hitungGrade(){  //method seleksi grade        
        if ((nilai>=80) && (nilai<=100)) 
            grade='A';
        else if ((nilai>=70) && (nilai<80)) 
            grade='B';
        else if ((nilai>=60) && (nilai<70)) 
            grade='C';
        else if ((nilai>=50) && (nilai<60)) 
            grade='D';
        else
            grade='E';
        
        return grade;
      }

}
