public class Linearsearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,9,10};
        int target=55;
        int result=Linearsearch(arr,target);
if(target!=-1){
    System.out.println("Element found at index:"+result);
}
else{
    System.out.println("Element not found");
}
    }
    public static int Linearsearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
            }
                return -1;

        }
     }
