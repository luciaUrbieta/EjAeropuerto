import org.json.JSONException;
import org.json.JSONObject;

public abstract class Avion {

    private String nombreModelo;
    private String marca;
    private double capacidadCombustible;
    private TipoMotor tipoMotor;
    private int cantidadAsientos;

    public Avion(){
    }

    public Avion(String nombreModelo, String marca, double capacidadCombustible, TipoMotor tipoMotor, int cantidadAsientos){
        this.nombreModelo=nombreModelo;
        this.marca=marca;
        this.capacidadCombustible=capacidadCombustible;
        this.tipoMotor=tipoMotor;
        this.cantidadAsientos=cantidadAsientos;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public void setCapacidadCombustible(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String despegar(){
        return "Despegando...";
    }

    public String volar(){
        return "Volando...";
    }

    public String aterrizar(){
        return "Aterrizando...";
    }

    public JSONObject toJSON(){
        JSONObject avion = new JSONObject();
        try{
            avion.put("nombreModelo", this.nombreModelo);
            avion.put("marca", this.marca);
            avion.put("capacidadCombustible", this.capacidadCombustible);
            avion.put("tipoMotor", this.tipoMotor);
            avion.put("cantidadAsientos", this.cantidadAsientos);
        }catch(JSONException e){
            System.out.println(e.getMessage());
        }
        return avion;
    }

    public String toString(){
        return "\nNombre del modelo: " + nombreModelo + "\nMarca: " + marca + "\nCapacidad de combsutible: " + capacidadCombustible
                + "\nTipo de motor " + tipoMotor + "\nCantidad de asientos: " + cantidadAsientos;
    }

}
