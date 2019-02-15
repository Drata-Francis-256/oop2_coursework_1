/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jr;

import java.util.Scanner;

/**
 *
 * @author DRATA FRANCIS
 */
public class Jr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mark[] = new int [6];
     int i;
     int u = 0;
     String grd;
     float sum=0, avg;
     Scanner scan = new Scanner(System.in);
     System.out.println("enter your 1st course");
     String a =scan.next();
     System.out.println("entered" +a);
     
     System.out.println("enter your 2nd course");
     String b =scan.next();
     System.out.println("entered" +b);
     
     System.out.println("enter your 3rd course");
     String c =scan.next();
     System.out.println("entered" +c);
     
     System.out.println("enter your 4th course");
     String d =scan.next();
     System.out.println("entered" +d);
     
     System.out.println("enter your 5th course");
     String e =scan.next();
     System.out.println("entered" +e);
     
     System.out.println("enter your 6th course");
     String f =scan.next();
     System.out.println("entered" +f);
     
     System.out.print("enter your marks plx");
     for (i=0; i<6; i++)
     {
         mark[i] = scan.nextInt();
         sum = sum + mark[i];
     }
     avg = sum/6;
     System.out.print("your average grade is" +avg);
     
     if(avg>=80 && avg<=100){
         
         grd="A";
         System.out.println("A");
   
     }
     else if(avg>=70&&avg<80){
         grd="B";
         System.out.println("B");
     }
     else if(avg>=60&&avg<70){
         grd="C";
         System.out.println("C");
     }
     else if(avg>=50&&avg<70){
         grd="D";
         System.out.println("D");
     }
     else if(avg>40&&avg<50){
         System.out.println("F");
     }
     else{
         System.out.println("invalid");
     }
    }
    
}
