
package pkgif.pkgelse.program;

import java.util.Scanner;


public class AvarageorMaximum {
    public static void main(String[] args) {  
    Scanner input=new Scanner(System.in);
    char ch;
    int a,b,c;
    float f;
        System.out.println("Press A for avarage and M for maximum: ");
        ch=input.next().charAt(0);
        System.out.println("Enter 3 Numbers:");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        
        if(ch=='a'||ch=='A')
        {
            f=(a+b+c)/3;
            System.out.println("Avarage is: "+f);
        }
        else if(ch=='m'||ch=='M')
        {
            if(a>b && a>c)
            {
                System.out.println(a+" is maximum");
            }
            else if(b>a && b>c)
            {
                System.out.println(b+" is maximum");
            }
            else if(c>a && c>b)
            {
                System.out.println(c+" is maximum");
            }
            else
            {
                System.out.println("Invalid");
            }
        }
        else
        {
            System.out.println("Invalid");
        }
        
        
        
        
    
    }           
}
