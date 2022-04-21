package HarryPoter;

public class Prueba {

    public static void main(String[] args) {
        show();
    }
    public static void show(){
        Dumbledore dumbledore = new Dumbledore("Gryffindor","Masculino","Albus Dumbledore",
                                               "Cuerpo de Ariana muerta","Fenix");
        System.out.println("---------");
        System.out.print("Nombre: "+dumbledore.getNombre()+" ");
        System.out.print("Casa: "+dumbledore.getCasa()+" ");
        System.out.print("Genero: "+dumbledore.getGenero()+" ");
        System.out.print("Boggart: "+dumbledore.getBoggart()+" ");
        System.out.print("Patronus: "+dumbledore.getPatronus()+" ");
        System.out.println(" ");

        Harry harry = new Harry("Gryffindor","Masculino","Harry Potter",
                                "Dementor","Ciervo");
        System.out.println("---------");
        System.out.print(harry.getNombre()+" ");
        System.out.print(harry.getCasa()+" ");
        System.out.print(harry.getGenero()+" ");
        System.out.print(harry.getBoggart()+" ");
        System.out.print(harry.getPatronus()+" ");
        System.out.println(" ");

        Luna luna = new Luna("Ravenclaw","Femenino","Luna Lovegood",
                             "Muerte de su padre","Liebre");
        System.out.println("---------");
        System.out.print("Nombre: "+ luna.getNombre()+" ");
        System.out.print("Casa: "+ luna.getCasa()+" ");
        System.out.print("Genero: "+ luna.getGenero()+" ");
        System.out.print("Boggart: "+ luna.getBoggart()+" ");
        System.out.print("Patronus: "+ luna.getPatronus()+" ");
        System.out.println(" ");

        Hermione hermione = new Hermione("Gryffindor", "Femenino","Hermione Granger",
                                         "La profesora McGonagall le dice que reprobo todos sus examenes",
                                         "Nutria");
        System.out.println("---------");
        System.out.print("Nombre: "+ hermione.getNombre()+" ");
        System.out.print("Casa: "+ hermione.getCasa()+" ");
        System.out.print("Genero: "+ hermione.getGenero()+" ");
        System.out.print("Boggart: "+ hermione.getBoggart()+" ");
        System.out.print("Patronus: "+ hermione.getPatronus()+" ");
        System.out.println("");

        Snape snape = new Snape("Slytheryn","Masculino","Severus Snape",
                                "Voldemort","Cierva");
        System.out.println("---------");
        System.out.print("Nombre: "+ snape.getNombre()+" ");
        System.out.print("Casa: " + snape.getCasa()+" ");
        System.out.print("Genero: " + snape.getGenero()+" ");
        System.out.print("Boggart: "+ snape.getBoggart()+" ");
        System.out.print("Patronus"+ snape.getPatronus());

    }

}
