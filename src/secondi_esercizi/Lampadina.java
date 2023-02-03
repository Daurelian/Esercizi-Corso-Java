package secondi_esercizi;

public class Lampadina {

    int[] stato;
    int contatore=0;
    int resistenza;

    public Lampadina() {
        this.stato = new int []{1,0,0};
        resistenza=5;
    }

    public Lampadina(int resistenza) {
        this.stato = new int []{1,0,0};
        this.resistenza=resistenza;
    }

    public void mostraStato(){
        if (stato[0]==1)
            System.out.println("Lampadina Spenta");
        else
            if (stato[1]==1)
                System.out.println("Lampadina Accesa");
            else
                System.out.println("Lampadina Rotta");
    }

    public void click(){
            if(stato[0]==1){
                this.stato[0]=0;
                this.stato[1]=1;
            }else{
                this.stato[0]=1;
                this.stato[1]=0;
            }
            contatore++;
            checkContatore();

        if(this.stato[2]==1){
            System.out.println("Boom!!!");
        }
    }

    public void checkContatore(){
        if (contatore==resistenza){
            this.stato[0]=0;
            this.stato[1]=0;
            this.stato[2]=1;
        }

    }
}
