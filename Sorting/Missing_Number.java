public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {5,2,3,4,1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int cycle(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        // searchfor first missing number
        for(int idx = 0;idx<arr.length;idx++){
            if(arr[idx] != idx){
                return idx;
            }
        }
        // case 2
        return arr.length;
    }
}
