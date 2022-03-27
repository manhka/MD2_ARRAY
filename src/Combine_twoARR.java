import java.util.Arrays;

public class Combine_twoARR {
    public static void combineArrs(int[] arr1 ,int[] arr2){
       int[] newARR= new int[arr1.length+ arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            newARR[i]=arr1[i];
        }int k=0;
        for (int j = arr1.length; j < arr2.length; j++) {
            newARR[j]=arr2[k];
            k++;
        }
        System.out.print("arr after combining is: " + Arrays.toString(newARR));
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,6,7,11};
        int[] arr2= {2,4,8,10};
        combineArrs(arr1,arr2);
    }
}
