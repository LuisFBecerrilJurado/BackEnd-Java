/**
 *
 * This class describe the announcement of the concert
 *
 * */

public class Poster {

        private String[] contenido;
        private String[] imagenes;

        public Poster(String []contenido, String []imagenes){
            this.contenido=contenido;
            this.imagenes=imagenes;
        }

        public String[] getContenido() {
            return contenido;
        }

        public String[] getImagenes() {
            return imagenes;
        }

}
