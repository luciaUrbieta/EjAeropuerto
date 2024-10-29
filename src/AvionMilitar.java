import org.json.JSONException;
import org.json.JSONObject;

/*
Militar: tiene un sistema de armas (aire-aire o aire-tierra) y cantidad de
balas
 */
public class AvionMilitar extends Avion implements AccesoRestringido{

    private SistemaDeArmas sistemaDeArmas;
    private int cantidadBalas;

    public AvionMilitar(){
    }

    public AvionMilitar(String nombreModelo, String marca, double capacidadCombustible, TipoMotor tipoMotor, int cantidadAsientos, SistemaDeArmas sistemaDeArmas, int cantidadBalas){
        super(nombreModelo, marca, capacidadCombustible, tipoMotor, cantidadAsientos);
        this.sistemaDeArmas=sistemaDeArmas;
        this.cantidadBalas=cantidadBalas;
    }

    public SistemaDeArmas getSistemaDeArmas() {
        return sistemaDeArmas;
    }

    public void setSistemaDeArmas(SistemaDeArmas sistemaDeArmas) {
        this.sistemaDeArmas = sistemaDeArmas;
    }

    public int getCantidadBalas() {
        return cantidadBalas;
    }

    public void setCantidadBalas(int cantidadBalas) {
        this.cantidadBalas = cantidadBalas;
    }

    @Override
    public JSONObject toJSON(){
        JSONObject avionMilitar = new JSONObject();
        try{
            avionMilitar.put("nombreModelo", getNombreModelo());
            avionMilitar.put("marca", getMarca());
            avionMilitar.put("capacidadCombustible", getCapacidadCombustible());
            avionMilitar.put("tipoMotor", getTipoMotor());
            avionMilitar.put("cantidadAsientos", getCantidadAsientos());
            avionMilitar.put("sistemaDeArmas", this.sistemaDeArmas);
            avionMilitar.put("cantidadBalas", this.cantidadBalas);
        }catch(JSONException e){
            System.out.println(e.getMessage());
        }
        return avionMilitar;
    }

    public String toString(){
        return "\nNombre del modelo: " + getNombreModelo() + "\nMarca: " + getMarca() + "\nCapacidad de combsutible: " + getCapacidadCombustible()
                + "\nTipo de motor " + getTipoMotor() + "\nCantidad de asientos: " + getCantidadAsientos() + "\nSistema de armas: " + sistemaDeArmas + "\nCantidad de balas " + cantidadBalas;
    }

    @Override
    public boolean ingreso() {
        return true;
    }
}
