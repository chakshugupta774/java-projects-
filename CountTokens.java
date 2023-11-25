import java.util.StringTokenizer;

public class CountTokens {
    public static void main(String[] args) {
        // Creating a StringTokenizer 
        StringTokenizer str_arr 
            = new StringTokenizer( 
                "My name is chakshu Gupta "); 
  
        // Counting the tokens 
        int count = str_arr.countTokens(); 
        System.out.println("Total number of Tokens: "+ count); 
  
        // Print the tokens 
        for (int i = 0; i < count; i++) 
            System.out.println("token at [" + i + "] : " + str_arr.nextToken()); 
    }
}
