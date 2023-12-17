package carry_forward;

public class bulbs_on {

	public static void main(String[] args) {
	
		
//		Problem Description
//		A wire connects N light bulbs.
//
//		Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
//
//		Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
//
//		You can press the same switch multiple times.
//
//		Note: 0 represents the bulb is off and 1 represents the bulb is on.
//
//
//
//		Problem Constraints
//		0 <= N <= 5×105
//		0 <= A[i] <= 1
//
//
//
//		Input Format
//		The first and the only argument contains an integer array A, of size N.
//
//
//
//		Output Format
//		Return an integer representing the minimum number of switches required.
//
//
//
//		Example Input
//		Input 1:
//
//		 A = [0, 1, 0, 1]
//		Input 2:
//
//		 A = [1, 1, 1, 1]
//
//
//		Example Output
//		Output 1:
//
//		 4
//		Output 2:
//
//		 0

		int A[] = {1,0,1,0,1,0};
		int ans=count_of_min_press_switch(A);
		System.out.print(ans + " ");
		
	}

	private static int count_of_min_press_switch(int[] a) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]==count%2)
				count++;
		}
		return count;
	}
	
	///another approch
//	public int bulbs(int[] A) {
//
//        int switchPressCount = 0;
//        boolean stateChanged = false;
//        for(int i=0;i<A.length;i++){
//            if(A[i]==0&&!stateChanged){
//                stateChanged = true;
//                switchPressCount++;
//            }
//            if(A[i]==1&&stateChanged){
//                stateChanged = false;
//                switchPressCount++;
//            }
//        }
//        return switchPressCount;
//    }

}
