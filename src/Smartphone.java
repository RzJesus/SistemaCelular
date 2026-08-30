public class Smartphone extends Celular {
    String sistemaOperativo;
    int memoriaRam;
    public Smartphone(String marca, String  modelo, double precio, String sistemaOperativo, int memoriaRam){

        super(marca, modelo, precio);

        this.sistemaOperativo = sistemaOperativo;
        this.memoriaRam = memoriaRam;
    }

}
