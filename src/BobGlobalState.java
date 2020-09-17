import java.util.Random;

public class BobGlobalState implements State <Bob> {

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
    public void enter(Bob  bob){

    }

    public void execute(Bob bob){
        Random r = new Random();
        int rand = r.nextInt(100);
        if (rand == 1){
            bob.getStateMachine().changeState(VisitBathroom.getInstance());
        }
    }

    public void exit(Bob bob){

    }

}
