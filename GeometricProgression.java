import java.util.*;
public class GeometricProgression {
                   public static void main(String[] args) {
					Scanner sc=new Scanner(System.in);
			System.out.println("enter the  value of a");		
					int a=sc.nextInt();
	    	System.out.println("enter the value of b");
	    	         int b=sc.nextInt();
System.out.println("enter the number of iterations to be performed");
                    int n=sc.nextInt();
                    System.out.println("GP");
                    double d=(a+Math.pow( 2, 0)*b);	
           System.out.print(d+",");
            for(int i=1;i<n;i++) {  	
            
            d=d+Math.pow(2, i)*b; 
            System.out.print(d+",");
            
            }                
                  
               }
            		   	             	   				
				}

