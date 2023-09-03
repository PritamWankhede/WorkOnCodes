import java.util.*;
 class Pallindrome
  {
    public static void main(String args[])
    {
      Scanner src=new Scanner(System.in);
     int n = src.nextInt();
     int temp=n;
       int a=0;
      int rev=0;
       while(n>0)
       { 
         a=n%10;
         rev = (rev*10)+ a;
         n=n/10;
       }
   if(temp==rev)
  {
    System.out.println("Pallindrome Number");
   }
  else
  {
   System.out.println("Not Pallindrome");
  }
 }
}      