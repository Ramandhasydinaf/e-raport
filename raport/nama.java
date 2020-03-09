
package raport;
import java.util.Scanner;

class nama {
    
         private String nama;
         private String kelas;
         public void Setnama (){
             Scanner gua= new Scanner (System.in);
             System.out.print("Nama:");
             nama = gua.nextLine();
             this.nama = nama;
         }
         public void Setkelas (){
             Scanner gua = new Scanner (System.in);
             System.out.print("Kelas:");
             kelas = gua.nextLine();
             this.kelas = kelas;
         }
         public String Getnama(){
             return this.nama;
         }
         public String Getkelas(){
             return this.kelas; 
         }}

