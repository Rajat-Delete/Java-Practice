public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-1,-2};
        int currentSum = 0;
        int MaximumSum = Integer.MIN_VALUE;
        int NegativeMax;
        for(int i=0;i<arr.length;i++){
            currentSum = currentSum+arr[i];
            if(currentSum < 0){
                currentSum = 0;
            }

            MaximumSum = Math.max(MaximumSum,currentSum);
        }
        if(MaximumSum == 0){
            NegativeMax = arr[0];
            for(int i=1;i<arr.length;i++){
                if(NegativeMax < arr[i]){
                    NegativeMax = arr[i];
                }
            }
            System.out.println(NegativeMax);
        }else{
            System.out.println(MaximumSum);
        }
    }
}
