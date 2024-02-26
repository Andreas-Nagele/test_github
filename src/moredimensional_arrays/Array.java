package moredimensional_arrays;

public class Array {

	public static int [][] magnifiy (int [][] array, int factor){
		int length = array.length;
		int width = array[0].length;
		
		int[][]scaled = new int[length * factor][width * factor];
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j += factor) {
				int k = 0;
				while(k < factor) {
					scaled[i][j+k] = array[i][j];
					k++;
				}
			}
		}
			
		return scaled;
	}
	
	public static void main(String[] args) {
		int [][] array = {{1,2,3}, {4,5,6}};
		magnifiy(array, 1);
	}

}
