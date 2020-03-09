package raport;

public class Raport {

    public static void main(String[] args) {
       
        nama c = new nama();
       
       eraport1 a = new eraport1();
       eraport3 b= new eraport3();
       c.Setnama();
       c.Setkelas();
       
       System.out.println("<=OUTPUT=>");
       
       b.nama();
       
       System.out.println("Nama Siswa:"+c.Getnama());
        System.out.println("Kelas:"+c.Getkelas());
        System.out.println("=======================");
        
        a.nama(); 
    }
    
}
