import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    System.out.println("Original array:"+ Arrays.toString(arr));
    Scanner scanner = new Scanner(System.in);
    int deleting_positon;
    do {
        System.out.println("enter a number to delete:");
        int number = scanner.nextInt();
        deleting_positon = checkElement(arr, number);
        if (deleting_positon != -1) {
            DeleteElement(arr, deleting_positon);
        }
    } while (deleting_positon == -1);
}
    public static int checkElement(int[] arr, int deleting_element) {
        int position = -1;
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == deleting_element) {
                position = i;
                check = true;
                break;
            }
        }
        if (check) {
            System.out.print(deleting_element + " is in ARRAY");
        } else {
            System.out.print(deleting_element + " is not in ARRAY");
        }
        return position;
    }

    public static void DeleteElement(int[] arr, int position) {
        int[] newARR = new int[arr.length - 1];
        for (int i = 0; i < position; i++) {
            newARR[i] = arr[i];
        }
        for (int j = position + 1; j < arr.length; j++) {
            newARR[j - 1] = arr[j];
        }
        System.out.println("\narr after delete an element: " +Arrays.toString(newARR));
    }


}
