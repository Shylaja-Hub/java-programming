import java.util.Scanner;
public class bmicalculate {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.print("enter your Weight: ");
       float weight = sc.nextFloat();
       System.out.print("enter your Height : ");
       float height = sc.nextFloat();
       float bmi = weight/(height*height);
       System.out.printf("BMI : "+ "%.2f  ",bmi);

       if(bmi<18.5){
        System.out.println("category : UnderWeight");
       }
       else if(18.5<=bmi && bmi<24.9){
        System.out.println("category : Normal Weight");
       }
       else if(25<= bmi && bmi< 29.9){
        System.out.println("category : Over Weight");
       }
       else if(30 < bmi){
        System.out.println("category : Obesity");
       }
        
       }
    }

