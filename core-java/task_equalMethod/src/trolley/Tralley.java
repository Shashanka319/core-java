package trolley;

public class Tralley {
    String size;
    int count;
    String capacity;

    public Tralley(String size, int count, String capacity) {
        this.size = size;
        this.count = count;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Tralley{" +
                "size='" + size + '\'' +
                ", count=" + count +
                ", capacity='" + capacity + '\'' +
                '}';
    }
    public boolean equals(Object obj){
        Tralley left = this;
        if(obj instanceof  Tralley){
            Tralley right = (Tralley) obj;
            if(left.size==right.size && left.count== right.count && left.capacity== right.capacity){
                return true;
            }
        }
        return super.equals(obj);
    }
}
