import java.util.Random;

public class Farmer {
   Random r;

   private State estadoAtual;


   public Farmer() {
   }

   public void changeStates(State novoEstado){
      //Invoca o método de saída do estado
      getEstadoAtual().exit(this);

      //Faz a troca dos estados:
      setEstadoAtual(novoEstado);

      //Invoca o método de Entrada do novo estado:
      getEstadoAtual().enter(this);
   }

   public void ExecuteState() {
//        while (true){
//            estadoAtual.execute(this);
//        }
      getEstadoAtual().execute(this);
   }


   public State getEstadoAtual() {
      return estadoAtual;
   }

   public void setEstadoAtual(State estadoAtual) {
      this.estadoAtual = estadoAtual;
   }
}

