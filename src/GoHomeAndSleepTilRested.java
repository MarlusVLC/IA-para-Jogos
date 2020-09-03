public class GoHomeAndSleepTilRested implements State {


    //SINGLETON start
    private static final GoHomeAndSleepTilRested INSTANCE = new GoHomeAndSleepTilRested();

    private GoHomeAndSleepTilRested(){}

    public static GoHomeAndSleepTilRested getInstance(){
        return INSTANCE;
    }
    //SINGLETON end

    @Override
    public void enter(FarmerBob bob) {

    }

    @Override
    public void execute(FarmerBob bob) {
        if (bob.isRested()){
            System.out.println("Aaargh. New day. New Money!");
            bob.changeStates( EnterMineAndDigForNugget.getInstance());
        }
        bob.rest();
        System.out.println("ZZZzzzzZZZ... ZzZ!!");
    }

    @Override
    public void exit(FarmerBob bob) {

    }
}
