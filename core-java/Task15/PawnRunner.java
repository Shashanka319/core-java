class PawnRunner{
	public static void main(String [] args){
		Pawn pawn=new Pawn();
		System.out.println("Pawn Position:"+pawn.position);
		System.out.println("Pawn Color:"+pawn.color);
		System.out.println("Pawn Has Moved:"+pawn.hasMoved);
		System.out.println("Pawn Is Promoted:"+pawn.isPromoted);
		System.out.println("Pawn Point Value:"+pawn.pointValue);
		
		Pawn pawn1=new Pawn("e3");
		System.out.println("Pawn Position:"+pawn1.position);
		
		Pawn pawn2=new Pawn(true);
		System.out.println("Pawn Has Moved:"+pawn2.hasMoved);
		
		Pawn pawn3=new Pawn("White",true);
		System.out.println("Pawn Color:"+pawn3.color);
		System.out.println("Pawn Is Promoted:"+pawn3.isPromoted);
		
		
		Pawn pawn4=new Pawn(true,"e6");
		System.out.println("Pawn Has Moved:"+pawn4.hasMoved );
		System.out.println("Pawn Position:"+pawn4.position);
		
		Pawn pawn6=new Pawn(10);
		System.out.println("Pawn Point Value:"+pawn6.pointValue);
		
		
	}
}