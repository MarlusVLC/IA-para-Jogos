package States.BobStates;

import Communication.Message;
import Entidades.Bob;
import Entidades.Location;
import States.State;

public class VisitBathroom implements State<Bob> {

    //SINGLETON start
    private static VisitBathroom INSTANCE = null;

    private VisitBathroom(){}

    public static VisitBathroom getInstance(){
        if (INSTANCE == null){
            INSTANCE = new VisitBathroom();
        }
        return INSTANCE;
    }
    //SINGLETON end


    @Override
    public void enter(Bob bob) {
        if (bob.getLocation() != Location.BATHROOM){
            bob.setLocation(Location.BATHROOM);
        }
    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Bathroom time!");
        bob.getStateMachine().revertToPreviousState();
    }

    @Override
    public void exit(Bob bob) {

    }

    @Override
    public boolean onMessage(Bob bob, Message msg) {
        return false;
    }
}
