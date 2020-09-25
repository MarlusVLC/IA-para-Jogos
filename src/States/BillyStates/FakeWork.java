package States.BillyStates;

import Communication.*;
import Entidades.Billy;
import Entidades.EntityManager;
import Entidades.Location;
import States.State;

import java.util.Random;

public class FakeWork implements State<Billy> {

    //SINGLETON start
    private static FakeWork INSTANCE = new FakeWork();

    private FakeWork(){}

    public static FakeWork getInstance(){
        if (INSTANCE == null){
            INSTANCE = new FakeWork();
        }
        return INSTANCE;
    }
    //SINGLETON end


    @Override
    public void enter(Billy billy) {
        if (billy.getLocation() != Location.FARM){
            billy.setLocation(Location.FARM);
        }
    }

    @Override
    public void execute(Billy billy) {
        System.out.println("Pretending to work...");
        System.out.println("Ahem... I mean... Working... Workin HARD!");

        Random r = new Random();

        int rand = r.nextInt(2);
        if (rand == 1){
            //NADA ACONTECE FEIJOADA
        } else {
            billy.getStateMachine().changeState(LookAtTheWeather.getInstance());
        }

    }

    @Override
    public void exit(Billy billy) {
        //Avisa o Bob que terminou o trabaio:
        MessageDispatcher.getInstance().dispatchMessage(billy, EntityManager.getInstance().getEntity("Bob"), "JobsDone!", null);
    }

    @Override
    public boolean onMessage(Billy billy, Message msg) {
        return false;
    }
}
