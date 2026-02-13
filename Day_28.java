import java.util.Scanner;

public class Day_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // number of levels
        int H = sc.nextInt();  // initial weight
        int I = sc.nextInt();  // increment

        int totalWeight = 0;

        for (int level = 1; level <= N; level++) {
            
            // Print stars
            for (int star = 1; star <= level; star++) {
                System.out.print("*");
            }
            System.out.println();

            // Calculate weight for this level
            int weightPerStar = H + (level - 1) * I;
            int levelWeight = weightPerStar * level;

            totalWeight += levelWeight;
        }

        System.out.println("Total weight of stars = " + totalWeight);
    }
}
