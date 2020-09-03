public class QuenchyThirst implements State {
    @Override
    public void enter(FarmerBob bob) {

    }

    @Override
    public void execute(FarmerBob bob) {
        System.out.println("Hey, gimme somethin HARD to drink");
        bob.eraseThirsty();

        System.out.println("Gotta get back to work");
        bob.changeStates(new EnterMineAndDigForNugget());
    }

    @Override
    public void exit(FarmerBob bob) {

    }
}
