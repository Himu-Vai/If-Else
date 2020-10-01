
package pkgif.pkgelse.program;

import java.util.Scanner;


public class Maximum {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st Nmuber: ");
        a=input.nextInt();
        System.out.println("Enter wnd Number: ");
        b=input.nextInt();
        if(a>b)
        {
            System.out.println(a+" is greater than" +b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
    
    }
}
