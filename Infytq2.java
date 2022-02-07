import java.util.Scanner;

public class Infytq2 {
    public static int ans = 10000000;

    public static void solve(int a[], int n, int k, int index, int sum, int maxsum) {
        if (k == 1) {
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            maxsum = Math.max(maxsum, sum);
            ans = Math.min(ans, maxsum);
            return;
        }
        sum = 0;
        for (int i = index; i < n; i++) {
            sum += a[i];
            maxsum = Math.max(maxsum, sum);
            solve(a, n, k - 1, i + 1, sum, maxsum);
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] inarray = s.nextLine().split(",");
        int k = s.nextInt();
        int[] arr = new int[inarray.length];
        for (int i = 0; i < inarray.length; i++) {
            arr[i] = Integer.parseInt(inarray[i]);
        }
        int n = arr.length;
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans);
    }
}
