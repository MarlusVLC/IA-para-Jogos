public class GoHomeAndSleepTilRested implements State {

    @Override
    public void enter(FarmerBob bob) {

    }

    @Override
    public void execute(FarmerBob bob) {
        if (bob.isRested()){
            System.out.println("Aaargh. New day. New Money!");
            bob.changeStates( new EnterMineAndDigForNugget());
        }
        bob.rest();
        System.out.println("ZZZzzzzZZZ... ZzZ!!");
    }

    @Override
    public void exit(FarmerBob bob) {

    }
}
