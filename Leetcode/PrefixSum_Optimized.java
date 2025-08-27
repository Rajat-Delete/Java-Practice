public class PrefixSum_Optimized {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] prefixArray = new int[arr.length];
        int max= Integer.MIN_VALUE;
        prefixArray[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixArray[i]  = prefixArray[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = i == 0 ?  prefixArray[j] :prefixArray[j] - prefixArray[i-1];
                if(sum>max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
