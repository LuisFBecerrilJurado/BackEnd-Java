package MonaOctocat;

public class Octocat {
    String Nombre, Descripcion,Url;
    int id;

    public Octocat(int id,String Nombre, String Descripcion, String Url){
        this.id = id;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Url = Nombre.toLowerCase();
    }

    void display(){
        System.out.println("Nombre: " + Nombre + " " +"Id: " + id + " " + "Descrpcion: " + Descripcion + " " + "Url Imagen: https://octodex.github.com/" + Url +"." );
    }
}
