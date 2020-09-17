public class WalkAroundTheFarm implements State <Billy> {

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
}
