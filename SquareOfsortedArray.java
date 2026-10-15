public class SquareOfsortedArray {
    public static void main(String ar[]){
        int arr[] = {-4,-1,0,3,10};
        int left = 0;
        int right = arr.length-1;
        int temp [] = new int [arr.length];

       int x = arr.length-1;

        while(left<= right){
            int l = arr[left]*arr[left];
            int r = arr[right]* arr[right];
            if(l > r){
                temp[x] = l;
                left++;
            }else{
                temp[x] =r;
                right--;
            }
            x--;
        }

        for(int i = 0;i<=temp.length-1;i++){
            System.out.print( "" +temp[i]+" ");
        }

    }
}
