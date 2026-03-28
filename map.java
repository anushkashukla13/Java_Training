// public class map {
//     public static void main(String[] args) {
//             int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//             System.out.println(trap(height));
//         }
    
//         public static int trap(int[] height) {
//             int left = 0;
//             int right = height.length - 1;
//             int leftMax = 0;
//             int rightMax = 0;
//             int trappedWater = 0;
    
//             while (left < right) {
//                 if (height[left] < height[right]) {
//                     if (height[left] >= leftMax) {
//                         leftMax = height[left];
//                     } else {
//                         trappedWater += leftMax - height[left];
//                     }
//                     left++;
//                 } else {
//                     if (height[right] >= rightMax) {
//                         rightMax = height[right];
//                     } else {
//                         trappedWater += rightMax - height[right];
//                     }
//                     right--;
//                 }
//             }
    
//             return trappedWater;
//     }
// }
//Find the first non-repeating character in a string
import java.util.*;


public class map {
    public static void main(String[] args) {
    //     String str = "aabbcdeff";

    //     HashMap<Character, Integer> map = new HashMap<>();

    //     // Step 1: Count frequency
    //     for (char ch : str.toCharArray()) {
    //         map.put(ch, map.getOrDefault(ch, 0) + 1);
    //     }

    //     // Step 2: Find first non-repeating
    //     for (char ch : str.toCharArray()) {
    //         if (map.get(ch) == 1) {
    //             System.out.println("First non-repeating character: " + ch);
    //             return;
    //         }
    //     }


    //     System.out.println("No non-repeating character found");


    // Two Sum
     int arr[] = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                System.out.println(map.get(complement) + " " + i);
                return;
            }

            map.put(arr[i], i);
        }
    }


}