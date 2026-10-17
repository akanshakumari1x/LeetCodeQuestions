import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

    public static void main(String ar[]){
        int arr[] = {-4,-1,-1,0,1,2};
        //Output: [[-1,-1,2],[-1,0,1]]
        int arrr [][] = new int[5][3];
        List li = new ArrayList();

        for(int i = 0; i<arr.length - 3; i++){
            for(int j = i+1; j<arr.length -2; j++){
                for(int k = j+1; k <arr.length -1;k++){
                    int sum = arr[i] + arr[j]+arr[k];
                    if(sum ==0){
                        System.out.println(""+ i +""+ j+""+ k + " :"+ "a["+i+"]= "+i+  " a["+j+"]=" +j + " a["+k+"] =" + k +" ");
                         li.add(arr[i]);
                         li.add(arr[j]);
                         li.add(arr[k]);
                    }
                }
            }
        }

        for(int x  =0; x< li.size(); x++){
            System.out.print( " " +li.get(x) );
        }

    }

}
