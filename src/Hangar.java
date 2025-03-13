import org.json.JSONArray;
import java.util.ArrayList;
import java.util.List;

public class Hangar<T extends Avion> {

    private List<T> aviones;

    public Hangar(){
        aviones=new ArrayList<>();
    }

    public List<T> getAviones() {
        return aviones;
    }

    //manejar excepciones despues

    public void agregarAvion(T avion){
        aviones.add(avion);
    }

    public void eliminarAvion(T avion){
        aviones.remove(avion);
    }

    public String mostrarAvion(T avion){
        String retorno="El avion no fue encontrado.";
        for(T avionActual : aviones){
            if(avionActual.equals(avion)){
                retorno=avionActual.toString();
            }
        }
        return retorno;
    }

    public boolean estaVacio(){
        return aviones.isEmpty();
    }

    public T obtenerPorIndice(int index){
        return aviones.get(index);
    }

    public int size(){
        return aviones.size();
    }

    public JSONArray toJson(){
        JSONArray hangarJson = new JSONArray();
        for(T avion : aviones){
            hangarJson.put(avion.toJson());
        }
        return hangarJson;
    }

    public String toString(){
        StringBuilder string = new StringBuilder();
        for(T avionActual : aviones){
            string.append("\n-----------------------------------");
            string.append(avionActual.toString());
            string.append("\n-----------------------------------");
        }
        return string.toString();
    }

    //CREO QUE ES MEJOR HACER UN JSONArray
    /*
    public JSONObject toJson() {
        JSONObject avionesJson = new JSONObject();
        try {
            avionesJson.put("aviones", this.aviones);
        } catch (JSONException e) {
            System.out.println(e.getMessage());
        }
        return avionesJson;
    }
    */

}
