public class GoHomeAndSleepTilRested implements State {


    //SINGLETON start
    private static GoHomeAndSleepTilRested INSTANCE = new GoHomeAndSleepTilRested();

    private GoHomeAndSleepTilRested(){}

    public static GoHomeAndSleepTilRested getInstance(){
        if (INSTANCE == null){
            INSTANCE = new GoHomeAndSleepTilRested();
        }
        return INSTANCE;
    }
    //SINGLETON end

    @Override
    public void enter(Farmer bob) {

    }

    @Override
    public void execute(Farmer bob) {
        if (bob.isRested()){
            System.out.println("Aaargh. New day. New Money!");
            bob.changeStates( EnterMineAndDigForNugget.getInstance());
        }
        bob.rest();
        System.out.println("ZZZzzzzZZZ... ZzZ!!");
    }

    @Override
    public void exit(Farmer bob) {

    }
}
