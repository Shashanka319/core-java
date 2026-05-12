class PastaRunner {
    public static void main(String[] args) {
        String[] shelf = new String[6];
        Pasta myPasta = new Pasta(shelf);

        myPasta.savePasta("Penne");
        myPasta.savePasta("Spaghetti");
        myPasta.savePasta("Fusilli");
        myPasta.savePasta("Macaroni");

    
        myPasta.searchPasta("Spaghetti");

        myPasta.update(2, "Farfalle"); 
        myPasta.update("Macaroni", "Ravioli");

        
        myPasta.delete(0); 
        myPasta.delete("Ravioli");
    }
}