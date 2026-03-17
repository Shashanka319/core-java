class KettleRunner {
    public static void main(String[] args) {
        String[] brands = new String[5];
        Kettle kettle = new Kettle(brands);

        kettle.saveKettleName("Prestige");
        kettle.saveKettleName("Pigeon");
        kettle.saveKettleName("Havells");

        kettle.searchKettleName("Pigeon");

        kettle.update(0, "Butterfly");
        kettle.update("Havells", "Philips");

        kettle.delete(1);
        kettle.delete("Philips");
    }
}