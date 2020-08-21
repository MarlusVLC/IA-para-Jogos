import java.util.ArrayList;
import java.util.Random;

public class Bob {
//    ArrayList<Location> locations;
    Location currLoc;
    int thirst, fatigue, totalGold, currentGold;
    int maxThirst = 10;
    int minFatigue = 0;
    int maxCurrGold = 10;
    int maxGoldpDay = 20;
    int GoldChance = 2;
    boolean EnterMineAndDigForGold, VisitBankAndDepositGold,
            GoHomeAndSleepTilRested, QuenchThirst, Dead;



    public Bob() {
//        locations = new ArrayList<Location>();
        EnterMineAndDigForGold = true;
        thirst = 0;
        fatigue = 0;
        currentGold = 0;
    }

    public void FSM(){
        while (!Dead){
            Random rand = new Random();
            System.out.println("Thirst: " + thirst);
            System.out.println("Fatigue: " + fatigue);
            System.out.println("Current Gold in Pockets" + currentGold);
            System.out.println("Total Gold: " + totalGold);

            thirst+=1;

            if (thirst >= maxThirst){ //QuenchyThirst
                while (thirst >= 0){
                    System.out.println("Gimme somethin' to drink!!!");
                    thirst -= 1;
                }
            }

            if (EnterMineAndDigForGold){
                if (currLoc != Location.MINE ){ currLoc = Location.MINE; }
                int goldRand = rand.nextInt(GoldChance);
                currentGold += goldRand;
                fatigue += 1;
                System.out.println("I'm minin'!");
                if (currentGold >= maxCurrGold){
                    currentGold = maxCurrGold;
                    EnterMineAndDigForGold = false;
                    VisitBankAndDepositGold = !EnterMineAndDigForGold;
                }
            }

            if (VisitBankAndDepositGold){
                if (currLoc != Location.BANK) { currLoc = Location.BANK; }
                totalGold += currentGold;
                currentGold = 0;
                System.out.println("Get outta here! You ain't stealin mah money!");
                if (totalGold >= maxGoldpDay){
                    VisitBankAndDepositGold = false;
                    GoHomeAndSleepTilRested = !VisitBankAndDepositGold;
                } else {
                    VisitBankAndDepositGold = false;
                    EnterMineAndDigForGold = !VisitBankAndDepositGold;
                }
            }

            if (GoHomeAndSleepTilRested){
                while (fatigue > 0){
                    System.out.println("ZZZzzzzZZZ...ZZZZZ!!!?");
                    fatigue -= 2; }
                GoHomeAndSleepTilRested = false;
                EnterMineAndDigForGold = !GoHomeAndSleepTilRested;
            }
            System.out.println(" ");
        }
    }
}