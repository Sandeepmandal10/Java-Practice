public class LargestNumber {
    public static int Largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={2,6,3,9,7};
        System.out.println(Largest(arr));

    }
}
