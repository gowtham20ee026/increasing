
import java.util.*;
public class longestsub {
        public static int length(int[] nums) {
        int[] arr = new int[nums.length];
        int m = 0;
        for (int x : nums) {
            int i = 0, j = m;
            while (i != j) {
                int mid = (i + j) / 2;
                if (arr[mid] < x)
                    i = mid + 1;
                else
                    j = mid;
            }
            arr[i] = x;
            if (i == m) m++;
        }
        return m;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter element "+(i+1));
                arr[i]=sc.nextInt();
            }
            System.out.println("longestsubsequencelength "+length(arr));
        }
    }