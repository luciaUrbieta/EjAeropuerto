import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Aeropuerto {

    private String nombre;
    private static int codigoInternacional=0;
    private String direccion;
    private int capacidadOperacion;
    public Hangar<AvionComercial> avionesComerciales;
    public Hangar<AvionPrivado> avionesPrivados;
    public Hangar<AvionDeCarga> avionesDeCarga;
    public Hangar<AvionMilitar> avionesMilitares;
    private int avionesInstanciados = 0;

    public Aeropuerto(){
    }

    public Aeropuerto(String nombre, String direccion, int capacidadOperacion){
        this.nombre=nombre;
        codigoInternacional=codigoInternacional++;
        this.direccion=direccion;
        this.capacidadOperacion=capacidadOperacion;
        avionesComerciales=new Hangar<AvionComercial>();
        avionesPrivados=new Hangar<AvionPrivado>();
        avionesDeCarga=new Hangar<AvionDeCarga>();
        avionesMilitares=new Hangar<AvionMilitar>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoInternacional() {
        return codigoInternacional;
    }

    public void setCodigoInternacional(int codigoInternacional) {
        this.codigoInternacional = codigoInternacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidadOperacion() {
        return capacidadOperacion;
    }

    public void setCapacidadOperacion(int capacidadOperacion) {
        this.capacidadOperacion = capacidadOperacion;
    }

    public int getAvionesInstanciados() {
        return avionesInstanciados;
    }

    //manejar limite de capacidad de operacion
    //si quisiera instanciar los aviones en esta clase, como haria para manejar los datos que requiere cada tipo?

    public void agregarAvion(Avion avion) throws LimiteDeAvionesSuperadoException{
        try{
            Excepciones.verificarLimiteAviones(capacidadOperacion, avionesInstanciados);
            if (avion instanceof AvionComercial) {
                avionesComerciales.agregarAvion((AvionComercial) avion);
            } else if (avion instanceof AvionPrivado) {
                avionesPrivados.agregarAvion((AvionPrivado) avion);
            } else if (avion instanceof AvionDeCarga) {
                avionesDeCarga.agregarAvion((AvionDeCarga) avion);
            } else if (avion instanceof AvionMilitar) {
                avionesMilitares.agregarAvion((AvionMilitar) avion);
            }
            this.avionesInstanciados=this.avionesInstanciados+1;
        }catch(LimiteDeAvionesSuperadoException e){
            System.out.println(e.getMessage());
        }
    }

    public void mostrarAvion(Avion avion){
        if (avion instanceof AvionComercial) {
            avionesComerciales.mostrarAvion((AvionComercial) avion);
        } else if (avion instanceof AvionPrivado) {
            avionesPrivados.mostrarAvion((AvionPrivado) avion);
        } else if (avion instanceof AvionDeCarga) {
            avionesDeCarga.mostrarAvion((AvionDeCarga) avion);
        } else if (avion instanceof AvionMilitar) {
            avionesMilitares.mostrarAvion((AvionMilitar) avion);
        }
    }

    //manejar posible error con excepciones
    public String  eliminarAvion(Avion avion){
        String retorno="El avion fue eliminado con exito";
        if (avion instanceof AvionComercial) {
            avionesComerciales.eliminarAvion((AvionComercial) avion);
        } else if (avion instanceof AvionPrivado) {
            avionesPrivados.eliminarAvion((AvionPrivado) avion);
        } else if (avion instanceof AvionDeCarga) {
            avionesDeCarga.eliminarAvion((AvionDeCarga) avion);
        } else if (avion instanceof AvionMilitar) {
            avionesMilitares.eliminarAvion((AvionMilitar) avion);
        } else {
            System.out.println("No se encuentra el avión.");
        }
        avionesInstanciados=avionesInstanciados--;
        return retorno;
    }

    public String despegarHangarCompleto(String tipoAvion){

        String retorno = "Tipo de avion no encontrado";

        if(tipoAvion.equalsIgnoreCase("avion comercial")){
            try{
                Excepciones.verificarHangarAvionesComerciales(avionesComerciales);
                for(AvionComercial avionComercial : avionesComerciales.getAviones()){
                    System.out.println(avionComercial.despegar());
                }
                retorno="Despegaron todos los aviones comerciales";
            }catch(HangarVacioException e){
                retorno = e.getMessage();
            }
        }else if (tipoAvion.equalsIgnoreCase("avion de carga")){
            try{
                Excepciones.verificarHangarAvionesDeCarga(avionesDeCarga);
                for(AvionDeCarga avionDeCarga : avionesDeCarga.getAviones()){
                    System.out.println(avionDeCarga.despegar());
                }
                retorno="Despegaron todos los aviones de carga";
            }catch(HangarVacioException e){
                retorno = e.getMessage();
            }
        }else if(tipoAvion.equalsIgnoreCase("avion militar")){
            try{
                Excepciones.verificarHangarAvionesMilitares(avionesMilitares);
                for(AvionMilitar avionMilitar : avionesMilitares.getAviones()){
                    System.out.println(avionMilitar.despegar());
                }
                retorno="Despegaron todos los aviones militares";
            }catch(HangarVacioException e){
                retorno = e.getMessage();
            }
        }else if(tipoAvion.equalsIgnoreCase("avion privado")){
            try{
                Excepciones.verificarHangarAvionesPrivados(avionesPrivados);
                for(AvionPrivado avionPrivado : avionesPrivados.getAviones()){
                    System.out.println(avionPrivado.despegar());
                }
                retorno="Despegaron todos los aviones privados";
            }catch(HangarVacioException e){
                retorno = e.getMessage();
            }
        }
        return retorno;
    }

    public JSONObject toJson(){
        JSONObject aeropuertoJson = new JSONObject();

            aeropuertoJson.put("nombre", this.nombre);
            aeropuertoJson.put("codigoInternacional", this.codigoInternacional);
            aeropuertoJson.put("direccion", this.direccion);
            aeropuertoJson.put("capacidadOperacion", this.capacidadOperacion);
            aeropuertoJson.put("avionesComerciales", this.avionesComerciales.toJson());
            aeropuertoJson.put("avionesDeCarga", avionesDeCarga.toJson());
            aeropuertoJson.put("avionesMilitares", avionesMilitares.toJson());
            aeropuertoJson.put("avionesPrivados", avionesPrivados.toJson());
            aeropuertoJson.put("avionesInstanciados", this.avionesInstanciados);


        return aeropuertoJson;
    }

    /*
    public JSONArray hangaresToJson(){
        JSONArray hangarArray = new JSONArray();
        hangarArray.put(this.avionesComerciales.toJson());
        hangarArray.put(this.avionesDeCarga.toJson());
        hangarArray.put(this.avionesMilitares.toJson());
        hangarArray.put(this.avionesPrivados.toJson());
        return hangarArray;
    }
    */
    /*  USO DEL CONDICIONAL TERNARIO PARA LOS HANGARES.
    Primero se evalúa si avionesComerciales no es null. Si no es null, llama al metodo toJson() del objeto avionesComerciales, que debería devolver un JSONObject con los datos
    de ese hangar (y de los aviones que contiene). Si es null, se asigna null en lugar de un JSONObject, evitando posibles errores. */
    /*
    public JSONObject toJSON() {
        JSONObject aeropuerto = new JSONObject();
        try {
            aeropuerto.put("nombre", this.nombre);
            aeropuerto.put("codigoInternacional", this.codigoInternacional);
            aeropuerto.put("direccion", this.direccion);
            aeropuerto.put("capacidadOperacion", this.capacidadOperacion);
            aeropuerto.put("avionesComerciales", this.avionesComerciales != null ? this.avionesComerciales.to : null);
            aeropuerto.put("avionesPrivados", this.avionesPrivados != null ? this.avionesPrivados.toJson() : null);
            aeropuerto.put("avionesDeCarga", this.avionesDeCarga != null ? this.avionesDeCarga.toJson() : null);
            aeropuerto.put("avionesMilitares", this.avionesMilitares != null ? this.avionesMilitares.toJson() : null);
            aeropuerto.put("avionesInstanciados", this.avionesInstanciados);
        } catch (JSONException e) {
            System.out.println(e.getMessage());
        }
        return aeropuerto;
    }
    */

    public Hangar<AvionComercial> getAvionesComerciales() {
        return avionesComerciales;
    }

    public Hangar<AvionPrivado> getAvionesPrivados() {
        return avionesPrivados;
    }

    public Hangar<AvionDeCarga> getAvionesDeCarga() {
        return avionesDeCarga;
    }

    public Hangar<AvionMilitar> getAvionesMilitares() {
        return avionesMilitares;
    }

}
