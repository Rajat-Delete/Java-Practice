public class MaxConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1};
        int CurrentStreak = 0;
        int MaxStreak = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                CurrentStreak = 0;
            }else{
                CurrentStreak +=1;
            }
            MaxStreak = Math.max(CurrentStreak,MaxStreak);
        }
        System.out.println(MaxStreak);;
    }
}
