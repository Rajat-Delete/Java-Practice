public class BestTimeToBuyAndSell {
    public static void main(String[] args) {
        int[]  arr ={10,11,9,4,10};
        int maxProfit = 0;
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] - min > maxProfit){
                maxProfit = arr[i] - min;
            }
        }
        System.out.println(maxProfit);
    }
}
