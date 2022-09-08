package lutadeemojis;

public class LutaDeEmojis {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 11, 1, 2, 1.75f, 68.9f);
        l[1] = new Lutador("Putscript", "Brasil", 29, 14, 3, 2, 1.68f, 57.8f);
        l[2] = new Lutador("Snapshadow", "Estados Unidos", 35, 12, 1, 2, 1.65f, 80.9f);
        l[3] = new Lutador("DeadCode", "Austrália", 28, 13, 2, 0, 1.93f, 81.6f);
        l[4] = new Lutador("UFOCobol", "Inglaterra", 37, 5, 3, 4, 1.70f, 119.3f);
        l[5] = new Lutador("Nerdaart", "Chile", 30, 12, 4, 2, 1.81f, 105.7f);
        
        Luta UEC01 = new Luta();
        
        UEC01.marcarLuta(l[4], l[5]);
        UEC01.lutar();
        l[1].status();
        l[1].status();
    }
}