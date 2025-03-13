import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws LimiteDeAvionesSuperadoException {

        Aeropuerto aeropuertoMdp = new Aeropuerto("Aeropuerto de Mar del Plata", "Solis 4745", 19);

        // INSTANCIO Y GUARDO DIFERENTES TIPOS DE AVIONES

        AvionComercial avionComercial1 = new AvionComercial("Boeing 737", "Boeing", 410, TipoMotor.TURBOFAN, 189, 10, "Servicio de comida, WiFi, Entretenimiento a bordo");
        AvionComercial avionComercial2 = new AvionComercial("Airbus A320", "Airbus", 450, TipoMotor.TURBOFAN, 180, 8, "Asientos de lujo, Entretenimiento a bordo, WiFi");
        AvionComercial avionComercial3 = new AvionComercial("Boeing 787 Dreamliner", "Boeing", 560, TipoMotor.TURBOHHELICE, 242, 12, "Asientos reclinables, Servicio de comida premium, Pantallas individuales");
        AvionComercial avionComercial4 = new AvionComercial("Airbus A350", "Airbus", 570, TipoMotor.TURBOFAN, 315, 9, "WiFi, Entretenimiento a bordo, Servicio de bebidas");
        AvionComercial avionComercial5 = new AvionComercial("Embraer E195", "Embraer", 360, TipoMotor.TURBOHHELICE, 132, 6, "Servicio de snacks, Asientos reclinables, WiFi");

        aeropuertoMdp.agregarAvion(avionComercial1);
        aeropuertoMdp.agregarAvion(avionComercial2);
        aeropuertoMdp.agregarAvion(avionComercial3);
        aeropuertoMdp.agregarAvion(avionComercial4);
        aeropuertoMdp.agregarAvion(avionComercial5);

        AvionDeCarga avionDeCarga1 = new AvionDeCarga("Boeing 747-8F", "Boeing", 238610, TipoMotor.TURBOFAN, 4, 140000, "Electrodomésticos, Productos electrónicos, Maquinaria");
        AvionDeCarga avionDeCarga2 = new AvionDeCarga("Airbus A330-200F", "Airbus", 139100, TipoMotor.TURBOFAN, 4, 70000, "Ropa, Textiles, Alimentos perecederos");
        AvionDeCarga avionDeCarga3 = new AvionDeCarga("McDonnell Douglas MD-11F", "McDonnell Douglas", 147000, TipoMotor.TURBOFAN, 2, 95000, "Productos farmacéuticos, Equipos médicos, Materiales de construcción");
        AvionDeCarga avionDeCarga4 = new AvionDeCarga("Antonov An-124", "Antonov", 300000, TipoMotor.TURBOFAN, 6, 150000, "Vehículos pesados, Partes de aviones, Maquinaria industrial");
        AvionDeCarga avionDeCarga5 = new AvionDeCarga("Lockheed C-130 Hercules", "Lockheed", 35000, TipoMotor.TURBOHHELICE, 5, 20000, "Material militar, Suministros de emergencia, Equipos de rescate");

        aeropuertoMdp.agregarAvion(avionDeCarga1);
        aeropuertoMdp.agregarAvion(avionDeCarga2);
        aeropuertoMdp.agregarAvion(avionDeCarga3);
        aeropuertoMdp.agregarAvion(avionDeCarga4);
        aeropuertoMdp.agregarAvion(avionDeCarga5);

        AvionMilitar avionMilitar1 = new AvionMilitar("F-22 Raptor", "Lockheed Martin", 8200, TipoMotor.TURBOHHELICE, 1, SistemaDeArmas.AIRE_TIERRA, 480);
        AvionMilitar avionMilitar2 = new AvionMilitar("Eurofighter Typhoon", "Eurofighter GmbH", 5000, TipoMotor.TURBOHHELICE, 1, SistemaDeArmas.AIRE_TIERRA, 150);
        AvionMilitar avionMilitar3 = new AvionMilitar("A-10 Thunderbolt II", "Fairchild Republic", 11000, TipoMotor.TURBOFAN, 1, SistemaDeArmas.AIRE_AIRE, 1200);
        AvionMilitar avionMilitar4 = new AvionMilitar("F/A-18 Hornet", "McDonnell Douglas", 6600, TipoMotor.TURBOHHELICE, 1, SistemaDeArmas.AIRE_TIERRA, 570);
        AvionMilitar avionMilitar5 = new AvionMilitar("Su-35", "Sukhoi", 11500, TipoMotor.TURBOFAN, 1, SistemaDeArmas.AIRE_AIRE, 300);

        aeropuertoMdp.agregarAvion(avionMilitar1);
        aeropuertoMdp.agregarAvion(avionMilitar2);
        aeropuertoMdp.agregarAvion(avionMilitar3);
        aeropuertoMdp.agregarAvion(avionMilitar4);
        aeropuertoMdp.agregarAvion(avionMilitar5);

        AvionPrivado avionPrivado1 = new AvionPrivado("Gulfstream G650", "Gulfstream Aerospace", 4578, TipoMotor.TURBOFAN, 18, true, "VIP_G650_WIFI");
        AvionPrivado avionPrivado2 = new AvionPrivado("Bombardier Global 7500", "Bombardier", 4900, TipoMotor.TURBOFAN, 19, true, "Global7500_WiFi");
        AvionPrivado avionPrivado3 = new AvionPrivado("Cessna Citation X+", "Cessna", 1500, TipoMotor.TURBOFAN, 12, false, "CessnaXplus");
        AvionPrivado avionPrivado4 = new AvionPrivado("Dassault Falcon 8X", "Dassault Aviation", 3350, TipoMotor.TURBOFAN, 16, true, "Falcon8X_wifi");
        AvionPrivado avionPrivado5 = new AvionPrivado("Embraer Praetor 600", "Embraer", 2800, TipoMotor.TURBOFAN, 12, false, "Praetor600Net");

        aeropuertoMdp.agregarAvion(avionPrivado1);
        aeropuertoMdp.agregarAvion(avionPrivado2);
        aeropuertoMdp.agregarAvion(avionPrivado3);
        aeropuertoMdp.agregarAvion(avionPrivado4);
        aeropuertoMdp.agregarAvion(avionPrivado5);

        /*
        System.out.println(aeropuertoMdp.getAvionesComerciales().toString());
        System.out.println(aeropuertoMdp.getAvionesInstanciados());

        System.out.println(aeropuertoMdp.despegarHangarCompleto("avion de carga"));
*/
        JSONObject aeropuertoJson = aeropuertoMdp.toJson();
        ManejoJSON.escribirArchivo(aeropuertoJson, "aeropuertomdp");
        //System.out.println(ManejoJSON.leerArchivo("aeropuertomdp"));
        Aeropuerto aeropuertoLeido = fromJson("aeropuertoMdp");

        System.out.println(aeropuertoLeido.toJson());

    }

    public static Aeropuerto fromJson(String nombreArchivo) {

        String contenido = ManejoJSON.leerArchivo(nombreArchivo);

        JSONObject aeropuertoJson = new JSONObject(contenido);

        String nombre = aeropuertoJson.getString("nombre");
        String direccion = aeropuertoJson.getString("direccion");
        int capacidadOperacion = aeropuertoJson.getInt("capacidadOperacion");

        Aeropuerto aeropuertoLeido = new Aeropuerto(nombre, direccion, capacidadOperacion);

        JSONArray hangarAvionesComerciales = aeropuertoJson.getJSONArray("avionesComerciales");
        String nombreModelo;
        String marca;
        double capacidadCombustible;
        String tipoMotorString;
        int cantidadAsientos;
        int cantidadAzafatas;
        String listaServicios;

        for (int i = 0; i < hangarAvionesComerciales.length(); i++) {

            JSONObject avionComercialJson = hangarAvionesComerciales.getJSONObject(i);
            nombreModelo = avionComercialJson.getString("nombreModelo");
            marca = avionComercialJson.getString("marca");
            capacidadCombustible = avionComercialJson.getDouble("capacidadCombustible");
            tipoMotorString = avionComercialJson.getString("tipoMotor");
            cantidadAsientos = avionComercialJson.getInt("cantidadAsientos");
            cantidadAzafatas = avionComercialJson.getInt("cantidadAzafatas");
            listaServicios = avionComercialJson.getString("listaServicios");

            try {
                aeropuertoLeido.agregarAvion(new AvionComercial(nombreModelo, marca, capacidadCombustible, TipoMotor.valueOf(tipoMotorString), cantidadAsientos, cantidadAzafatas, listaServicios));
            } catch (LimiteDeAvionesSuperadoException e) {
                System.out.println(e.getMessage());
            }
        }

        JSONArray hangarAvionesDeCarga = aeropuertoJson.getJSONArray("avionesDeCarga");
        double capacidadKg;
        String listadoProductos;

        for (int i = 0; i < hangarAvionesDeCarga.length(); i++) {
            JSONObject avionDeCargaJson = hangarAvionesDeCarga.getJSONObject(i);
            nombreModelo = avionDeCargaJson.getString("nombreModelo");
            marca = avionDeCargaJson.getString("marca");
            capacidadCombustible = avionDeCargaJson.getDouble("capacidadCombustible");
            tipoMotorString = avionDeCargaJson.getString("tipoMotor");
            cantidadAsientos = avionDeCargaJson.getInt("cantidadAsientos");
            capacidadKg = avionDeCargaJson.getDouble("capacidadKg");
            listadoProductos = avionDeCargaJson.getString("listadoProductos");

            try {
                aeropuertoLeido.agregarAvion(new AvionDeCarga(nombreModelo, marca, capacidadCombustible, TipoMotor.valueOf(tipoMotorString), cantidadAsientos, capacidadKg, listadoProductos));
            } catch (LimiteDeAvionesSuperadoException e) {
                System.out.println(e.getMessage());
            }
        }

        JSONArray hangarAvionesMilitares = aeropuertoJson.getJSONArray("avionesMilitares");

        String sistemaDeArmasString;
        int cantidadBalas;

        for (int i = 0; i < hangarAvionesMilitares.length(); i++) {
            JSONObject avionMilitarJson = hangarAvionesMilitares.getJSONObject(i);
            nombreModelo = avionMilitarJson.getString("nombreModelo");
            marca = avionMilitarJson.getString("marca");
            capacidadCombustible = avionMilitarJson.getDouble("capacidadCombustible");
            tipoMotorString = avionMilitarJson.getString("tipoMotor");
            cantidadAsientos = avionMilitarJson.getInt("cantidadAsientos");
            sistemaDeArmasString = avionMilitarJson.getString("sistemaDeArmas");
            cantidadBalas = avionMilitarJson.getInt("cantidadBalas");

            try {
                SistemaDeArmas sistemaDeArmas = SistemaDeArmas.valueOf(sistemaDeArmasString); // Se convierte el string a un enum
                aeropuertoLeido.agregarAvion(new AvionMilitar(nombreModelo, marca, capacidadCombustible, TipoMotor.valueOf(tipoMotorString), cantidadAsientos, sistemaDeArmas, cantidadBalas));
            } catch (LimiteDeAvionesSuperadoException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error al procesar el sistema de armas o tipo de motor: " + e.getMessage());
            }
        }

        JSONArray hangarAvionesPrivados = aeropuertoJson.getJSONArray("avionesPrivados");

        boolean jaccuzzi;
        String claveWifi;

        for (int i = 0; i < hangarAvionesPrivados.length(); i++) {
            JSONObject avionPrivadoJson = hangarAvionesPrivados.getJSONObject(i);
            nombreModelo = avionPrivadoJson.getString("nombreModelo");
            marca = avionPrivadoJson.getString("marca");
            capacidadCombustible = avionPrivadoJson.getDouble("capacidadCombustible");
            tipoMotorString = avionPrivadoJson.getString("tipoMotor");
            cantidadAsientos = avionPrivadoJson.getInt("cantidadAsientos");
            jaccuzzi = avionPrivadoJson.getBoolean("jaccuzzi");
            claveWifi = avionPrivadoJson.getString("claveWifi");

            try {
                aeropuertoLeido.agregarAvion(new AvionPrivado(nombreModelo, marca, capacidadCombustible, TipoMotor.valueOf(tipoMotorString), cantidadAsientos, jaccuzzi, claveWifi));
            } catch (LimiteDeAvionesSuperadoException e) {
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error al procesar el tipo de motor: " + e.getMessage());
            }
        }

        return aeropuertoLeido;
    }



}