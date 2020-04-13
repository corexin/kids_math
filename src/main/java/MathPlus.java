import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class MathPlus {


    public static void main(String...s)
    {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int i = RandomUtils.nextInt(0, 9);
            int j = RandomUtils.nextInt(0, 9);
            System.out.println("Type the result of " + i + "+" + j + "=");
            String result = scanner.nextLine();
            if (NumberUtils.createInteger(result.trim()) == i + j) {
                System.out.println("You are correct, " + i + "+" + j + "=" + (i + j));
            } else {
                System.out.println("You are incorrect, correct answer is: " + ( i + j));
            }
        }
    }

}
