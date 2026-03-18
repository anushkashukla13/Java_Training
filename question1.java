public class question1 {
    public static void main(String[] args) {
        // int a=123;
        // int sum=0;
        // while(a>0)
        // {
        // sum+=a%10;
        // a/=10;
        // }
        // System.out.println(sum);

        // int a = 123;
        // int b = 0;
        // while (a > 0) {
        // b = a % 10;
        // if (b % 2 == 0) {
        // System.out.println(b + " is even");
        // } else {
        // System.out.println(b + " is odd");
        // }
        // a /= 10;
        // }

        // int a=121;
        // int b=0;
        // int c=a;
        // while(a>0)
        // {
        // b=b*10+(a%10);
        // a/=10;
        // }
        // System.out.println(b);
        // if(c==b)
        // {
        // System.out.println("Palindrome");
        // }
        // else
        // {
        // System.out.println("Not Palindrome");
        // }

        // bitwise
        // int a=123;
        // if((a&1)==0){
        // System.out.println("even");
        // }
        // else{
        // System.out.println("odd");
        // }

        // Count vowels, consonants, digits, spaces in a string
        // String s1 = "anushka 123";
        // int vowels = 0;
        // int consonants = 0;
        // int digits = 0;
        // int spaces = 0;
        // for (int i = 0; i < s1.length(); i++) {
        //     char ch = s1.charAt(i);
        //     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        //         vowels++;
        //     } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
        //         consonants++;
        //     } else if (ch >= '0' && ch <= '9') {
        //         digits++;
        //     } else if (ch == ' ') {
        //         spaces++;
        //     }

        // }
        // System.out.println("Vowels: " + vowels);
        // System.out.println("Consonants: " + consonants);
        // System.out.println("Digits: " + digits);
        // System.out.println("Spaces: " + spaces);

        // kadane's algorithm
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("Maximum subarray sum: " + maxSum);
        

    }

}
