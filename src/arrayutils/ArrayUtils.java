package arrayutils;

public class ArrayUtils {
	public static void main(String[] args) {
		int[] intArray1 = {10, 20, 30, 40, 50};
		double[] doubleArray1 = ArrayUtils.intToDouble(intArray1);
		for (int i = 0; i < doubleArray1.length; i++) {
			System.out.printf("%-12f", doubleArray1[i]);
		}		
		System.out.println();
		System.out.println("----------------------------------------");

		double[] doubleArray2 = {10.1, 20.2, 30.3, 40.4, 50.5};
		int[] intArray2 = ArrayUtils.doubleToInt(doubleArray2);
		for (int i = 0; i < intArray2.length; i++) {
			System.out.printf("%-12d", intArray2[i]);
		}		
		System.out.println();
	}
	
	public static int[] doubleToInt(double[] src){
		int[] resultArray = new int[src.length];
		for (int i = 0; i < src.length; i++) {
			resultArray[i] = (int)src[i];
		}
		return resultArray;
	}
	public static double[] intToDouble(int[] src){
		double[] resultArray = new double[src.length];
		for (int i = 0; i < src.length; i++) {
			resultArray[i] = (double)src[i];
		}
		return resultArray;
	}
}

