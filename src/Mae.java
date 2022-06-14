public class Mae extends Thread{

    public void run() {
        Geladeira geladeira = Geladeira.getInstance();
        //Vai ficar sempre verificando se a geladeira está vazia para repor os leites se ninguém estiver olhando
        while (geladeira.EM_USO == 0) {
            geladeira.EM_USO = 1;
            if (geladeira.getLitrosDeLeite() == 0) {

                geladeira.encher();
                System.out.println(geladeira.getLitrosDeLeite());
                geladeira.EM_USO = 0;
            }
        }
    }
}
