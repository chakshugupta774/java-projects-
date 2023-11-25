import java.util.Scanner;

public class CountAlphabets {
    public static void main(String[] args) {
        int upper=0 ,lower=0, digit=0, special=0;
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch>='A' && ch<='Z')
                upper++;     
            else if(ch>='a' && ch<='z')
                lower++;
            else if(ch>='0' && ch<='9')
                digit++;
            else
                special++;          
        }

        System.out.println("UpperCase letters : "+upper);
        System.out.println("LowerCase letters : "+lower);
        System.out.println("Digits : "+digit);
        System.out.println("Special Symbols : "+special);

        sc.close();
    }
}
