// public class linear {

// }

import java.util.Scanner;

public class LinearSearch {
public static void main(String args[])
{
int[] arr = new int[5];
Scanner s = new Scanner(System.in);
System.out.print("Enter 5 Elements: "); 
for(int i=0; i<5; i++)
arr[i] = s.nextInt();
System.out.print("Enter an Element to Search: "); 
int num = s.nextInt();
int flag=0;
for (int j=0; j<arr.length; j++)
if(arr[j ]==num)
{
System.out.println("Element found index is:"+ j);
flag=1; 
break;
}
if (flag==0)
System.out.println("Element not found"); 
}
}
