import org.json.JSONException;
import org.json.JSONObject;

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

    public JSONObject toJSON() {
        JSONObject aeropuerto = new JSONObject();
        try {
            aeropuerto.put("aviones", this.aviones);
        } catch (JSONException e) {
            System.out.println(e.getMessage());
        }
        return aeropuerto;
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

}
