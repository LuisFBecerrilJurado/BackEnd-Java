import java.awt.*;

public class comic extends Thread implements ControladorComic{

    Screen screen;
    Historia historia;
    public comic(Screen screen){this.screen = screen;}
    public Screen getScreen(){ return screen;}

    public void setScreen(Screen screen) { this.screen = screen;}
    public Historia getHistoria() { return historia; }
    public void setHistoria(Historia historias) { this.historia = historias; }
    public void dibujar() {
        screen.showImage(historia.getImage());
        screen.out("\n");
        screen.out(historia.getText());
        screen.out("\n");
        screen.out("\n");

    }

    /**
     * This method execute the drawing of the page
     */
    @Override
    public void run() {
        dibujar();
        try {
            join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
