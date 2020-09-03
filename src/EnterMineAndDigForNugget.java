import java.util.Random;

public class EnterMineAndDigForNugget implements  State{


    @Override
    public void enter(FarmerBob bob) {

    }

    @Override
    public void execute(FarmerBob bob) {
        System.out.println("Working... Alot... Mining...");

        //faz um rand para verificiar se ele conseguiu ou não achar uma pepita de ouro
        Random r = new Random();
        int rand = r.nextInt(2);
        if (rand==1) {
            bob.addGoldNugget();
            System.out.println("Lucky! A Gold Nugget!");
        } else {
            System.out.println("These Gold Nuggets are hard to find!");
        }

        //Indiferente de achar uma pepita de ouro, ele ganha fadiga
        bob.increaseFatigue(2);

        //e sede
        bob.increaseThirsty(1);

        //Verifica se atingiu alguma das condições p/ troca de estado:
        if(bob.pocketsFull()){
            bob.changeStates(new VisitBankAndDepositGold());
        }

        if(bob.isThirsty()){
            bob.changeStates(new QuenchyThirst());
        }
    }

    @Override
    public void exit(FarmerBob bob) {

    }
}
