package Entidades;

import Communication.Message;
import States.StateMachine;

import java.util.Random;

public abstract class Entity {
   Random r;

   private String name;

   private Location location;

   protected StateMachine stateMachine;



   public Entity(String name) {
      this.name = name;

      //Faz o registro no entityManager:
      EntityManager.getInstance().registerEntity(this);
     // System.out.println(name + "Registered");
   }



   public boolean handleMessage(Message msg) {
      //System.out.println(msg.getMessage());
      return stateMachine.handleMessage(msg);
   }


   public String getName() {
      return this.name;
   }

   public Location getLocation() { return location;  }

   public void setLocation(Location location) {  this.location = location;  }


   public abstract void update();


}

