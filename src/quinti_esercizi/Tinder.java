package quinti_esercizi;

import java.util.ArrayList;
import java.util.HashSet;

public class Tinder {
   private HashSet<User> users=new HashSet<>(0);

    public Tinder() {
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }

    public String findYourLovve(User e){
        ArrayList<User> list_lovvers= new ArrayList<>(0);
        int temp=0;
        for(User user: users){
            if(user.getId()==e.getId())
                continue;
            int count=0;
            for(Interest interest_e: e.getInterests()){
                for(Interest interest: user.getInterests()){
                    if(interest_e==interest){
                        count++;
                        break;
                    }

                }
            }
            if (list_lovvers.isEmpty() && count!=0){
                list_lovvers.add(user);
                temp=count;
            }else{
                if(count!=0 && count>temp){
                    list_lovvers.clear();
                    list_lovvers.add(user);
                    temp=count;
                }
            }
        }
        if(list_lovvers.isEmpty()){
            return "Non hai nessuna corrispondenza, sei solo come un cane";
        }else
        return "Il tuo lovve è : "+ list_lovvers.get(0).getName();
    }
}
