public class RemoveDublicate {

    public static void main(String ar[]){
        int arr[] = {0,0,1,1,1,2,3,3,3};
        int count = 2;

        for(int i = 2;i<arr.length;i++){
            if(arr[i]!=arr[count-2]){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i = 0;i<count;i++){
            System.out.print(arr[i]);
        }
    }
}
