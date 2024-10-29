import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class ManejoJSON {

    public static void escribirArchivo(JSONObject jsonObject, String archivo){
        try{
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo+".json"));
            salida.write(jsonObject.toString());
            salida.flush();
            salida.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void escribirArchivo(JSONArray jsonArray, String archivo){
        try{
            BufferedWriter salida = new BufferedWriter(new FileWriter(archivo+".json"));
            salida.write(jsonArray.toString());
            salida.flush();
            salida.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static String leerArchivo(String archivo){
        StringBuilder contenido = new StringBuilder();
        String lectura = "";
        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo+".json"));
            while((lectura = entrada.readLine())!=null){
                contenido.append(lectura);
            }
            entrada.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contenido.toString();
    }
}
