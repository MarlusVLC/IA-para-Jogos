import java.util.Random;

public class Billy extends Farmer {


    private StateMachine stateMachine;

    public Billy() {

        r = new Random();

        //Instância a máquina de estados:
        stateMachine = new StateMachine<Billy>(this);

        //Seta o estado inicial:
        stateMachine.setCurrentState(LookAtTheWeather.getInstance());

        //Seta o estado global:
        stateMachine.setGlobalState(BobGlobalState.getInstance());
    }


    public StateMachine<Billy> getStateMachine(){
        return stateMachine;
    }




    //BILLY
    public boolean wantsToDoNothing(){
        if (r.nextDouble() <= 0.25){
            return true;
        }
        return false;
    }

    public boolean wantsToWalk(){
        if (r.nextDouble() <= 0.75){
            return true;
        }
        return false;
    }


}
