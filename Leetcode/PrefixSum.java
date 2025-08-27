public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max=Integer.MIN_VALUE;
        //Giving TLE
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int start=i;start<=j;start++){
                    sum += arr[start];
                }
                if(sum < 0){
                    i=j+1;
                }
                if(sum>max){
                    max=sum;
                }
                System.out.println(sum);
            }
        }
        System.out.println(max);
    }
}
