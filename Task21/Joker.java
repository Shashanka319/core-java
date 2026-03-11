class Joker {
    double[]  ticket;
    JokerType[] type;

    Joker(double[]  ticket, JokerType[] type) {
        this.ticket = ticket;
        this.type = type;
    }

    void display() {
        System.out.println("Current Tricks:");
        if (ticket != null) {
            for (double tickets : ticket) {
               
				System.out.println("Ticket Price:" + tickets);
                
            }
        }

        System.out.println("Jocker Informations:");
        if (type != null) {
            for (JokerType types :this.type) {
                if (types != null) {
                    System.out.println("Joker type:" + types.type );
					System.out.println("Joker Activity:"+types.activity);
                }
            }
        }
    }
}