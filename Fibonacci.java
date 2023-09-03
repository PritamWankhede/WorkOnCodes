import java.util.*;
public class Fibonacci
{
  public static void main(String[] args)
  {
    int a=0,b=0,c=1;
    Scanner src=new Scanner(System.in);
    int num=src.nextInt();
    
    System.out.println("Fibonnaci Series is");
   for(int i=0;i<=num;i++)
    {
      a=b;
      b=c;
      c=a+b;
    System.out.println("Output is " + a);
    }
  }
}