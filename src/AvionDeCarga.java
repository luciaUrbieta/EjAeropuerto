/*
● De carga: tiene la cantidad de kilos que puede administrar y una lista
de posibles productos a transportar
 */

import org.json.JSONException;
import org.json.JSONObject;

public class AvionDeCarga extends Avion implements AccesoRestringido {

    private double capacidadKg;
    private String listadoProductos;

    public AvionDeCarga(){
    }

    public AvionDeCarga(String nombreModelo, String marca, double capacidadCombustible, TipoMotor tipoMotor, int cantidadAsientos, double capacidadKg, String listadoProductos){
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.capacidadKg=capacidadKg;
        this.listadoProductos=listadoProductos;
    }

    public double getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(double capacidadKg) {
        this.capacidadKg = capacidadKg;
    }

    public String getListadoProductos() {
        return listadoProductos;
    }

    public void setListadoProductos(String listadoProductos) {
        this.listadoProductos = listadoProductos;
    }

    @Override
    public JSONObject toJSON(){
        JSONObject avionDeCarga = new JSONObject();
        try{
            avionDeCarga.put("nombreModelo", getNombreModelo());
            avionDeCarga.put("marca", getMarca());
            avionDeCarga.put("capacidadCombustible", getCapacidadCombustible());
            avionDeCarga.put("tipoMotor", getTipoMotor());
            avionDeCarga.put("cantidadAsientos", getCantidadAsientos());
            avionDeCarga.put("capacidadKg", this.capacidadKg);
            avionDeCarga.put("listadoProductos", this.listadoProductos);
        }catch(JSONException e){
            System.out.println(e.getMessage());
        }
        return avionDeCarga;
    }

    public String toString(){
        return "\nNombre del modelo: " + getNombreModelo() + "\nMarca: " + getMarca() + "\nCapacidad de combsutible: " + getCapacidadCombustible()
                + "\nTipo de motor " + getTipoMotor() + "\nCantidad de asientos: " + getCantidadAsientos() + "\nCapacidad de kg a administrar: " + capacidadKg + "\nListado de productos: "
                + listadoProductos;
    }

    @Override
    public boolean ingreso() {
        return true;
    }
}
