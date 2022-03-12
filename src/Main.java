import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class programm {

    private static void check(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr) {
            if (element == toCheckValue) {
                test = true;
                break;
            }
        }
        System.out.println("Is " + toCheckValue
                + " present in the array: " + test);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" type the number that you want it to be checked : ");
        int toCheckValue = sc.nextInt();
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter "+ arr.length
                + " integer values:");

        for(int i=0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i=0; i < 1; i++) {
            System.out.print(arr[i]+"\t");
            System.out.println("Array: "
                    + Arrays.toString(arr));
            check(arr, toCheckValue);
        }

    }}
