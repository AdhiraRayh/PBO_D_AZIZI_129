public class theOpps extends KarakterGame {
    public theOpps(String name, int hp) {
        super(name, hp);
    }

    @Override
    public void serang(KarakterGame target){
        System.out.println(getName() + " menyerang " + target.getName() + " menggunakan mandau wireless!");
        target.setHp(target.getHp() - 45);
        System.out.println(target.getName() + " sekarang memiliki " + target.getHp() + " hp tersisa!");

    }}
