import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int months = 3;
        int[][] sales = new int[names.length][months];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < months; j++) {
                System.out.println("Enter number of sales for month " + (i + 1) + " for " + names[i] + " mattress:");
                sales[i][j] = sc.nextInt();
            }
        }
        IProduct product = new Product(names, sales);
        new PrintProduct(product).PrintReport(2026);
    }
}