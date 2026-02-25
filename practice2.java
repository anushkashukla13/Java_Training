public class practice2 {
    public static void main(String[] args) {
        // sum of two arrays
        // int arr[]={1,2,3};
        // int arr2[]={4,5,6};
        // int sum[]=new int[arr.length];
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum[i]=arr[i]+arr2[i];

        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(sum[i]);
        // }

        //compare two array
        // int arr1[]={1,2,3};
        // int arr2[]={1,2,3};
        
        // boolean isequal=java.util.Arrays.equals(arr1,arr2);
        // if(isequal){
        //     System.out.println("arrays are equal");
        // }
        // else{
        //     System.out.println("unequal");
        // }

        //merge
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int merge[]=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++){
            merge[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merge[arr1.length+i]=arr2[i];
        }
        
        for(int val : merge){
            System.out.println(val+" ");
        }



    }
}


