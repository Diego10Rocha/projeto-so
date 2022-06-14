public class Geladeira {
    private int litros_de_leite;
    int EM_USO = 0;
    private static Geladeira geladeira;

    public static Geladeira getInstance(){
        if(geladeira == null)
            geladeira = new Geladeira();
        return geladeira;
    }

    public void encher() {
        for (int i = 0; i<10;i++){
            this.litros_de_leite ++;
            geladeira.verificaRegiaoCritica();
        }
    }

    public void beber(){
        litros_de_leite --;
    }

    public void verificaRegiaoCritica(){
        if (litros_de_leite > 10) {
            System.out.println("ALERTA: A REGIÃO CRITÍCA NÃO FOI BEM TRATADA! -- Há " + litros_de_leite + " litros de leite!");
        }
    }

    public int getLitrosDeLeite() {
        return litros_de_leite;
    }

    public void setLitrosDeLeite(int litros_de_leite) {
        this.litros_de_leite = litros_de_leite;
    }
}
