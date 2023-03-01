package sesti_esercizi;

public class Main {
    public static void main(String[] args) {
        MappadiRighe.readByBufferedReaderMappe("src/sesti_esercizi/file_mappadirighe.txt");
        RigheInverse.readByBufferedReaderWriterRighe("src/sesti_esercizi/file_righeinverse.txt","src/sesti_esercizi/file_inverserigheinverse.txt");
    }
}
