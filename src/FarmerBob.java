public class FarmerBob {
   private int nuggets, gold, fatigue, thirsty, dailyGold;
//    State state;

    private State estadoAtual;

    public FarmerBob(){

        nuggets = 0;
        gold = 0;
        fatigue = 0;
        thirsty = 0;
        dailyGold = 0;

        //Instância de um objeto state para o estado inicial:
        estadoAtual = new EnterMineAndDigForNugget();

    }

    public void changeStates(State novoEstado){
        //Invoca o método de saída do estado
        estadoAtual.exit(this);

        //Faz a troca dos estados:
        estadoAtual = novoEstado;

        //Invoca o método de Entrada do novo estado:
        estadoAtual.enter(this);
    }

    public void ExecuteState(){
        while (true){
            estadoAtual.execute(this);
        }
    }

    //Aumenta em 1 a quantidade de pepitas
    public void addGoldNugget(){
        nuggets++;
    }


    public void increaseFatigue(int n){
        fatigue += n;
    }

    public void increaseThirsty(int n){
        thirsty += n;
    }

    public void eraseThirsty(){ thirsty = 0; }

    public void rest(){ fatigue--; }

    public boolean pocketsFull() {
        if (nuggets >= 5) { return true; }
        return false;
    }

    public boolean isThirsty() {
        if (thirsty >= 8) { return true; }
        return false;
    }

    public boolean isRested(){
        if (fatigue <= 0){
            fatigue = 0;
            return true;
        }
        return false;
    }

    public boolean hasEnoughForTheDay(){
        if (dailyGold >= 200){ return true; }
        return false;
    }

    public void resetDailyGold(){
        dailyGold = 0;
    }

    public void depositAllGold(){
        dailyGold += nuggets*10;
        nuggets = 0;
        gold += dailyGold;
    }

    public int getGold(){
        return gold;
    }
}
