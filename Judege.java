import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Judege
 * @Description TODO
 * @Auther danni
 * @Date 2019/9/12 18:35]
 * @Version 1.0
 **/

public class Judege {

    @Override
    public String toString() {
        return "Judege{}";
    }

    public static  List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
           while(j<k) {
               while(j<k&&nums[i] + nums[j] + nums[k] < 0){
                   j++;
               }
               if(j>=k){
                   break;
               }
               if (j<k&&nums[i] + nums[j] + nums[k] == 0) {
                   List<Integer> e=new ArrayList<>();
                   e.add(nums[i]);
                   e.add(nums[j]);
                   e.add(nums[k]);
                   list.add(e);
                   while(nums[j]==nums[j+1]&&j<k){
                       j++;
                   }
                   j++;
               }
                while(j<k&&nums[i] + nums[j] + nums[k] > 0){
                     k--;
                }
                if(j>=k){
                   break;
                }
               if (j<k&&nums[i] + nums[j] + nums[k] == 0) {
                   List<Integer> e=new ArrayList<>();
                   e.add(nums[i]);
                   e.add(nums[j]);
                   e.add(nums[k]);
                   list.add(e);
                   while(nums[k]==nums[k-1]&&j<k){
                       k--;
                   }
                   k--;
               }
        }
        while(nums[i]==nums[i+1]&&i<nums.length-2){
               i++;
        }
     }
        return list;
    }
    public static void main(String[] args) {
        int[] nums={-4,-1,-1,0,1,2};
        System.out.println( threeSum(nums));

    }
}
