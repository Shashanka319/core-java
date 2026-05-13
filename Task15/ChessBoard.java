class ChessBoard {
    String material;
    int sizeInInches;
    String primaryColor;
    String secondaryColor;
    boolean isFoldable;

    ChessBoard() {}

    ChessBoard(String material, int sizeInInches, String primaryColor, String secondaryColor, boolean isFoldable) {
        this.material = material;
        this.sizeInInches = sizeInInches;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.isFoldable = isFoldable;
    }

    ChessBoard(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    ChessBoard(String primaryColor, String secondaryColor) {
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }
	
	ChessBoard(String primaryColor){
		this.primaryColor=primaryColor;
	}
	
	ChessBoard(boolean isFoldable){
		this.isFoldable=isFoldable;
		}
}