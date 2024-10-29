public class Excepciones {

    public static void verificarAvion(Avion avion) throws AvionNoExisteException{
        if(avion==null){
            throw new AvionNoExisteException("El avión no existe.");
        }
    }

    public static void verificarLimiteAviones(int limiteAviones, int avionesInstaciados) throws LimiteDeAvionesSuperadoException{
        if(avionesInstaciados==limiteAviones){
            throw new LimiteDeAvionesSuperadoException("El aeropuerto llegó a su máxima capacidad. No es posible adquirir el avión.");
        }
    }

    public static void verificarHangarAvionesComerciales(Hangar<AvionComercial> hangar) throws HangarVacioException {
        if(hangar==null || hangar.estaVacio()){
            throw new HangarVacioException("El hangar se encuentra vacío en este momento.");
        }
    }

    public static void verificarHangarAvionesDeCarga(Hangar<AvionDeCarga> hangar) throws HangarVacioException {
        if(hangar==null || hangar.estaVacio()){
            throw new HangarVacioException("El hangar se encuentra vacío en este momento.");
        }
    }

    public static void verificarHangarAvionesPrivados(Hangar<AvionPrivado> hangar) throws HangarVacioException {
        if(hangar==null || hangar.estaVacio()){
            throw new HangarVacioException("El hangar se encuentra vacío en este momento.");
        }
    }

    public static void verificarHangarAvionesMilitares(Hangar<AvionMilitar> hangar) throws HangarVacioException {
        if(hangar==null || hangar.estaVacio()){
            throw new HangarVacioException("El hangar se encuentra vacío en este momento.");
        }
    }

}
