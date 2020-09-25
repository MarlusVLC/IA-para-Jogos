package States.BobStates;

import Communication.Message;
import Entidades.Bob;
import States.State;

import java.util.Random;

public class BobGlobalState implements State<Bob> {

    //begin SINGLETON
    private static BobGlobalState INSTANCE = null;

    private BobGlobalState(){};

    public static BobGlobalState getInstance(){
        if (INSTANCE == null){
            INSTANCE = new BobGlobalState();
        }
        return INSTANCE;
    }
    //SINGLETON end

    @Override
    public void enter(Bob bob){

    }


    @Override
    public void execute(Bob bob){
        Random r = new Random();
        int rand = r.nextInt(100);
        if (rand == 1){
            bob.getStateMachine().changeState(VisitBathroom.getInstance());
        }
    }



    @Override
    public void exit(Bob bob){

    }



    @Override
    public boolean onMessage(Bob bob, Message msg) {
        if (msg.getMessage().compareToIgnoreCase("JobsDone!")==0){
            bob.setBillyWorked(true);
            System.out.println("DutyDone");
            return true;
        } else {
            return false;
        }
    }

}
