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

        System.out.println(aeropuertoMdp.getAvionesComerciales().toString());
        System.out.println(aeropuertoMdp.getAvionesInstanciados());

        System.out.println(aeropuertoMdp.despegarHangarCompleto("avion de carga"));

        JSONObject aeropuertoJson = aeropuertoMdp.toJSON();
        ManejoJSON.escribirArchivo(aeropuertoJson, "aeropuertomdp");
        System.out.println(ManejoJSON.leerArchivo("aeropuertomdp"));

        // 1. leer archivo de manera mas ordenada

        /*
         ArrayList<Empleado> empleadosLeidos = new ArrayList<>();

        try {
            //creo un JSONArray con la respuesta que descargue del archivo
            JSONArray jsonArrayEmpleados = new JSONArray(respuesta);

            //recorro el JSONArray
            for (int i = 0; i < jsonArrayEmpleados.length(); i++) {
                //Creo un JSONObject con un elemento del JSONArray
                JSONObject empleado =  jsonArrayEmpleados.getJSONObject(i);
                //Obtengo los datos del JSONObject para crear un empleado
                int id = empleado.getInt("id");
                String nombre = empleado.getString("nombre");
                double salario = empleado.getDouble("salario");
                String departamento = empleado.getString("departamento");

                //creo el empleado con los datos del JSONObject
                Empleado leido = new Empleado(id, nombre, salario, departamento);
                empleados.add(leido);
                System.out.println("leido del archivo: "+leido.toString());
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
         */

        // 2. hacer el menu


    }
}