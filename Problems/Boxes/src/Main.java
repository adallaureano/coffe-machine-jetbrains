import java.util.*;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        //declaration and initialization
        final int[] box1 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        final int[] box2 = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        scanner.close();

        //sorting the boxes
        Arrays.sort(box1);
        Arrays.sort(box2);

        //comparision between the boxes
        if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
            System.out.println("Box 1 = Box 2");
        } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
            System.out.println("Box 1 < Box 2");
        } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
            System.out.println("Box 1 > Box 2");
        } else {
            System.out.println("Incomparable");
        }
    }
}
