import org.json.JSONException;
import org.json.JSONObject;

public class AvionPrivado extends Avion implements ServicioPasajeros {

    private boolean jaccuzzi;
    private String claveWifi;

    public AvionPrivado(){
    }

    public AvionPrivado(String nombreModelo, String marca, double capacidadCombustible, TipoMotor tipoMotor, int cantidadAsientos, boolean jaccuzzi, String claveWifi){
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.jaccuzzi=jaccuzzi;
        this.claveWifi=claveWifi;
    }

    public boolean isJaccuzzi() {
        return jaccuzzi;
    }

    public void setJaccuzzi(boolean jaccuzzi) {
        this.jaccuzzi = jaccuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    // no se que se pretendia de este metodo
    public boolean verMundial(){
        return true;
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
    public JSONObject toJson(){
        JSONObject avionPrivado = new JSONObject();
        try{
            avionPrivado.put("nombreModelo", getNombreModelo());
            avionPrivado.put("marca", getMarca());
            avionPrivado.put("capacidadCombustible", getCapacidadCombustible());
            avionPrivado.put("tipoMotor", getTipoMotor());
            avionPrivado.put("cantidadAsientos", getCantidadAsientos());
            avionPrivado.put("jaccuzzi", this.jaccuzzi);
            avionPrivado.put("claveWifi", this.claveWifi);
        }catch(JSONException e){
            System.out.println(e.getMessage());
        }
        return avionPrivado;
    }

    public String toString(){
        return "\nNombre del modelo: " + getNombreModelo() + "\nMarca: " + getMarca() + "\nCapacidad de combsutible: " + getCapacidadCombustible()
                + "\nTipo de motor " + getTipoMotor() + "\nCantidad de asientos: " + getCantidadAsientos() + "\nJaccuzzi: " + jaccuzzi + "\nClave de wifi: " + claveWifi;
    }
}
