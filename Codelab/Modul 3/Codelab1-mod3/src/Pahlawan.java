public class Pahlawan extends KarakterGame{
    public Pahlawan(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void serang(KarakterGame target){
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan pedang!");
        target.setHp(target.getHp() - 30);
        System.out.println(target.getName() + " sekarang memiliki " + target.getHp() + " hp tersisa!");

    }
}
