public class BinarySearch {
    public static int Binary(int arr[],int key){
        int start=0;
        int high=arr.length;
        while (start<high){
            int mid=start+(high-start)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                high=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,7,8,10,11};
        int key=7;
        System.out.println(Binary(arr,key));
    }
}
