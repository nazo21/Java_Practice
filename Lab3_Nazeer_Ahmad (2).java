//Nazeer Ahmad  
// Read Three vertices x and y 
import java.util.Scanner;
import java.lang.Math;

public class Lab3_Nazeer_Ahmad{
  public static void main(String[] args){
         Scanner myInput = new Scanner(System.in);
         
         // Input the first vertices
         System.out.println("Input the first x & y vertices");
         double x1 = myInput.nextDouble();
         double y1 = myInput.nextDouble();
         //double e1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));

         System.out.println("Input the second x & y vertices");
         double x2 = myInput.nextDouble();
         double y2 = myInput.nextDouble();
         //double e2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));

         System.out.println("Input the third x & y vertices");
         double x3 = myInput.nextDouble();
         double y3 = myInput.nextDouble();
         
         
         double e1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
         double e2 = Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
         double e3 = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
         
                 
         if(e1+e2 > e3 && e2+e3>e1 && e1+e3 > e2){
            System.out.print("The triangle Perimeter is ");
            System.out.println(e1+e2+e3);
         }else{
         
               System.out.println("There is an Error!!");
              }
        
    
  }
  

}


