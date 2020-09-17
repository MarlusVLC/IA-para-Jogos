import java.util.Random;

public class BillyGlobalState implements State <Billy>{
    //begin SINGLETON
    private static BillyGlobalState INSTANCE = null;

    private BillyGlobalState(){};

    public static BillyGlobalState getInstance(){
        if (INSTANCE == null){
            INSTANCE = new BillyGlobalState();
        }
        return INSTANCE;
    }
    //SINGLETON end

    @Override
    public void enter(Billy billy){

    }

    public void execute(Billy billy){
//        Random r = new Random();
//        int rand = r.nextInt(100);
//        if (rand == 1){
//            billy.getStateMachine().changeState(VisitBathroom.getInstance());
//        }
    }

    public void exit(Billy billy){

    }

}
