import java.util.Locale;
import java.util.Scanner;

public class So_lan_xuat_hien_ki_tu_trong_chuoi {
    public static void main(String[] args) {
        int count=0;
        String str="what is life hahaahahah";
        String lowerCase= str.toLowerCase();
        Scanner scanner=new Scanner(System.in);
        char word='h';
        for (int i = 0; i < lowerCase.length(); i++) {
if (word==lowerCase.charAt(i)){
    count++;
}
        }
        System.out.print("số kí tự giống kí tự nhập  vào trog mảng là: "+count);
    }
}
