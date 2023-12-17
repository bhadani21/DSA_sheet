package sliding_window;

public class spiral_matrix {

	public static void main(String[] args) {
//		Problem Description
//		Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
//
//
//
//		Problem Constraints
//		1 <= A <= 1000
//
//
//
//		Input Format
//		First and only argument is integer A
//
//
//		Output Format
//		Return a 2-D matrix which consists of the elements added in spiral order.
//
//
//
//		Example Input
//		Input 1:
//
//		1
//		Input 2:
//
//		2
//		Input 3:
//
//		5
//
//
//		Example Output
//		Output 1:
//
//		[ [1] ]
//		Output 2:
//
//		[ [1, 2], 
//		  [4, 3] ]
//		Output 2:
//
//		[ [1,   2,  3,  4, 5], 
//		  [16, 17, 18, 19, 6], 
//		  [15, 24, 25, 20, 7], 
//		  [14, 23, 22, 21, 8], 
//		  [13, 12, 11, 10, 9] ]
//
		int number=5;
		int [][]spiral_metrix = new int[number][number];
		spiral_metrix=generate_spiral_metrix(number,spiral_metrix);
		for (int i = 0; i < spiral_metrix.length; i++) {
			for (int j = 0; j < spiral_metrix.length; j++) {
				System.out.print(spiral_metrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] generate_spiral_metrix(int number, int[][] spiral_metrix) {
		int count=1;
		int i=0,j=0,k=0;
		while(number > 0) {
			if(number==1) spiral_metrix[i][j]=count++;
			for (k = 1; k < number; k++) {
				spiral_metrix[i][j++]=count++;
			}
			for (k = 1; k < number; k++) {
				spiral_metrix[i++][j]=count++;
			}
			for (k = 1; k < number; k++) {
				spiral_metrix[i][j--]=count++;
			}
			for (k = 1; k < number; k++) {
				spiral_metrix[i--][j]=count++;
			}
			
			number-=2;
			i++;j++;
			
		}
		return spiral_metrix;
	}

}
