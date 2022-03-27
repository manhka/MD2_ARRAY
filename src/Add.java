import java.util.Arrays;
import java.util.Scanner;
public class Add {
    static  Scanner scanner =new Scanner(System.in);
    public  static void addElement(int[] arr, int adding_element){
        int newArr[]= new int[arr.length+1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
            newArr[arr.length]=adding_element;
        }
        System.out.println("arr after add new element: "+ Arrays.toString(newArr));
    }
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,6,7};
            System.out.print("enter a number to add: ");
        int number= scanner.nextInt();
        addElement(arr,number);
    }
}
