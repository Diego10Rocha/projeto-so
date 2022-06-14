public class Main {
    public static void main(String [] args) {
        Geladeira geladeira = Geladeira.getInstance();
        geladeira.setLitrosDeLeite(0);

        BebeLeite bebeLeite = new BebeLeite();
        Pai pai = new Pai();
        Mae mae = new Mae();
        Tio tio = new Tio();
        pai.start();
        mae.start();
        tio.start();
        bebeLeite.start();
    }
}
