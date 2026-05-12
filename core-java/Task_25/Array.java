class sumOFElements{
	
	public static void main(String[] values){
		int[] numbers={1,3,5,6};
		int results = getSum(numbers);
		System.out.println("Total sum of Elements:"+results);
	}
	static int getSum(int[] values){
		int total=0;
		for(int total:values){
			total+=values;
		}
		return total;
	}
}