public class TotalElement_cheo {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {3,2,4},
                     {8,9,5}
        };
        int totalRight=0;
        int totalLeft=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
if (i==j){
    totalRight+=arr[i][j];
}
if (i+j==arr.length-1){
    totalLeft+=arr[i][j];
}
    }

} System.out.print("total RIGHT= "+totalRight);
        System.out.print("\ntotal LEFT= "+totalLeft);
    }}
