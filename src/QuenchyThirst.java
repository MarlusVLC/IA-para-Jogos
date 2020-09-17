public class QuenchyThirst implements State <Bob> {

    //SINGLETON start
    private static QuenchyThirst INSTANCE = null;

    private QuenchyThirst(){}

    public static QuenchyThirst getInstance(){
        if (INSTANCE == null){
            INSTANCE = new QuenchyThirst();
        }
        return INSTANCE;
    }
    //SINGLETON end


    @Override
    public void enter(Bob bob) {
        //bob.setLocation("Saloon");
    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Hey, gimme somethin HARD to drink");
        bob.eraseThirsty();

        System.out.println("Gotta get back to work");
        //bob.changeStates(EnterMineAndDigForNugget.getInstance());
        bob.getStateMachine().changeState(EnterMineAndDigForNugget.getInstance());
    }

    @Override
    public void exit(Bob bob) {

    }
}
