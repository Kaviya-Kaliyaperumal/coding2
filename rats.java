import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int unit=s.nextInt();
        int arr[]={2,8,3,1,7,4,1,2};
      int  a=r*unit;
       int sum=0;int count=0;
       for(int i=0;i<arr.length;i++)
       {
           sum=sum+arr[i];
            if(sum==a)
           {
               System.out.println(i+1);
             
           }
       }
}
}
