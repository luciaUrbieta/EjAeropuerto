import org.json.JSONException;
import org.json.JSONObject;

public class AvionComercial extends Avion implements ServicioPasajeros{

    private int cantidadAzafatas;
    private String listaServicios;

    public AvionComercial(){
    }

    public AvionComercial(String nombreModelo, String marca, double capacidadCombustible, TipoMotor tipoMotor, int cantidadAsientos, int cantidadAzafatas, String listaServicios){
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.cantidadAzafatas=cantidadAzafatas;
        this.listaServicios=listaServicios;
    }

    public int getCantidadAzafatas() {
        return cantidadAzafatas;
    }

    public void setCantidadAzafatas(int cantidadAzafatas) {
        this.cantidadAzafatas = cantidadAzafatas;
    }

    public String getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(String listaServicios) {
        this.listaServicios = listaServicios;
    }

    @Override
    public String servirComida() {
        return "Sirviendo comida...";
    }

    @Override
    public String darMantas() {
        return "Dando mantas...";
    }

    @Override
    public JSONObject toJSON(){
        JSONObject avionComercial = new JSONObject();
        try{
            avionComercial.put("nombreModelo", getNombreModelo());
            avionComercial.put("marca", getMarca());
            avionComercial.put("capacidadCombustible", getCapacidadCombustible());
            avionComercial.put("tipoMotor", getTipoMotor());
            avionComercial.put("cantidadAsientos", getCantidadAsientos());
            avionComercial.put("cantidadAzafatas", this.cantidadAzafatas);
            avionComercial.put("listaServicios", this.listaServicios);
        }catch(JSONException e){
            System.out.println(e.getMessage());
        }
        return avionComercial;
    }

    public String toString(){
        return "\nNombre del modelo: " + getNombreModelo() + "\nMarca: " + getMarca() + "\nCapacidad de combsutible: " + getCapacidadCombustible()
                + "\nTipo de motor " + getTipoMotor() + "\nCantidad de asientos: " + getCantidadAsientos() + "\nCantidad de azafatas: " + cantidadAzafatas + "\nLista de servicios: " + listaServicios;
    }
}
