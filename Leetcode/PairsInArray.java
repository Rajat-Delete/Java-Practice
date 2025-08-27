public class PairsInArray {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        generatePairs(arr);
    }

    public static void generatePairs(int[] nums){
        for(int i=0;i< nums.length-1;i++){
            for (int k=i+1;k<nums.length;k++){
                System.out.print("("+nums[i]+","+nums[k]+") ");
            }
            System.out.println();
        }
    }
}
