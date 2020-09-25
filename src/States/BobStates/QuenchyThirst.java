package States.BobStates;

import Communication.Message;
import Entidades.Bob;
import Entidades.Location;
import States.State;

public class QuenchyThirst implements State<Bob> {

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
        if (bob.getLocation() != Location.SALOON){
            bob.setLocation(Location.SALOON);
        }
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

    @Override
    public boolean onMessage(Bob bob, Message msg) {
        return false;
    }
}
