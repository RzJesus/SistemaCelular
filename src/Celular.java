public class Celular {

    String marca;
    String modelo;
    double precio;

    public Celular(){
        marca = "sin marca";
        modelo = "Sin modelo";
        precio = 0.0;
    }
    public Celular(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public void mostrarInformacion(){
        System.out.println("Marca"+ marca);
        System.out.println("Modelo"+ modelo);
        System.out.println("Precio"+ precio);
    }


}
