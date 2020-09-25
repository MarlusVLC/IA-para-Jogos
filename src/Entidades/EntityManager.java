package Entidades;

import java.util.HashMap;

public class EntityManager {
    //HashMap onde são registradas todas as instâncias do jogo:
    private HashMap<String, Entity> map;

    //SINGLETON start
    private static EntityManager INSTANCE = null;

    private EntityManager(){
        map = new HashMap<String, Entity>();
    }

    public static EntityManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new EntityManager();
        }
        return INSTANCE;
    }
    //SINGLETON end

    public void registerEntity(Entity newEntity){
        map.put(newEntity.getName(),newEntity);
    }

    public Entity getEntity(String name){
        Entity entity = map.get(name);
        return entity;
    }

    public void removeEntity(Entity entity){
        map.remove(entity.getName());
    }

    public HashMap getMap(){
        return map;
    }
}
