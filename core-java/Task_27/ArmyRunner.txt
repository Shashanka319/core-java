class ArmyRunner{

    public static void main(String[] args) {

        
        Soldier soldier = new Soldier();
        System.out.println(soldier.country);
        System.out.println(soldier.totalSoldiers);
        System.out.println(soldier.Location);
        System.out.println(soldier.name);
        System.out.println(soldier.position);
        System.out.println(soldier.trained);
        System.out.println(soldier.weapon);
        System.out.println(soldier.experience);
        soldier.attack();
        soldier.defend();
        soldier.displayDetails();

        Soldier soldier1 = new Soldier();
        System.out.println(soldier1.country);
        System.out.println(soldier1.totalSoldiers);
        System.out.println(soldier1.Location);
        System.out.println(soldier1.name);
        System.out.println(soldier1.position);
        System.out.println(soldier1.trained);
        System.out.println(soldier1.weapon);
        System.out.println(soldier1.experience);
        soldier1.attack();
        soldier1.defend();
        soldier1.displayDetails();

        
        Army army = new Soldier();
        System.out.println(army.country);
        System.out.println(army.totalSoldiers);
        System.out.println(army.Location);
        army.attack();
        army.defend();

        Army army1 = new Soldier();
        System.out.println(army1.country);
        System.out.println(army1.totalSoldiers);
        System.out.println(army1.Location);
        army1.attack();
        army1.defend();

        Army freedom = new Army();
        System.out.println(freedom.country);
        System.out.println(freedom.totalSoldiers);
        System.out.println(freedom.Location);
        freedom.attack();
        freedom.defend();

        Army freedom1 = new Army();
        System.out.println(freedom1.country);
        System.out.println(freedom1.totalSoldiers);
        System.out.println(freedom1.Location);
        freedom1.attack();
        freedom1.defend();
    }
}