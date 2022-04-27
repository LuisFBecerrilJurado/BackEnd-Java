import java.util.ArrayList;

/**
 *
 * This class describe the Layout of each part of the announcement
 *
 **/

public class Layout implements Setlist {
    /**
         * This method give us the format to show in out announcement
         *
         * @param headliners
         * @return String
         *
         **/

    @Override
    public  String Orden(Headliners headliners) {
        String FormatoSalida = "";
        ArrayList<Artistas> integrantes = headliners.getIntegrantes();

        FormatoSalida += "Banda: " + headliners.getNombreBanda() + "\n";
        for (Artistas artistas :integrantes){
            FormatoSalida += artistas.getNombre() + "\n";
        }
        return FormatoSalida;
    }

}
