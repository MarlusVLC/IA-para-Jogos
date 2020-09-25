package States.BillyStates;

import Communication.Message;
import Entidades.Billy;
import Entidades.Location;
import States.State;

public class WalkAroundTheFarm implements State<Billy> {

    //SINGLETON start
    private static WalkAroundTheFarm INSTANCE = null;

    private WalkAroundTheFarm(){}

    public static WalkAroundTheFarm getInstance(){
        if (INSTANCE == null){
            INSTANCE = new WalkAroundTheFarm();
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
        System.out.println("Billy's walking through the farm... That's what he does");

        if (billy.wantsToDoNothing()){
            billy.getStateMachine().changeState(LookAtTheWeather.getInstance());
        }
    }

    @Override
    public void exit(Billy billy) {

    }

    @Override
    public boolean onMessage(Billy billy, Message msg) {
        return false;
    }
}
