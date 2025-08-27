public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        for(int i=0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                printSubArray(arr, i, j);
            }
            System.out.println();
        }
    }

    public static void printSubArray(int[] arr, int start, int end){
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]);
        }
        System.out.print(" ");
    }
}
