public class BebeLeite extends Thread{

    private void demora(){
        for (int i = 0; i < 10000000; i++) ;
    }

    public void run() {
        Geladeira geladeira = Geladeira.getInstance();

        while (true) {
            geladeira.verificaRegiaoCritica();
            if(geladeira.getLitrosDeLeite() != 0)
                System.out.println(geladeira.getLitrosDeLeite());
            if (geladeira.getLitrosDeLeite() > 0 && geladeira.getLitrosDeLeite() <= 10) {
                geladeira.beber();
            }
            for(int i = 0; i < 100000; i++) ;
        }
    }
}
