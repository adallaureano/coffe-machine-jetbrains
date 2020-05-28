import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strNumb = scanner.nextLine().split(" ");
        int count = scanner.nextInt();

        int[] numbers = new int[strNumb.length];

        for (int i = 0; i < strNumb.length; i++) {
            numbers[i] = Integer.parseInt(strNumb[i]);
        }

        for (int num : rightRotate(numbers, count)) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static int[] rightRotate(int[] numb, int count) {
        int[] rotatedNumbers = numb.clone();
        for (int i = 0; i < rotatedNumbers.length; i++) {
            rotatedNumbers[(i + count) % rotatedNumbers.length] = numb[i];
        }
        return rotatedNumbers;
    }
}