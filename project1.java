//import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.TreeSet;
// 1. �̱� 2. ���ϱ� 3. ����
class Solution {
    public TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> zxcv = new TreeSet<Integer>();
       // ArrayList<Integer> zxcv = new ArrayList<Integer>();
      
       for(int i=0; i<numbers.length;i++){
           for(int j=i+1; j<numbers.length;j++){
              zxcv.add(numbers[i] + numbers[j]);
           }
       }
   
// System.out.print(zxcv);
    
        return zxcv;
    }
}