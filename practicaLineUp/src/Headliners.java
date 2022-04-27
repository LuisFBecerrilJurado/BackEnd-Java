import java.util.ArrayList;

/**
 *
 * This class describes the bands that
 * will participate in the concert.
 *
 **/

public class Headliners {
    private String nombreBanda;
    private ArrayList<Artistas> integrantes;
    /**
     * @param integrantes
     * @param nombreBanda
    **/

    public Headliners(ArrayList<Artistas> integrantes, String nombreBanda){
        this.nombreBanda = nombreBanda;
        this.integrantes = integrantes;
    }

    public ArrayList<Artistas> getIntegrantes() { return integrantes; }

    public String getNombreBanda() { return nombreBanda; }

    public void setNombreBanda(String nombreBanda) {this.nombreBanda = nombreBanda; }

    public String toString() {
        return "STAGE{" +
                "nombreBanda=" + nombreBanda +
                '}';
    }
}
