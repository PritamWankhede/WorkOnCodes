
 
  import java.util.Scanner;
  class Factorial{
 
  public static void main(String[] args){
    int a,fact=1;
     System.out.println("Enter any Number : ");
    Scanner r = new Scanner(System.in) ;
    a=r.nextInt();
    for(int i=1;i<=a;i++)
    {
      fact=fact*i;
    }
      System.out.print(fact);
  }
}