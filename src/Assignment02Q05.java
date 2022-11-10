import java.util.Arrays;

public class Assignment02Q05 {

	public static void main(String[] args) {
	
		int N = Integer.parseInt(args[0]);
		int[][] matrix = new int[N][N]; // the input matrix to be
		for(int i=0;i < N; i++){
			for(int j=0; j < N; j++){
				matrix[i][j] = Integer.parseInt(args[1+(i*N)+j]); // the value at [i][j] is the i*N+j item in args (without considering args[0])
			}
		}
		for(int i=0;i < N; i++)
			System.out.println(Arrays.toString(matrix[i]));
		System.out.println("");
		int[][] rotatedMatrix = new int[N][N]; // the rotated matrix
		for(int i=0;i < N; i++){
			for(int j=0; j < N; j++){
				rotatedMatrix[i][j] = matrix[j][i]; // the value at [i][j] is the i*N+j item in args (without considering args[0])
			}
		}
		
	
		for(int i=0;i < N; i++){ 
			System.out.println(Arrays.toString(rotatedMatrix[i])); // this would compile after you would put value in transposedMatrix
		}
	}
}
