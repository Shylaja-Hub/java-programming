import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits= sc.nextInt();
        int sum = 0;
        while (digits !=0) {
            sum += digits%10;
            digits = digits/10;
        }
        System.out.println(sum);
    }
    
}