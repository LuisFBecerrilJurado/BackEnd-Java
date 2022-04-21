package HarryPoter;

public class Luna {
    private String casa, genero, nombre, boggart, patronus;
    public Luna(String casa, String genero, String nombre, String boggart, String patronus){
        this.casa = casa;
        this.genero = genero;
        this.nombre = nombre;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public String getCasa(){return casa;}
    public String getGenero() {return genero;}
    public String getNombre() {return nombre;}
    public String getBoggart() {return boggart;}
    public String getPatronus() {return patronus;}
}
