class OddNoCount{
	static int getOdd(int[] oddNum){
		int count = 0;
		for(int odd:oddNum){
			if(odd % 2!=0){
				count++;
			}
		}return count
	}
	public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7}; 
        
        int oddCount = getOdd(data);

        System.out.println("Number of odd integers: " + oddCount);
    }
}
}