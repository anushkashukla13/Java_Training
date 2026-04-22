import java.util.LinkedList;

// Trapping Rain Water problem

// public class dsa {
//     public static void main(String[] args) {
//         int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//         System.out.println(trap(height));
//     }

//     public static int trap(int[] height) {
//         int left = 0;
//         int right = height.length - 1;
//         int leftMax = 0;
//         int rightMax = 0;
//         int trappedWater = 0;

//         while (left < right) {
//             if (height[left] < height[right]) {
//                 if (height[left] >= leftMax) {
//                     leftMax = height[left];
//                 } else {
//                     trappedWater += leftMax - height[left];
//                 }
//                 left++;
//             } else {
//                 if (height[right] >= rightMax) {
//                     rightMax = height[right];
//                 } else {
//                     trappedWater += rightMax - height[right];
//                 }
//                 right--;
//             }
//         }

//         return trappedWater;
//     }

// Linear Search
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at index: " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}
   
