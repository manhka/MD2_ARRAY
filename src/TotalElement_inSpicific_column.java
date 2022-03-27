import java.util.Scanner;

public class TotalElement_inSpicific_column {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,5},
                {3,2,4,9,77},
                {8,9,5,7,6}
        };
        Scanner scanner= new Scanner(System.in);
        System.out.print("what column:");
        int col= scanner.nextInt();
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (j==col-1){
                    total +=arr[i][j];
                }
            }
        }
        System.out.println("total element in column" +col +" = "+total);
    }


}
