public class GoHomeAndSleepTilRested implements State <Bob> {


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
    public void enter(Bob bob) {

    }

    @Override
    public void execute(Bob bob) {
        if (bob.isRested()){
            System.out.println("Aaargh. New day. New Money!");
            bob.getStateMachine().changeState(EnterMineAndDigForNugget.getInstance());
        }
        bob.rest();
        System.out.println("ZZZzzzzZZZ... ZzZ!!");
    }

    @Override
    public void exit(Bob bob) {

    }
}
