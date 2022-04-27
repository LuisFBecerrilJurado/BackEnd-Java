import java.awt.*;

/**
 *
 * This class describe the printer that will draw the concert announcement
 *
 **/
public class ImpresionPoster extends Thread implements ControladorImpresion {
        private Screen screen;
        private Poster poster;
        private int orden=0;
        public ImpresionPoster(Screen screen){
            String lugar,fecha;
            this.screen = screen;
            screen.setExtendedState(screen.getExtendedState()|Screen.MAXIMIZED_BOTH);
            screen.out("Concierto\n", "Roboto", 40, Color.pink);
            lugar = "DODGER STADIUM LOS ANGELES, CA\n";
            fecha = "Sabado 3 de Diciembre 2022\n";
            screen.out(lugar,"Roboto", 40, Color.BLACK);
            screen.out(fecha,"Roboto", 40, Color.BLACK);
            screen.setVisible(true);
        }
        public void setOrden(byte orden) {
            this.orden = orden;
        }

        public Poster getPoster() {
            return poster;
        }
        public void setPoster(Poster poster) {
            this.poster = poster;
        }

        @Override
        public void dibujar() {

            String layout, imagen;

            if(orden==1){
                layout = poster.getContenido()[0];
                imagen = poster.getImagenes()[0];
                screen.out(layout, "Roboto", 20, Color.GREEN);
            }else if(orden==2){
                layout = poster.getContenido()[1];
                imagen = poster.getImagenes()[1];
                screen.out(layout, "Roboto", 20, Color.RED);
            }else{
                layout = poster.getContenido()[2];
                imagen = poster.getImagenes()[2];
                screen.out(layout, "Roboto", 20, Color.BLUE);
            }

            screen.showImage(imagen);
            screen.out("\n\n");
        }

    @Override
    public void run() { dibujar(); }
}
