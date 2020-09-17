public class VisitBankAndDepositGold implements State <Bob> {

    //SINGLETON start
    private static VisitBankAndDepositGold INSTANCE = new VisitBankAndDepositGold();

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

    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Been lucky today! Gotta deposit the goods!");
        bob.depositAllGold();
        if (bob.hasEnoughForTheDay()){
            System.out.println("I've gathered " + bob.getGold() + " gold coins");
            System.out.print("Worked good. Gotta rest a bit");
            bob.resetDailyGold();
            bob.changeStates(GoHomeAndSleepTilRested.getInstance());
        }
        else{
            System.out.println("Need more. Gotta work harder!");
            bob.changeStates(EnterMineAndDigForNugget.getInstance());
        }
    }

    @Override
    public void exit(Bob bob) {

    }


}
