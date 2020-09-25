package States.BobStates;

import Communication.Message;
import Communication.MessageDispatcher;
import Entidades.Bob;
import Entidades.Entity;
import Entidades.EntityManager;
import Entidades.Location;
import States.State;

public class GoHomeAndSleepTilRested implements State<Bob> {


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
        if (bob.getLocation() != Location.FARM){
            bob.setLocation(Location.FARM);
        }

        bob.setBillyWorked(false);

        //Obtém uma referência pro Billy:
        Entity billy = EntityManager.getInstance().getEntity("Billy");

        //Envia a mensagem pro Billy ir trabaiá:
        MessageDispatcher.getInstance().dispatchMessage(bob, billy, "GetToWork!", null);
    }





    @Override
    public void execute(Bob bob) {
        //Verifica se o Billy trabalhou E se ele já descansou:
        if (bob.billyWorked() && bob.isRested()){
            System.out.print("Jesus. That lazy bum has finally finished!!");
            System.out.println("Well. Someone gotta work hard here");
            bob.getStateMachine().changeState(EnterMineAndDigForNugget.getInstance());
        }

        if (bob.isRested()){
            System.out.println("Waiting for my lazy brother to finish his work...");
        }

        bob.rest();
        System.out.println("ZZZzzzzZZZ... ZzZ!!");
    }





    @Override
    public void exit(Bob bob) {

    }





    @Override
    public boolean onMessage(Bob bob, Message msg) {
        return false;
    }
}
