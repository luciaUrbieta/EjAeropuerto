public enum TipoMotor {

    TURBOFAN("turbofan"),
    TURBOHHELICE("turbohelice");

    private String tipoMotor;

    TipoMotor(String tipoMotor){
        this.tipoMotor=tipoMotor;
    }

    public String getTipoMotor(){
        return tipoMotor;
    }
}
