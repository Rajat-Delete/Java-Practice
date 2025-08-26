import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();

        System.out.println("Numbers taken as Inputs are "+arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
