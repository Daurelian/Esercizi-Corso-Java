package secondi_esercizi;

public class Lampadina {
    static boolean corrente= true;
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
//        if(corrente==false){
//            stato[0]=1;
//            stato[1]=0;
//        }
        if (stato[0]==1)
            System.out.println("Lampadina Spenta");
        else
            if (stato[1]==1)
                System.out.println("Lampadina Accesa");
            else
                System.out.println("Lampadina Rotta");
    }

    public void click(){
        if(!corrente){
            stato[0]=1;
            stato[1]=0;
        }else{
            if(this.stato[2]==1){
                    mostraStato();

        }else{
                if(this.stato[0]==1){
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

            }

    }

    public void checkContatore(){
        if (contatore==resistenza){
            this.stato[0]=0;
            this.stato[1]=0;
            this.stato[2]=1;
        }

    }
    public void interruttoreCorrente(){
        corrente=!corrente;
        System.out.println(corrente?"La corrente è attaccata": "La corrente è staccata");
        checkCorrente();
    }
    public void checkCorrente(){
        //Se volessimo che le lampadine si accendano al ritorno della corrente
        if(corrente){
            if(this.stato[2]==0){
                this.stato[0]=0;
                this.stato[1]=1;
            }else{
                this.stato[0]=0;
                this.stato[1]=0;
            }
        }
        //Altrimenti solo la riga sotto per spegnerle quando si stacca la corrente
        else{
            if(this.stato[2]==0) {
                stato[0] = 1;
                stato[1] = 0;
            }else{
                this.stato[0]=0;
                this.stato[1]=0;
            }

        }

    }
}
