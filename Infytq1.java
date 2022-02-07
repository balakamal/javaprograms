import java.util.Scanner;

public class Infytq1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] row1 = s.nextLine().split(",");
        String[] row2 = s.nextLine().split(",");

        for (int i = 0; i < row1.length; i++) {
            int n = Integer.parseInt(row1[i].replaceAll("[^\\d]", " ").trim().replace(" ", ""));
            for (String r2 : row2) {
                if (!r2.matches("^[a-zA-Z]*$") && n == Integer.parseInt(r2)) {
                    row2[i] = row1[i].replaceAll("\\d", "");
                    row1[i] = Integer.toString(n);
                }
            }
        }
        for (int i = 0; i < row2.length; i++) {
            if (row2[i].matches("^[0-9]*$")) {
                row1[i] = "NA";
                row2[i] = "NA";
            }
        }
        System.out.println(String.join(",", row1));
        System.out.println(String.join(",", row2));

    }
}