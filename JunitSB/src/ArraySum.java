
public class ArraySum {

	public int calculateSum(int[] numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum = sum + n;
		}

		return sum;
	}

}
