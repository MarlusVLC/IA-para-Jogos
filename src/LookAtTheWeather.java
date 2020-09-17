public class LookAtTheWeather implements State <Billy> {

    //SINGLETON start
    private static LookAtTheWeather INSTANCE = null;

    private LookAtTheWeather(){}

    public static LookAtTheWeather getInstance(){
        if (INSTANCE == null){
            INSTANCE = new LookAtTheWeather();
        }
        return INSTANCE;
    }
    //SINGLETON end


    @Override
    public void enter(Billy billy) {

    }

    @Override
    public void execute(Billy billy) {
        System.out.println("Billy said tomorrow's gonna rain. Yeah");
        if (billy.wantsToWalk()){
            billy.getStateMachine().changeState(WalkAroundTheFarm.getInstance());

        }
    }

    @Override
    public void exit(Billy billy) {

    }
}
