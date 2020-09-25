package Communication;

import Entidades.Entity;

public class Message {
    private Entity sender;
    private Entity receiver;
    private String msg;
    private Object extrainfo;


    //Construtor:
    public Message(Entity msgSender, Entity msgReceiver, String message, Object extrainfo){
        this.sender = msgSender;
        this.receiver = msgReceiver;
        this.msg = message;
        this.extrainfo = extrainfo;
    }


    //Retorna o conteúdo da mensagem
    public String getMessage(){
        return msg;
    }
}
