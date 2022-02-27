import java.sql.Array;
import java.util.ArrayList;

public class soalno6 {

//soal no6 dengan perintah add(0,e),add(2,f),add(3,g),add(4,h),add(6,h),add(-3,j)
    public static void main(String[] args) {
        
        ArrayList<String> namabelakang = new ArrayList<String>();
        namabelakang.add("e");
        namabelakang.add("n");
        namabelakang.add("y");
        namabelakang.add("a");

        namabelakang.add(0,"e");
        System.out.println(namabelakang);

        namabelakang.add(2,"f");
        System.out.println(namabelakang);

        namabelakang.add(3,"g");
        System.out.println(namabelakang);

        namabelakang.add(4,"h");
        System.out.println(namabelakang);

        namabelakang.add(6,"h");
        System.out.println(namabelakang);

        namabelakang.add(-3,"j");
        System.out.println(namabelakang);


    }
    
}
