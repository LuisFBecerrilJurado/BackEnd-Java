import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.Thread.sleep;

/**
 *
 * This class is made up for our tests
 *
 **/

public class PruebaLineUp {

    public static void main(String[] args) {

    //* ----------------- BANDAS PARTICIPANTES ----------------- *\\

        // ----------------- ROCK ----------------- \\

        Artistas caifanes     = new Artistas("Caifanes");
        Artistas cafetacuva   = new Artistas("Cafe Tacuva");
        Artistas juanes       = new Artistas("Juanes");
        Artistas enanitos     = new Artistas("Enanitos Verdes");
        Artistas hombres      = new Artistas("Hombres G");
        Artistas julieta      = new Artistas("Julieta Venegas");
        Artistas zoe          = new Artistas("Zoe");
        Artistas molotov      = new Artistas("Molotov");
        Artistas eltri        = new Artistas("EL TRI");
        Artistas magodeoz     = new Artistas("Mago de OZ");
        Artistas panteon      = new Artistas("Panteon Rococo");
        Artistas fobia        = new Artistas("Fobia");
        Artistas ximena       = new Artistas("Ximena Sariñana");
        Artistas gransilencio = new Artistas("El Gran Silencio");
        Artistas inspector    = new Artistas("Inspector");
        Artistas moenia       = new Artistas("Moenia");
        Artistas elefante     = new Artistas("Elefante");
        Artistas kinky        = new Artistas("Kinky");
        Artistas tijuana      = new Artistas("Tijuana NO!!");
        Artistas arath        = new Artistas("Arath Merce");

        ArrayList<Artistas> rockero = new ArrayList<Artistas>();
        rockero.add(caifanes);
        rockero.add(cafetacuva);
        rockero.add(juanes);
        rockero.add(enanitos);
        rockero.add(hombres);
        rockero.add(julieta);
        rockero.add(zoe);
        rockero.add(molotov);
        rockero.add(eltri);
        rockero.add(magodeoz);
        rockero.add(panteon);
        rockero.add(fobia);
        rockero.add(ximena);
        rockero.add(gransilencio);
        rockero.add(inspector);
        rockero.add(moenia);
        rockero.add(elefante);
        rockero.add(kinky);
        rockero.add(tijuana);
        rockero.add(arath);

        Headliners Headliners1 = new Headliners(rockero, "Rokearo Stage");

        // ----------------- LAS CLASICAS ----------------- \\

        Artistas tigresDelNorte      = new Artistas("LOS TIGRES DEL NORTE");
        Artistas angelesAzules       = new Artistas("LOS ANGELES AZULES");
        Artistas bandaElRecodo       = new Artistas("BANDA EL RECODO");
        Artistas ramonAyala          = new Artistas("RAMÓN AYALA");
        Artistas bronco              = new Artistas("BRONCO");
        Artistas bandaMachos          = new Artistas("BANDA MACHOS");
        Artistas grupoKual           = new Artistas("GRUPO KUAL?");
        Artistas miBandaElMexicano   = new Artistas("MI BANDA EL MEXICANO");
        Artistas losRieleros         = new Artistas("LOS RIELEROS");
        Artistas sonoraSantanera     = new Artistas("SONORA SANTANERA");
        Artistas grupoSonador        = new Artistas("GRUPO SOÑADOR");
        Artistas losSocios           = new Artistas("LOS SOCIOS DEL RITMO");
        Artistas angelesNegros       = new Artistas("ANGELES NEGROS");
        Artistas jeanette            = new Artistas("JEANETTE");
        Artistas losYaguaru          = new Artistas("LOS YAGUARU");
        Artistas losLlaras           = new Artistas("LOS LLARAS");
        Artistas albertoPedraza      = new Artistas("ALBERTO PEDRAZA");
        Artistas sonoraDinamita      = new Artistas("SONORA DINAMITA");
        Artistas aaronYSuGrupoIlusion = new Artistas("AARON Y SU GRUPO ILUSION");
        Artistas angelesDeCharly     = new Artistas("LOS ANGELES DE CHARLY");
        Artistas losFredys           = new Artistas("LOS FREDYS");
        Artistas losAskis            = new Artistas("LOS ASKIS");
        Artistas losKadetesDeLinares = new Artistas("LOS KADETES DE LINARES");
        Artistas losYonics           = new Artistas("LOS YONICS");

        ArrayList<Artistas> clasico = new ArrayList<Artistas>();
        clasico.add(tigresDelNorte);
        clasico.add(angelesAzules);
        clasico.add(bandaElRecodo);
        clasico.add(ramonAyala);
        clasico.add(bronco);
        clasico.add(bandaMachos);
        clasico.add(grupoKual);
        clasico.add(miBandaElMexicano);
        clasico.add(losRieleros);
        clasico.add(sonoraSantanera);
        clasico.add(grupoSonador);
        clasico.add(losSocios);
        clasico.add(angelesNegros);
        clasico.add(jeanette);
        clasico.add(losYaguaru);
        clasico.add(losLlaras);
        clasico.add(albertoPedraza);
        clasico.add(sonoraDinamita);
        clasico.add(aaronYSuGrupoIlusion);
        clasico.add(angelesDeCharly);
        clasico.add(losFredys);
        clasico.add(losAskis);
        clasico.add(losKadetesDeLinares);
        clasico.add(losYonics);

        Headliners Headliners2 = new Headliners(clasico, "Las Clasicas Stage");

        // ----------------- MI BANDA EL MEXICANO ----------------- \\

        Artistas sinBandera       = new Artistas("SIN BANDERA");
        Artistas ov7              = new Artistas("OV7");
        Artistas nek              = new Artistas("NEK");
        Artistas fey              = new Artistas("FEY");
        Artistas laOrejaDeVanGogh = new Artistas("LA OREJA DE VAN GOGH");
        Artistas kumbiaKings      = new Artistas("KUMBIA KINGS");
        Artistas aleksSyntek      = new Artistas("ALEKS SYNTEK");
        Artistas elvisCrespo      = new Artistas("ELVIS CRESPO");
        Artistas kabah            = new Artistas("KABAH");
        Artistas calo             = new Artistas("CALO");
        Artistas sentidosOpuestos = new Artistas("SENTIDOS OPUESTOS");
        Artistas oroSolido        = new Artistas("ORO SOLIDO");

        ArrayList<Artistas> pop = new ArrayList<Artistas>();
        pop.add(sinBandera);
        pop.add(ov7);
        pop.add(nek);
        pop.add(fey);
        pop.add(laOrejaDeVanGogh);
        pop.add(kumbiaKings);
        pop.add(aleksSyntek);
        pop.add(elvisCrespo);
        pop.add(kabah);
        pop.add(calo);
        pop.add(sentidosOpuestos);
        pop.add(oroSolido);

        Headliners Headliners3 = new Headliners(pop, "Te gusta el POP?");

    //* ----------------- LAYOUT ----------------- *\\

        Layout layout = new Layout();

    //* ----------------- POSTER ----------------- *\\

        String []contenido = {layout.Orden(Headliners1), layout.Orden(Headliners2),layout.Orden(Headliners3)};

        String []imagenes = {"Headliner1.png","Headliner2.png","Headliner3.png"};

        Poster poster = new Poster(contenido, imagenes);

        // --------------------Impresora---------------------

        ImpresionPoster impresor = new ImpresionPoster(new Screen());
        impresor.setPoster(poster);

        ExecutorService executorService = Executors.newCachedThreadPool();

        try{

            show(executorService, impresor, (byte)1);
            show(executorService, impresor, (byte)2);
            show(executorService, impresor, (byte)3);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void show(ExecutorService executorService, ImpresionPoster impresor, byte opcion) throws InterruptedException{
            impresor.setOrden(opcion);
            executorService.execute(impresor);
            sleep(2000);
        }
}
