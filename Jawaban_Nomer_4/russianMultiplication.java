import java.io.*;
 
public class russianMultiplication
{
 public static void main(String[] args)
 {
  //get the input numbers
  Console con=System.console();
  System.out.print("Input Bilangan 1: ");
  int num1=Integer.parseInt(con.readLine());
  
  System.out.print("Input Bilangan 2: ");
  int num2=Integer.parseInt(con.readLine());
  System.out.println(""); 
  int hasil=0;

  while(num1!=0)
  {
   if(num1%2!=0) {
    hasil=hasil+num2;
   System.out.print("Proses Ganjil \t");
   System.out.println("\t"+num1+"\t"+num2+"\t");
   }
   else if (num1%2==0){
    System.out.print("Proses Genap \t");
    System.out.println("\t"+num1+"\t"+num2+"\t");
  }
   num2=num2*2;
   num1=num1/2;
  }
  System.out.println(""); 

  System.out.println("Sum Genap  : " + num2);
  System.out.println("Sum Ganjil : " + hasil); 

  System.out.println("");
  System.out.println("99 * 101 = " + hasil); 
 }
}
 
