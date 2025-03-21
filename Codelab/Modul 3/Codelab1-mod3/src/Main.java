public class Main{
    public static void main(String[] args) {
        KarakterGame npcahhpeople = new KarakterGame("Adi", 100);
        Pahlawan pahlawan = new Pahlawan("Argus Sehat wal afiat", 175);
        theOpps TheOpps = new theOpps("Julian kekebalan tubuh", 125);

        System.out.println("status awal");
        System.out.println(pahlawan.getName() + " memiliki " + pahlawan.getHp() + " Hp");
        System.out.println(TheOpps.getName() + " memiliki " + TheOpps.getHp() + " Hp");
        System.out.println(npcahhpeople.getName() + " memiliki " + npcahhpeople.getHp() + " Hp");

        pahlawan.serang(TheOpps);
        System.out.println();
        TheOpps.serang(pahlawan);
    }
}