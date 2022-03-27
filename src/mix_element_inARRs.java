import java.util.Arrays;

public class mix_element_inARRs {
    public static void main(String[] args) {
        int[][] arr= new int[2][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;

        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int i1= (int) ( Math.random()*arr.length);
                int j1= (int) ( Math.random()*arr[i].length);
                int x=arr[i][j];
                arr[i][j]=arr[i1][j1];
                arr[i1][j1]=x;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
