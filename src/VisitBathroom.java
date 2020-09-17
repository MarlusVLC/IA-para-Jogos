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

    }

    @Override
    public void execute(Bob bob) {
        System.out.println("Bathroom time!");
        bob.getStateMachine().revertToPreviousState();
    }

    @Override
    public void exit(Bob bob) {

    }
}
