import java.util.ArrayList;

public class soalno5 {

//soal no5 dengan perintah remove(0),remove(3),remove(2)
/* pada soal diatas saat dilakukan secara berurut yang terdiri dari 4 elemen, 
jika pada saat remove dilakukan dari index terkecil ke terbesar maka 
hasil runnya akan ERROR tidak ditemukan indexsnya
*/
    public static void main(String[] args) {
        
      ArrayList namabelakang = new ArrayList ();
      namabelakang.add("E");
      namabelakang.add("N");
      namabelakang.add("Y");
      namabelakang.add("A");

      namabelakang.remove(3);
      namabelakang.remove(2);
      namabelakang.remove(0);
      
     System.out.println(namabelakang);
    }
    
}
