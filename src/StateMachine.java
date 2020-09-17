public class StateMachine <NPC> {
    //Define quem é o dono deste objeto:
    private NPC myOwner;

    //Define o estado atual:
    private State<NPC> currentState;

    //Define o estado anterior:
    private State<NPC> previousState;

    //Define o estado global
    private State<NPC> globalState;

    public StateMachine(NPC owner) {
        myOwner = owner;
        currentState = null;
        previousState = null;
        globalState = null;
    }


    //Invoca este método para atualizar a FSM
    public void update() {

        //Se existir um estado global, invoca o seu método execute,
        // do contrário nada é feito:
        if (globalState != null) {
            globalState.execute(myOwner);
        }

        //Idem para o estado atual:
        if (currentState != null){
            currentState.execute(myOwner);
        }
    }


    //Faz a troca de estados
    public void changeState(State<NPC> newState){

        //Armazena qual o estado anterior:
        previousState = currentState;

        //Invoca o método de saída do estadp atual:
        currentState.exit(myOwner);

        //Faz a troca de estados:
        currentState = newState;

        //Invoca o método de Entrada do novo estado:
        currentState.enter(myOwner);
    }


    //Muda para o estado anterior
    public void revertToPreviousState(){
        changeState(previousState);
    }









    public State<NPC> getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State<NPC> state) {
        this.currentState = state;
    }

    public State<NPC> getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State<NPC> state) {
        this.previousState = state;
    }

    public State<NPC> getGlobalState() {
        return globalState;
    }

    public void setGlobalState(State<NPC> State) {
        this.globalState = State;
    }
}
