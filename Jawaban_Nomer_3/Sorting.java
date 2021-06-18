
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;

public class Sorting {
 private static int[] numbers;
 static public void InputNum()
{
 try{
  File file = new File("random.txt");
  BufferedReader read=new BufferedReader(new FileReader(file));
  String currentLine,currentline2="";
 while ((currentLine=read.readLine()) != null) 
 { 
  currentline2=currentline2 + currentLine+"\n";
 }
  String[]temp=currentline2.split("\\n");
  numbers=new int[temp.length];
  for (int i=0; i<temp.length;i++)
  {
   numbers[i]=Integer.parseInt(temp[i]);
  }
}
 catch (IOException e)
 {
 System.out.println(e.toString());
 }
}
 public static void main(String[] args)
 {
  InputNum();
  int[] insertValue, mergeValue;
  long insertTimeStart, insertTimeEnd, mergeTimeStart, mergeTimeEnd, timeMerge, timeInsert;
  mergeTimeStart = System.currentTimeMillis();
  Merge ms = new Merge(numbers);
  mergeTimeEnd = System.currentTimeMillis();
  insertTimeStart=System.currentTimeMillis();
  Insert is = new Insert(numbers);
  insertTimeEnd=System.currentTimeMillis();
  timeMerge = mergeTimeEnd­- mergeTimeStart;
  timeInsert=insertTimeEnd­- insertTimeStart;
  insertValue = is.getNum();
  mergeValue = ms.getNum();
  System.out.println("Insertion Sort");
  for(int i=0; i<insertValue.length; i++) 
  {
   if((i%10)==0)
   {
     System.out.println(insertValue[i]);
   }
   else
   {       
    System.out.println(insertValue[i] + "\t");
   }
  }
   System.out.println("\n");
   System.out.println("");
   System.out.println("Merge Sort");
   for(int i=0; i<insertValue.length; i++) 
   { 
    if((i%10)==0)
    {           
     System.out.println(mergeValue[i]);
    }   
    else
    {       
     System.out.println(mergeValue[i]+"\t");
    }
   }
   System.out.println("\n");
   System.out.println("Waktu Mulai: "+insertTimeStart+" detik");
   System.out.println("Waktu Akhir: "+insertTimeEnd+" detik");
   System.out.println("Waktu yang diperlukan untuk Insertion Sort = " + (timeInsert) + " detik ");
   System.out.println(" ");
   System.out.println("Waktu Mulai: "+mergeTimeStart+" detik");  
   System.out.println("Waktu Akhir: "+mergeTimeEnd+" detik");
System.out.println("Waktu yang diperlukan untuk Merge Sort     = " + (timeMerge)+ " detik ");
   }
}

class Merge {
 private int[] inputNum;
 private int[] helper;
 private int number;
 public Merge(int[] values)
 {
  this.inputNum = values;
  number = values.length;
  this.helper = new int[number];
  mergesort(0, number-1);
 }
 private void mergesort(int low, int high)
 {
  if(low < high)
  {
   int middle = low + (high-low)/2;
   mergesort(low, middle);
   mergesort(middle+1, high);
   merge(low, middle, high);
  }
 }
  private void merge(int low, int middle, int high)
  {
   for(int i=low; i<=high; i++)
   {
    helper[i] = inputNum[i];
   }
  int i=low;
  int j=middle+1;
  int k=low;
   while(i <= middle && j <= high)
   {
    if(helper[i] >= helper[j])
    {
     inputNum[k] = helper[i];
     i++;
    }
    else
    {
     inputNum[k] = helper[j];
     j++;
    }
    k++;
   }
   while(i<=middle)
   {
    inputNum[k]=helper[i];
    k++;
    i++;
   }
  }
 public int[] getNum()
 {
  return (inputNum);
 }
 }

class Insert {
 private int[] inputNum;
 public Insert(int[] values)
 {
  this.inputNum = values;
  Sorting();
 }
 void Sorting() 
 {
  int i, j, newValue;
  for (i = 1; i < inputNum.length; i++) 
  {
   newValue = inputNum[i];
   j = i;
   while (j > 0 && inputNum[j - 1] < newValue) 
   {
     inputNum[j]=inputNum[j-1];
     j--;
   }
   inputNum[j] = newValue;
  }
 }
public int[] getNum()
 {
  return (inputNum);
 }
}

class RandomNumbers {
 public static void main(String[] args) {
  int i;
  Random r = new Random();
  for (i = 1; i <= 50; i++) {
   System.out.println(r.nextInt(50) + 1);
  }
}
}

class DesNumbers {
 public static void main(String[] args) {
  int i;
  for (i = 50; i > 0; i--) {
   System.out.println(i);
  }
 }
}
