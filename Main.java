import java.util.Scanner;
// Prob 1:

// Write a program which takes two values x and y. Prints x for y number of times.
 
class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
       
       for(int i = 1; i<=y;i++){
           System.out.println(x);
       } 
        
    }
}


import java.util.Scanner;
// Prob 2:
// Write a program to take x and print multiples of x till 1000.

class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int x = scan.nextInt();
  
        for(int i =0; i*x<=1000;i++){
            System.out.println(i*x);
        }
    }
}

import java.util.Scanner;
// Prob 3:
// Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.


class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String firstName = scan.next();
        String lastName = scan.next();
        int n = scan.nextInt();
        for(int i =0;i<n;i++){
        System.out.println(firstName+lastName);
        }
   
    }
}
