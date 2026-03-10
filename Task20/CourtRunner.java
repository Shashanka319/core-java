class CourtRunner{
    public static void main(String[] args) {
        
        LegalCase case1 = new LegalCase("505-B", "Hindhu vs Muslim");
        LegalCase case2 = new LegalCase("101-A", "Company A vs Company B");

        Court court1 = new Court("City Plaza Court", case1, CourtType.DISTRICT);
        Court court2 = new Court("Federal High Court", case2, CourtType.HIGH_COURT);
        Court court3 = new Court("Apex Court", null, CourtType.SUPREME_COURT);

        court1.displaySessionInfo();
        court2.displaySessionInfo();
        court3.displaySessionInfo();
    }
}