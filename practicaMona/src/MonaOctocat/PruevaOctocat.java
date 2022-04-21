package MonaOctocat;

public class PruevaOctocat {

    public static void main(String[] args) {
        Octocat dino    = new Dinotocat(128,"Dinotocat","Mona enjoys dressing up as a dinosaur","");
        Octocat skate   = new Skatetocat(124,"Skatetocat","Mona loves skating","");
        Octocat film    = new Filmtocats(142,"Filmtocats","Mona loves to shoot drama films","");
        Octocat manu    = new Manufactutocat(150,"Manufacturetocat", "Mona enjoys creating technological products","");
        Octocat surf    = new Surftocat(138, "Surftocat", "Mona is a great surfer","");
        Octocat sentry  = new Sentrytocat(141,"Sentrytocat","Mona supports firefighting in her spare time","");
        Octocat justice = new Justicetocat(132,"Justicetocat","Mona defends and supports justice","");
        dino.display();
        skate.display();
        film.display();
        manu.display();
        surf.display();
        sentry.display();
        justice.display();
    }
}