public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int oddSum = 0;
        int evenSum = 0;
		
		String name="Shashank";
		
		for(int ref:name){
			System.out.println(""+ref);
		}
		//

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num; 
            } else {
                oddSum += num;  
            }
        }

        System.out.println("oddSum = " + oddSum + ", evenSum = " + evenSum);
    }
}