class StringReversedDemo{
	public static void main(String[]args){
		String original="LEVEL";
		String reversed="";
		for(int i=original.length()-1;i>=0;i--){
			reversed=reversed+original.charAt(i);
		}
		System.out.println("Original String:"+original);
		System.out.println("Reversed String:"+reversed);
		
	}
}