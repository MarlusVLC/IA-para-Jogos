package Entidades;
import States.BillyStates.*;
import States.StateMachine;

import java.util.Random;

public class Billy extends Entity {

    String location;





    public Billy() {
        super("Billy");
        location = "Farm";
        r = new Random();

        //Instância a máquina de estados:
        this.stateMachine = new StateMachine<Billy>(this);

        //Seta o estado inicial:
        stateMachine.setCurrentState(LookAtTheWeather.getInstance());

        //Seta o estado global:
        stateMachine.setGlobalState(BillyGlobalState.getInstance());
    }


    public StateMachine<Billy> getStateMachine(){
        return this.stateMachine;
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


    @Override
    public void update() {
        stateMachine.update();
    }
}
