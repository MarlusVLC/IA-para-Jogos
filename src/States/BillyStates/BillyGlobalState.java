package States.BillyStates;

import Communication.Message;
import Entidades.Billy;
import States.State;

public class BillyGlobalState implements State<Billy> {
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



    @Override
    public void execute(Billy billy){

    }




    @Override
    public void exit(Billy billy){

    }



    @Override
    public boolean onMessage(Billy billy, Message msg){
        //Verifica se sabe tratar a mensagem:
        if (msg.getMessage().compareTo("GetToWork!")==0){
            billy.getStateMachine().changeState(FakeWork.getInstance());
            return true;
        } else {
            return false;
        }
    }

}
