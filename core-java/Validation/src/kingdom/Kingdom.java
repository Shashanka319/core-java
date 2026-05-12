package kingdom;

public class Kingdom {
    static void save(boolean king,String name,String kingdomName,String queenName,String princessName,int populationOfKingdom,String territory,int yearOfBirth,int yearOfDeath,int armySize,int yearsRuled){
        System.out.println("King:"+king);
        System.out.println("King Name:"+name);
        System.out.println("Kingdom Name:"+kingdomName);
        System.out.println("Queen Name:"+queenName);
        System.out.println("Princess Name:"+princessName);
        System.out.println("Population:"+populationOfKingdom);
        System.out.println("Territory"+territory);
        System.out.println("Year Of Birth:"+yearOfBirth);
        System.out.println("Year Of Death:"+yearOfDeath);
        System.out.println("Army Size:"+armySize);
        System.out.println("Years Ruled:"+yearsRuled);
        if(king==false){
            System.out.println("Data is invalid,make a King is there in Kingdom like true");
            return;
        }
        if(name==null){
            System.out.println("Data is invalid,make King Name is not null");
            return;
        }
        if(kingdomName==null){
            System.out.println("Data is invalid,Make a Kingdom Name is not null...");
            return;
        }
        if(queenName==null){
            System.out.println("Data is invalid, make a Queen Name is not Null...");
            return;
        }
        if(princessName==null){
            System.out.println("Data is invalid, Make a Princess Name is Not Null...");
            return;
        }
        if(populationOfKingdom==0){
            System.out.println("Data is invalid Make a Atleaast one of the pepole can add to kingdom");
            return;
        }
        if(territory==null){
            System.out.println("Data is invalid Make a Territory is not null...");
            return;
        }
        if(yearOfBirth<50){
            System.out.println("Data is invalid...");
            return;
        }
        if(yearOfDeath<0){
            System.out.println("Data is invalid...");
            return;
        }
        if(armySize<0){
            System.out.println("Data is invalid..");
            return;
        }
        if(yearsRuled<0){
            System.out.println("Data is invalid...");
            return;
        }
        System.out.println("Data is Valid......");

    }
    static void saveArmy(int noOfSoldiers,int noOfElephants,int noOfHorses,String type,int noOfWeapons,String commanderName,boolean commanderMarried,String commanderWife,boolean commanderFather,String commanderChildName,int commanderExperience){
        System.out.println("Numbaer Of Soldiers:"+noOfSoldiers);
        System.out.println("Numbaer Of Elephants:"+noOfElephants);
        System.out.println("Numbaer Of Horses:"+noOfHorses);
        System.out.println("Type:"+type);
        System.out.println("Numbaer Of Weapons:"+noOfWeapons);
        System.out.println("Commander Name:"+commanderName);
        System.out.println("Commander Married:"+commanderMarried);
        System.out.println("Commander Wife:"+commanderWife);
        System.out.println("Commander Father:"+commanderFather);
        System.out.println("Commander Child Name:"+commanderChildName);
        System.out.println("Commander Experience:"+commanderExperience);
        if(noOfSoldiers<0){
            System.out.println("Data is Invalid,atleast one Solder is present in Army ");
            return;
        }
        if(noOfElephants<0){
            System.out.println("Data is Invalid,atleast one Elephant is present in Army ");
            return;
        }
        if(noOfHorses<0){
            System.out.println("Data is Invalid,atleast one horse is present in Army ");
            return;
        }
        if(type==null){
            System.out.println("Data is Invalid,type is not a null");
            return;
        }
        if(noOfWeapons<0){
            System.out.println("Data is Invalid,atleast one Weapon is present in Army ");
            return;
        }
        if(commanderName==null){
            System.out.println("Data is Invalid,Commander Name is Not a Null");
            return;
        }
        if(commanderMarried==false){
            System.out.println("Data is Invalid");
            return;
        }
        if(commanderWife==null){
            System.out.println("Data is Invalid, Commander Wife is Not a Null");
            return;
        }
        if(commanderFather==false){
            System.out.println("Data is Invalid");
            return;
        }
        if(commanderChildName==null){
            System.out.println("Data is Invalid, Commander Child Name is not Null");
            return;
        }
        if(commanderExperience<0){
            System.out.println("Data is Invalid,Commander Having Atleast one year Experience");
            return;
        }
        System.out.println("Data is Valid");

    }
}
