import java.util.*;


public class array {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};
        // for(int i=0;i<=arr.length-1;i++)
        // {
        // System.out.println(arr[i]);
        // }

        // int arr[]={1,7,2,3,4,5};
        // int max=arr[0];
        // for(int i=arr.length-1;i>=0;i--)
        // {
        // if(arr[i]>max)
        // {
        // max=arr[i];
        // }
        // }
        // System.out.println(max);

        // int arr[]={1,7,2,3,0,4,5};
        // int target=3;
        // for(int i=0;i<=arr.length-1;i++)
        // {
        // for(int j=i+1;j<=arr.length-1;j++)
        // {
        // if(arr[i]+arr[j]==target)
        // {
        // System.out.println(+arr[i]+" "+arr[j]);
        // }
        // //break;
        // }
        // }

        // 2nd maximum
        // int arr[] = { 1, 7, 2, 3, 0, 4, 5 };
        // int max ;
        // int secondMax;
        

        // if (arr[0] > arr[1]) {
        //     max = arr[0];
        //     secondMax = arr[1];
        // } else {
        //     max = arr[1];
        //     secondMax = arr[0];
        // }

        // for (int i = 2; i < arr.length; i++) {

        //     if (arr[i] > max) {
        //         secondMax = max;
        //         max = arr[i];
        //     }
        //     else if (arr[i] > secondMax && arr[i] != max) {
        //         secondMax = arr[i];
        //     }
        // }

        // System.out.println("Second Maximum: " + secondMax);


        //dsa in java


        // int arr[]={1 ,2,3,4,5,6};
        // int arr[50];
        // Scanner src = new Scanner(System.in);
        // int[] arr = new int[5];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = src.nextInt();
        // }

        // int sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // sum = sum + arr[i];
        // }

        // System.out.println(sum);
        // if (sum % 2 == 0) {
        // System.out.println("even");

        // } else {
        // System.out.println("odd");
        // }

        // int arr[] = { 16,17,4,3,5,2 };
        // int arr2[]= new int[7];
        // int c_max[]=arr[arr.length-1];
        // for(int i=arr.length;i<0;i--){
        // for(int j=i-1;j<0;j--){
        // if(arr[i]<arr[j]){
        // System.out.println(arr[j]);

        // }
        // }
        // }

        // int arr[] = { 1, 3, 5, 7, 10, 12 };
        // int target = 15;
        // int L = 0;
        // int count=0;
        // int R = arr.length - 1;
        // while (L <= R) {
        //     if (arr[L] + arr[R] == target) {
        //         System.out.println(arr[L] +" "+ arr[R] );
        //         count++;
        //         L++;
        //     }
        //     else if(arr[L] + arr[R] > target)
        //     {
        //         R--;
        //     }
        //     else{
        //         L++;
        //     }
        // }
        // System.out.println(count);


        //remove duplicate

        //int arr[]={1,1,2,5,6};
        


        // int arr[]={1,2,3,4,5,7,10};
        // int k=4;
        // int sum=0;
        // for(int i= 0;i<k;i++)
        // {
        //     sum=+arr[i];
        // }
        // int max=sum;
        // for(int i=k;i<arr.length;i++)
        // {   
        //     sum+=arr[i];
        //     sum-=arr[i-k];
        //     if(sum>max) {
        //         max=sum;
        //     }
        // }
        
        // System.out.println("max is " + max);


        //count subarray of size k with sum>x

        // int arr[]={1,3,5,7,9,10,4,2,20 };
        // int k=3;
        // int x=20;
        // int sum=0;
        // int count=0;
        // for(int i= 0;i<k;i++)
        // {
        //     sum=sum+arr[i];
           
        // }
        // System.out.println(sum);
       
        // for(int i=k;i<arr.length;i++)
        // {   
        //     sum+=arr[i];
        //     sum-=arr[i-k];
        //     if(sum>x)
        //     {
        //         count++;
        //     }
        //     System.out.println(sum);
        // }    
        // System.out.println("count "+count);
 

        // int arr[]={1,2,3,4,2,4,5};
        // int arr2[]=new int[7];
        // int sum=0;
       
        // for(int i=0;i<arr.length;i++)
        // {

        //     sum=sum+arr[i];
        //     arr2[i]=sum;
        //     System.out.println(arr2[i]);

        // }

        // int arr[]={1,7,3,6,5,6};
        // int L[]=new int[6];
        // int R[]=new int[6];
        // int sum=0,ans=-1;
        // int sum2=0;
        // for(int i=0;i<arr.length;i++)
        // {

        //     sum=sum+arr[i];
        //     L[i]=sum;
        //     System.out.println(L[i]);

        // }
        // System.out.println("   ");

        // for(int i=arr.length-1;i>=0;i--)
        // {

        //     sum2=sum2+arr[i];
        //     R[i]=sum2;
        //     System.out.println(R[i]);

        // }
        // System.out.println();

        // for(int i=0;i<arr.length;i++)
        // {
        //     if(L[i]==R[i])
        //         ans=1;
        //        break;
            
        // }
        // System.out.println(ans);


     //1732 leetcode
        // int arr[]={-5,1,5,0,-7};
        // int sum=0;
        // int max=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=sum+arr[i];
        //     if(sum>max)
        //     {
        //         max=sum;
        //     }
        // }
        // System.out.println(max);

        //wap to rotate three elemnet of an array clockwise
        // int arr[]={1,3,5,7,2,8};
        // int k=3;
        // int arr2[]=new int[6];
        // int j=0;

        // for(int i=arr.length-k;i<arr.length;i++)
        // {
        //     arr2[j]=arr[i];
        //     System.out.println(arr2[j]);
        //     j++;
        // }
        // for(int i=arr.length-k-1;i>=0;i--)
        // {
        //     arr[i+k]=arr[i];
        // }
        // for(int i=0;i<k;i++)
        // {
        //     arr[i]=arr2[i];
        // }
        // System.out.println("   ");
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);
        // }


        
    }
}