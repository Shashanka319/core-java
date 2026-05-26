class ChessBoardRunner{
	public static void main(String[] args){
		ChessBoard chessBoard=new ChessBoard();
		System.out.println("Chess Board Material:"+chessBoard.material);
		System.out.println("Chess Board Size In Inches:"+chessBoard.sizeInInches);
		System.out.println("Chess Board Primary Color:"+chessBoard.primaryColor);
		System.out.println("Chess Board Secondary Color:"+chessBoard.secondaryColor);
		System.out.println("Chess Board Is Foldable:"+chessBoard.isFoldable);
		
		ChessBoard chessBoard1=new ChessBoard();
		System.out.println("Chess Board Material:"+chessBoard1.material);
		System.out.println("Chess Board Size In Inches:"+chessBoard1.sizeInInches);
		System.out.println("Chess Board Primary Color:"+chessBoard1.primaryColor);
		System.out.println("Chess Board Secondary Color:"+chessBoard1.secondaryColor);
		System.out.println("Chess Board Is Foldable:"+chessBoard1.isFoldable);
		
		ChessBoard chessBoard2=new ChessBoard(5);
		System.out.println("CHess Board Size:"+chessBoard2.sizeInInches);
		
		ChessBoard chessBoard3=new ChessBoard("Cream ","yellow");
		System.out.println("Chess Board Primary Color:"+chessBoard3.primaryColor);
		System.out.println("Chess Board secondary Color :"+chessBoard3.secondaryColor);
		
		ChessBoard chessBoard4=new ChessBoard("Cream");
		System.out.println("Chess Board Primary Color:"+chessBoard4.primaryColor);
		
		ChessBoard chessBoard5=new ChessBoard(true);
		System.out.println("Chess Board Is Foldable:"+chessBoard5.isFoldable);
		
		
		
		
		
	}
}