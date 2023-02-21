package quinti_esercizi;

import java.util.HashSet;

public class User {
   private  String name;
   private  int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private HashSet<Interest> interests= new HashSet<>(0);

    public HashSet<Interest> getInterests() {
        return interests;
    }

    public User(String name, int id) {
        this.id=id;
        this.name = name;
    }

    public void addInterest(Interest interest){
        interests.add(interest);
    }

    public void removeInterest(Interest interest){
        interests.remove(interest);
    }

    public String toString(){
        return this.getName();
    }


}
