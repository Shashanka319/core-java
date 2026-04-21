package wire;

public class WireRunner {
    public static void main(String[] args) {
        Wire wire = new Wire(10.0,1500.0, "Copper");
        Wire wire1 = new Wire(10.0,1500.0, "Copper");
        boolean check = wire.equals(wire1);
        System.out.println("Check="+check);
    }
}
