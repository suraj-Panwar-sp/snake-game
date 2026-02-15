package Snake;

class Solution {
    public int[] alternateNumbers(int[] a) {
        int[] arr = new int[a.length];
        int posInd = 0;
        int negInd = 1;

        for (int j : a) {
            if (j > 0) {
                arr[posInd] = j;
                posInd += 2;
            } else {
                arr[negInd] = j;
                negInd += 2;
            }

        }
        return arr;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] a = {-2, -3, 4, 5};
        Solution obj = new Solution();
        int arr[] = obj.alternateNumbers(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
