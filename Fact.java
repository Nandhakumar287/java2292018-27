import java.io.*;
import java.util.*;
  public class Fact{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Range:");
    int range=sc.nextInt();
    for(int i=0;i<range;i++)
    {
    if(range%i==0)
    {
    System.out.println(i);
    }
    }
   }
  } 
