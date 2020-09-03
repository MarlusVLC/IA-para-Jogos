public class VisitBankAndDepositGold implements State {

    //SINGLETON start
    private static final VisitBankAndDepositGold INSTANCE = new VisitBankAndDepositGold();

    private VisitBankAndDepositGold(){}

    public static VisitBankAndDepositGold getInstance(){
        return INSTANCE;
    }
    //SINGLETON end

    @Override
    public void enter(FarmerBob bob) {

    }

    @Override
    public void execute(FarmerBob bob) {
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
    public void exit(FarmerBob bob) {

    }
}
