public class QuenchyThirst implements State {

    //SINGLETON start
    private static final QuenchyThirst INSTANCE = new QuenchyThirst();

    private QuenchyThirst(){}

    public static QuenchyThirst getInstance(){
        return INSTANCE;
    }
    //SINGLETON end


    @Override
    public void enter(FarmerBob bob) {

    }

    @Override
    public void execute(FarmerBob bob) {
        System.out.println("Hey, gimme somethin HARD to drink");
        bob.eraseThirsty();

        System.out.println("Gotta get back to work");
        bob.changeStates(EnterMineAndDigForNugget.getInstance());
    }

    @Override
    public void exit(FarmerBob bob) {

    }
}
