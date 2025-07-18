import java.util.*;

public class MinCoinsWithOneEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (you have ₹1 to ₹n coins): ");
        int n = sc.nextInt();

        int target = 5;
        List<Integer> coins = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            coins.add(i);
        }

        int minCoins = Integer.MAX_VALUE;

        int totalComb = 1 << coins.size();

        for (int i = 1; i < totalComb; i++) {
            int sum = 0;
            int count = 0;

            for (int j = 0; j < coins.size(); j++) {
                if ((i & (1 << j)) != 0) { 
                    sum += coins.get(j);
                    count++;
                }
            }

            if (sum == target) {
                minCoins = Math.min(minCoins, count);
            }
        }

        if (minCoins == Integer.MAX_VALUE) {
            System.out.println("Not possible to make ₹5 with the given coins.");
        } else {
            System.out.println("Minimum number of coins to make ₹5: " + minCoins);
        }
    }
}
