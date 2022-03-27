import java.util.Arrays;

public class mix_element_inARR {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5 };
        int i= (int) Math.random()* arr.length;
        for (int j = 0; j < arr.length; j++) {
            arr[i]=arr[j];
        }
        System.out.println("newARR="+ Arrays.toString(arr));
    }
}
