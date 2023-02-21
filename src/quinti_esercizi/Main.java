package quinti_esercizi;

public class Main {
    public static void main(String[] args) {
        User user1= new User("Giggino",1);
        User user2= new User("MarcoAntonio",2);
        User user3= new User("Belardo",3);
        User user4= new User("Baugigio",4);
        User user5= new User("AAAAron",5);
        User user6= new User("Barabba",6);

        Interest interest1= new Interest(1,"interest1");
        Interest interest2= new Interest(2,"interest2");
        Interest interest3= new Interest(3,"interest3");
        Interest interest4= new Interest(4,"interest4");
        Interest interest5= new Interest(5,"interest5");
        Interest interest6= new Interest(6,"interest6");
        Interest interest7= new Interest(7,"interest7");
        Interest interest8= new Interest(8,"interest8");


        Tinder tinder= new Tinder();



        user1.addInterest(interest1);
        user1.addInterest(interest2);
        user1.addInterest(interest3);
        user1.addInterest(interest4);

        user2.addInterest(interest1);
        user2.addInterest(interest2);
        user2.addInterest(interest3);
        user2.addInterest(interest4);

        user3.addInterest(interest2);
        user3.addInterest(interest3);
        user3.addInterest(interest4);

        user4.addInterest(interest3);
        user4.addInterest(interest4);

        user5.addInterest(interest4);

        user6.addInterest(interest5);



        tinder.addUser(user1);
        tinder.addUser(user2);
        tinder.addUser(user3);
        tinder.addUser(user4);
        tinder.addUser(user5);

        System.out.println("Inizializzo tutto");
        System.out.println();

        System.out.println("Faccio  la ricerca dei lovve per user1");
        System.out.println(tinder.findYourLovve(user1));
        System.out.println();
        System.out.println("Faccio  la ricerca dei lovve per user6");
        System.out.println(tinder.findYourLovve(user6));
        System.out.println();
        System.out.println("Faccio  la ricerca dei lovve per user4");
        System.out.println(tinder.findYourLovve(user4));
        System.out.println();

    }
}
