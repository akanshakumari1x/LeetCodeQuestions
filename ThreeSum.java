import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

//    public static void main(String ar[]){
//        int arr[] = {-4,-1,-1,0,1,2};
//        //Output: [[-1,-1,2],[-1,0,1]]
//        int arrr [][] = new int[5][3];
//        List li = new ArrayList();



//        for(int i = 0; i<arr.length - 3; i++){
//            for(int j = i+1; j<arr.length -2; j++){
//                for(int k = j+1; k <arr.length -1;k++){
//                    int sum = arr[i] + arr[j]+arr[k];
//                    if(sum ==0){
//                        System.out.println(""+ i +""+ j+""+ k + " :"+ "a["+i+"]= "+i+  " a["+j+"]=" +j + " a["+k+"] =" + k +" ");
//                         li.add(arr[i]);
//                         li.add(arr[j]);
//                         li.add(arr[k]);
//                    }
//                }
//            }
//
//        }


            public static List<List<Integer>> threeSum(int[] nums) {

                List<List<Integer>> result = new ArrayList<>();

                Arrays.sort(nums);

                for (int i = 0; i < nums.length - 2; i++) {

                    // Skip duplicate fixed numbers
                    if (i > 0 && nums[i] == nums[i - 1]) {
                        continue;
                    }

                    int left = i + 1;
                    int right = nums.length - 1;

                    while (left < right) {

                        int sum = nums[i] + nums[left] + nums[right];

                        if (sum == 0) {
                            result.add(Arrays.asList(
                                    nums[i], nums[left], nums[right]
                            ));

                            left++;
                            right--;

                            // Skip duplicate left values
                            while (left < right &&
                                    nums[left] == nums[left - 1]) {
                                left++;
                            }

                            // Skip duplicate right values
                            while (left < right &&
                                    nums[right] == nums[right + 1]) {
                                right--;
                            }

                        } else if (sum < 0) {
                            left++;

                        } else {
                            right--;
                        }
                    }
                }

                return result;
            }

            public static void main(String[] args) {

                int[] nums = {-1, 0, 1, 2, -1, -4};

                System.out.println(threeSum(nums));
            }
        }

//        for(int x  =0; x< li.size(); x++){
//            System.out.print( " " +li.get(x) );
//        }

    }

}
