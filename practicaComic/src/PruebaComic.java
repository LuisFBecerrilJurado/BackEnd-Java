import java.awt.*;

public class PruebaComic extends Thread {

    public static void main(String[] args) throws InterruptedException {

        Screen screen = new Screen();
        screen.setExtendedState(screen.getExtendedState() | Screen.MAXIMIZED_BOTH);
        screen.out("Shigatsu Wa kimi no uso: El Final que me hubiera gustado ver\n", "Roboto", 40, Color.RED);
        screen.setVisible(true);

        comic dibujo[] = {new comic(screen), new comic(screen), new comic(screen), new comic(screen),
                          new comic(screen), new comic(screen), new comic(screen), new comic(screen),
                          new comic(screen), new comic(screen), };

        Historia historias[] = {new Historia("", "Portada.jpg"),

                new Historia("Mientras Arima se encontraba tocando el piano en el concurso nácional,\n" +
                                  "al mismo tiempo Kaori estaba siendo operada en el hospital. \n" +
                                  "Arima solo queria terminar su participacion para dirigirse al hospital\n" +
                                  "lo mas pronto posible para declarar su amor hacia Kaori.",  "Concurso.jpg"),

                new Historia("En la mitad de su participacion por un instante se vio dentro de un espacio tranquilo \n" +
                                  "en este espacio la estaba esperando Kaori sin decir una palabra comenzo a tocar con su violin. \n" +
                                  "Arima la acompano con el piano, los dos estaba muy felices por tocar de nueva cuenta juntos ", "KaoriArima.jpg"),

                new Historia("Esto hizo pensar a Arima que la operacion habia tenido un mal resultado\n" +
                                  "una vez terminada su participacion se dirigio al hospital al llegar se dirigio\n" +
                                  "a la zona de cirugias pero no encuentra a nadie ahi por lo que entro en panico\n " +
                                  "una enfermera le comenta que la chica  de la operacion se encontraba en su habitacion. ", ""),

                new Historia("Al estar en la puerta de la habitacion Kaori le comento: Sabes que es de mala educacion entrar sin tocar la puerta \n" +
                                  "Ante esto Arima se disculpo y le dijo: Lo siento es solo que necesitaba decirte algo muy importante.\n", "Hospital.jpg"),

                new Historia("Kaori le interrumpio y le pidio que por el resto del día la dejara descansar por lo cual arima decide pasar la noche junto a ella\n " +
                                  "En medio de la noche Kaori le pedi que la lleve a la azotea del hospital para tomar aire fresco\n" +
                                  "Arima accede, al estar en la azotea los dos platican sobre el futuro y aceptar ir a comer dumplins cuando kaori mejore" , "Escaleras.jpg"),

                new Historia("Pasado unos dias Kaori recibe el alta medica con lo cual puede volver a su vida normal\n" +
                                  "Arima invita a Kaori a pasar un día entero juntos, hacen todas las actividades que kaori deseaba.\n" +
                                  "Al llegar la tarde sentados en una banca Arima comienza a enumerar todo lo que le gusta de kaori\n"+
                                  "Kaori le interrumpe.\n", "Confesion.jpg"),

                new Historia("Kaori le confiesa que desde pequeña soñaba con un día poder hablar con el ya que Arima se convirtió en su ídolo.\n" +
                                  "Su música era tan colorida como una paleta de 24 colores y la melodía bailaba... y la inspiro a ser violinista\n"+
                                  "se emociono al escuchar que íbamos a la misma escuela... ¿cómo podía hablarte? ¿debería ir a comprar sándwiches? " +
                                  "pero al final, solo te miraba de lejos.\n"+
                                  "Mi mentira provisional te trajo ante mí, pero eras diferente a lo que imaginaba.\n " +
                                  "Eras más negativo y mezquino de lo que aparentabas. Eras cabezón y me hiciste una foto a escondidas.\n " +
                                  "Tenías la voz más grave y varonil de lo que pensé. Pero como imaginé... Eras una buena persona.\n " +
                                  "El agua del río al que saltamos esta fresquita y agradable. La Luna que se veía desde la sala de música parecía un apetitoso pastel...\n" +
                                  "Fue muy divertido cantar \"Twinkle twinkle Little Star\" bajo las estrellas contigo...\n " +
                                  "Arima Kousei-kun TE QUIERO, TE QUIERO, ¡TE QUIERO!","Confesion2.jpg"),

                new Historia("Al final los dos se toman en brazos y se dan un beso ","Novios.jpg"),

                new Historia("Pero al final de cuentas este solo es una version que me gustaria que fuera la oficial",
                             "Final.jpg")};

        int cont = 0;
        for (comic d : dibujo) {
            d.setHistoria(historias[cont]);
            d.start();
            cont++;
            sleep(1500);
        }
    }
}

