import java.util.Scanner;

public class RpadLpad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "496";
        System.out.println("String : "+str);
        System.out.println("Enter pading character");
        String paddingstr = sc.nextLine();
        System.out.println("Enter length of the result string : ");
        int len = sc.nextInt();

        if(str.length() >= len){
            System.out.println("padding is not possible !!");
        }
        
        int padLength = len - str.length();

        StringBuilder Rpad = new StringBuilder();
        Rpad.append(str);
        Rpad.append(paddingstr.repeat(padLength));
        System.out.println("Right padding = "+Rpad.toString());

        StringBuilder Lpad = new StringBuilder();
        Lpad.append(paddingstr.repeat(padLength));
        Lpad.append(str);
        System.out.println("Left padding = "+Lpad.toString());

        sc.close();
    }
}
