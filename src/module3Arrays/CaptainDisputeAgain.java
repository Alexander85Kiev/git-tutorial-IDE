package module3Arrays;

import java.util.Arrays;

public class CaptainDisputeAgain {




    public int findMin(int[] triple){
      int [] min = new int[1];
      min[0] = triple[1] < triple[2]?triple[1]:triple[2];
       min[0] = min[0] < triple[0]?min[0]:triple[0];
      return min[0];
  }

    public static void main(String[] args) {
       CaptainDisputeAgain captainDisputeAgain = new CaptainDisputeAgain();
       captainDisputeAgain.findMin(new int[]{3,4,5});
        System.out.println(Arrays.toString(new int[]{captainDisputeAgain.findMin(new int[]{5, 4, 3})}));
    }


}
