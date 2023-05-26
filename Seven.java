 import java.util.Scanner;
public class Seven
{
  public static void main(String args[])
  {
    int i,n,big=0,small=0,equal=0;
    int[] anArray=new int[5];
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter elements of the array: ");
    for(i=0;i<anArray.length;i++)
    {
      anArray[i]=obj.nextInt();
    }
    System.out.println("Elements of the array are: ");
    for(i=0;i<anArray.length;i++)
    {
      System.out.println(anArray[i]+" ");
    }
    System.out.println("Enter an element to compare: ");
    n=obj.nextInt();
    for(i=0;i<anArray.length;i++)
    {
      if(anArray[i]>n)
         big++;
      else if(anArray[i]<n)
         small++;
      else
         equal++;
    }
    System.out.println("Number of element(s) greater are: "+big);
    System.out.println("Number of element(s) smaller are: "+small);
    System.out.println("Number of element(s) equal are: "+equal);
  }
}