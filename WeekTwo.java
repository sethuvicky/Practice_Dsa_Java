//  Write a Program which takes input n and prints the below pattern  
import java.util.Scanner;
class WeekTwo{
 public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
                System.out.println(" ");

        }
    }
}

