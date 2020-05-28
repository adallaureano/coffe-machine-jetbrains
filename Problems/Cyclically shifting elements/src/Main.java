import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] a = new int[length];
        int[] newArrays = new int[length];

        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        newArrays[0] = a[length - 1];

        System.arraycopy(a, 0, newArrays, 1, a.length - 1);

        for (int numbers : newArrays) {
            System.out.print(numbers + " ");
        }
    }
}
