import java.util.*; public
class maxMin
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in); 
int arr[]=new int[10];
System.out.println("Enter elements in array");
//  int min=0;
// int max=100000;
int min = sc.nextInt();
int max = sc.nextInt();
for(int i=0;i<=4;i++)
{
arr[i]=sc.nextInt(); 
if(arr[i]<min)
min=arr[i];
if(arr[i]>max)
max=arr[i];
}
System.out.println("Maximum element is "+max); 
System.out.println("Minimum element is "+min);
}
}
