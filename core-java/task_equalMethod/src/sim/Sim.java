package sim;

public class Sim {
    String name;
    double cost;
    boolean currency;

    @Override
    public String toString() {
        return "Sim{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", currency=" + currency +
                '}';
    }

    public Sim(String name, double cost, boolean currency) {
        this.name = name;
        this.cost = cost;
        this.currency = currency;
    }
    public boolean equals(Object obj){
        Sim left= this;
        if(obj instanceof Sim){
            Sim right =(Sim)obj;
            if(left.name==right.name && left.cost== right.cost && left.currency== right.currency){
                return true;
            }
        }
        return super.equals(obj);
    }
}
