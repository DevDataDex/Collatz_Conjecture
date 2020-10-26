import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How high would you like to go?");
        int mew = scn.nextInt();
        for (int dig = 1; dig <= mew; dig++) {
            System.out.print(dig + ": ");
            int let = dig;
            do {
                if (let % 2 == 0) {
                    let = let / 2;
                } else if (let % 2 == 1) {
                    let = ((let * 3) + 1);
                }
                System.out.print(let + " ");
            } while (let != 1);
            System.out.println();
        }
    }
}
