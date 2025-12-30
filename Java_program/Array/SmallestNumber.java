public class SmallestNumber {
    public static int Small(int arr[]){
            int min=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
    }
    public static void main(String[] args) {
        int arr[]={-1,15,3,4,0,-5};
        System.out.println(Small(arr));
    }
}
