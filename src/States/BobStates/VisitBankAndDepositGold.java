package States.BobStates;

import Communication.Message;
import Entidades.Bob;
import Entidades.Location;
import States.State;

public class VisitBankAndDepositGold implements State<Bob> {

    //SINGLETON start
    private static VisitBankAndDepositGold INSTANCE = null;

    private VisitBankAndDepositGold(){}

    public static VisitBankAndDepositGold getInstance(){
        if (INSTANCE == null){
            INSTANCE = new VisitBankAndDepositGold();
        }
        return INSTANCE;


    }
    //SINGLETON end

    @Override
    public void enter(Bob bob) {
        if (bob.getLocation() != Location.BANK){
            bob.setLocation(Location.BANK);
        }
    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Been lucky today! Gotta deposit the goods!");
        bob.depositAllGold();
        if (bob.hasEnoughForTheDay()){
            System.out.println("I've gathered " + bob.getGold() + " gold coins");
            System.out.print("Worked good. Gotta rest a bit");
            bob.resetDailyGold();
            bob.getStateMachine().changeState(GoHomeAndSleepTilRested.getInstance());
        }
        else{
            System.out.println("Need more. Gotta work harder!");
            bob.getStateMachine().changeState(EnterMineAndDigForNugget.getInstance());
        }
    }

    @Override
    public void exit(Bob bob) {

    }

    @Override
    public boolean onMessage(Bob bob, Message msg) {
        return false;
    }


}
