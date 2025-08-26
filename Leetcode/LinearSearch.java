public class LinearSearch {
    public static void main(String[] args) {
        //searches in the given array linearly
        int[] nums = {2,4,6,8,10,12,14,16};
        int key = 1;
        int index = searchKey(nums,key);
        if(index == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("key Found at Index "+index);
        }
    }

    public static int searchKey(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
}
