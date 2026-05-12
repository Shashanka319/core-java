class Pawn {
    String position;
    String color;
    boolean hasMoved;
    boolean isPromoted;
    int pointValue;

    Pawn() {}

    Pawn(String position) {
        this.position = position;
    }
    Pawn(boolean hasMoved) {
        this.hasMoved = hasMoved;
    }
    Pawn(String color, boolean isPromoted) {
        this.color = color;
        this.isPromoted = isPromoted;
    }

    Pawn(boolean hasMoved, String position) {
        this.hasMoved = hasMoved;
        this.position = position;
    }
    Pawn(int pointValue) {
        this.pointValue = pointValue;
    }
}