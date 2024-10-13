import java.util.Scanner;
import java.lang.String;
public class string_palindrome {
    public static boolean isPalindrome(String input) {
        
        int i=0;
        int j=input.length()-1;
        while(i<j){
            if(input.charAt(i)!=input.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if(isPalindrome(input)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
