package Communication;

import Entidades.Entity;

public class MessageDispatcher {
    //SINGLETON start
    private static MessageDispatcher INSTANCE = null;

    private MessageDispatcher(){}

    public static MessageDispatcher getInstance(){
        if (INSTANCE == null){
            INSTANCE = new MessageDispatcher();
        }
        return INSTANCE;
    }

    //
    public void dispatchMessage(Entity msgSender, Entity msgReceiver, String message, Object extrainfo){
        //Cria a mensagem:
        Message msg = new Message (msgSender, msgReceiver, message, extrainfo);

        //Entrega a mensagem:
        deliverMessage(msgReceiver, msg);
    }


    private void deliverMessage(Entity receiver, Message msg){
//        System.out.println("msg00");

        if (!receiver.handleMessage(msg)){
            //System.out.println("Deu merda!!");
            System.out.println("Nao consigo ler!");
        }
    }

}
