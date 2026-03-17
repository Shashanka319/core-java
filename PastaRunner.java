class PastaRunner {
    public static void main(String[] args) {
        String[] pastaArray = new String[10];
        Pasta pasta = new Pasta(pastaArray);

        
        pasta.savePastaType("Spaghetti");
        pasta.savePastaType("Penne");
        pasta.savePastaType("Fusilli");
        pasta.savePastaType("Macaroni");
        pasta.savePastaType("Farfalle");
        pasta.savePastaType("Rigatoni");
        pasta.savePastaType("Ravioli");
        pasta.savePastaType("Lasagna");
        pasta.savePastaType("Fettuccine");
        pasta.savePastaType("Gnocchi");

        pasta.searchPastaType("Fusilli");
        pasta.searchPastaType("Maggi");
    }
}