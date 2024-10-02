import java.util.Scanner;
public class bankmanagement {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your current bank balance:");
        int current_balance = sc.nextInt();
        System.out.print("Enetr your Withdrawval Amount:");
        int withdrawval_amount = sc.nextInt();
        float bank_balance = current_balance-withdrawval_amount;

        if(withdrawval_amount>current_balance){
            System.out.println("Error.insufficient balance");
        }
        else {
            System.out.println("Withdrawval Successfully.Now Balance :"+ bank_balance);
        }
    }
}
