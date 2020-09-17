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
    public void enter(Billy farmer) {

    }

    @Override
    public void execute(Billy farmer) {
        System.out.println("Billy said tomorrow's gonna rain. Yeah");
        if (farmer.wantsToWalk()){
            farmer.changeStates(WalkAroundTheFarm.getInstance());
        }
    }

    @Override
    public void exit(Billy farmer) {

    }
}
