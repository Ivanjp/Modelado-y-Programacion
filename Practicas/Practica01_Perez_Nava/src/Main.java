
import java.util.List;

public class Main {

    private Cobros cob;
    static Netflix n = new Netflix();
    static AmazonPV a = new AmazonPV();
    static Twitch t = new Twitch();
    static Spotify s = new Spotify();
    static Youtube y = new Youtube();

    private void cobroNetflix() {
        cob = new Netflix();
    }

    private void cobroAmazonPV() {
        cob = new AmazonPV();
    }

    private void cobroTwitch() {
        cob = new Twitch();
    }

    private void cobroSpotify() {
        cob = new Spotify();
    }

    private void cobroYoutube() {
        cob = new Youtube();
    }

    private void ejecutarCobro(List<Cliente> arr, Servicio s) {
        cob.cobrar(arr, s);
    }

    public static void main(String[] args) {

        Main main = new Main();

        Servicio netflix = new Servicio("Netflix");
        netflix.agrega(n.getRecN());
        Servicio amazonpv = new Servicio("Amazon Prime Video");
        amazonpv.agrega(a.getRecA());
        Servicio twitch = new Servicio("Twitch");
        twitch.agrega(t.getRecT());
        Servicio spotify = new Servicio("Spotify");
        spotify.agrega(s.getRecS());
        Servicio youtube = new Servicio("Youtube");
        youtube.agrega(y.getRecY());

        Cliente c1 = new Cliente("Alicia", 500);
        Cliente c2 = new Cliente("Bob", 40);
        Cliente c3 = new Cliente("Cesar", 40);
        Cliente c4 = new Cliente("Diego", 180);
        Cliente c5 = new Cliente("Erika", 300);

        System.out.println("****NETFLIX****");
        System.out.println("\n ****Dia 1**** \n");

        c1.suscribirse(netflix, "4D");
        c2.suscribirse(netflix, "4D");
        c4.suscribirse(netflix, "2D");
        c5.suscribirse(netflix, "4D");
        System.out.println("\n");

        main.cobroNetflix();
        main.ejecutarCobro(netflix.getClientes(), netflix);
        System.out.println("\n");
        netflix.notificar();
        System.out.println("\n");

        System.out.println("****AMAZON****");
        System.out.println("\n ****Dia 1**** \n");

        c1.suscribirse(amazonpv, "premium");
        c2.suscribirse(amazonpv, "premium");
        c4.suscribirse(amazonpv, "premium");
        System.out.println("\n");

        main.cobroAmazonPV();
        main.ejecutarCobro(amazonpv.getClientes(), amazonpv);
        System.out.println("\n");
        amazonpv.notificar();
        System.out.println("\n");

        System.out.println("****TWITCH****");
        System.out.println("\n ****Dia 1**** \n");

        c1.suscribirse(twitch, "normal");
        c2.suscribirse(twitch, "normal");
        c5.suscribirse(twitch, "normal");
        System.out.println("\n");


        if(amazonpv.verificaCliente(c1) == true){
        c1.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c2) == true){
        c2.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c5) == true){
        c5.cambiarServicio(twitch, "desc");
    }
    main.cobroTwitch();
    main.ejecutarCobro(twitch.getClientes(), twitch);

         System.out.println("\n");

         twitch.notificar();

         System.out.println("\n");

        System.out.println("****SPOTIFY****");
        System.out.println("\n ****Dia 1**** \n");

        c1.suscribirse(spotify, "premium");
        c2.suscribirse(spotify, "premium");
        c3.suscribirse(spotify, "premium");
        c5.suscribirse(spotify, "gratis");
        System.out.println("\n");

        main.cobroSpotify();
        main.ejecutarCobro(spotify.getClientes(), spotify);
        System.out.println("\n");
        spotify.notificar();
        System.out.println("\n");

        System.out.println("****YOUTUBE****");
        System.out.println("\n ****Dia 1**** \n");

        c1.suscribirse(youtube, "premium");
        c2.suscribirse(youtube, "premium");
        c3.suscribirse(youtube, "gratis");
        c5.suscribirse(youtube, "gratis");
        System.out.println("\n");

        main.cobroYoutube();
        main.ejecutarCobro(youtube.getClientes(), youtube);
        System.out.println("\n");
        youtube.notificar();
        System.out.println("\n");

        System.out.println("****YOUTUBE****");
        System.out.println("\n ****Dia 2**** \n");

        c5.cambiarServicio(youtube,"premium");

        main.cobroYoutube();
        main.ejecutarCobro(youtube.getClientes(), youtube);
        System.out.println("\n");
        youtube.notificar();
        System.out.println("\n");

        System.out.println("****SPOTIFY****");
        System.out.println("\n ****Dia 2**** \n");

        c5.cambiarServicio(spotify,"premium");

        main.cobroSpotify();
        main.ejecutarCobro(spotify.getClientes(), spotify);
        System.out.println("\n");
        spotify.notificar();
        System.out.println("\n");


        System.out.println("****TWITCH****");
        System.out.println("\n ****Dia 2**** \n");

        c4.suscribirse(twitch, "normal");

      
        if(amazonpv.verificaCliente(c1) == true){
        c1.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c2) == true){
        c2.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c4) == true){
        c4.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c5) == true){
        c5.cambiarServicio(twitch, "desc");
    }
    main.cobroTwitch();
    main.ejecutarCobro(twitch.getClientes(), twitch);

         System.out.println("\n");

         twitch.notificar();

         System.out.println("\n");

          System.out.println("****NETFLIX****");
        System.out.println("\n ****Dia 2**** \n");

         main.cobroNetflix();
        main.ejecutarCobro(netflix.getClientes(), netflix);
        System.out.println("\n");
        netflix.notificar();
        System.out.println("\n");

        System.out.println("****AMAZON****");
        System.out.println("\n ****Dia 2**** \n");

        main.cobroAmazonPV();
        main.ejecutarCobro(amazonpv.getClientes(), amazonpv);
        System.out.println("\n");
        amazonpv.notificar();
        System.out.println("\n");

        System.out.println("****NETFLIX****");
        System.out.println("\n ****Dia 3**** \n");

        c4.desuscribirse(netflix);
        c5.desuscribirse(netflix);

         main.cobroNetflix();
        main.ejecutarCobro(netflix.getClientes(), netflix);
        System.out.println("\n");
        netflix.notificar();
        System.out.println("\n");

        System.out.println("****AMAZON****");
        System.out.println("\n ****Dia 3**** \n");

        c5.suscribirse(amazonpv, "premium");

        main.cobroAmazonPV();
        main.ejecutarCobro(amazonpv.getClientes(), amazonpv);
        System.out.println("\n");
        amazonpv.notificar();
        System.out.println("\n");

        System.out.println("****TWITCH****");
        System.out.println("\n ****Dia 3**** \n");


       
        if(amazonpv.verificaCliente(c1) == true){
        c1.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c2) == true){
        c2.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c4) == true){
        c4.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c5) == true){
        c5.cambiarServicio(twitch, "desc");
    }
    main.cobroTwitch();
    main.ejecutarCobro(twitch.getClientes(), twitch);

         System.out.println("\n");

         twitch.notificar();

         System.out.println("\n");

        System.out.println("****SPOTIFY****");
        System.out.println("\n ****Dia 3**** \n");

        c4.suscribirse(spotify,"gratis");

        main.cobroSpotify();
        main.ejecutarCobro(spotify.getClientes(), spotify);
        System.out.println("\n");
        spotify.notificar();
        System.out.println("\n");

        System.out.println("****YOUTUBE****");
        System.out.println("\n ****Dia 3**** \n");

        main.cobroYoutube();
        main.ejecutarCobro(youtube.getClientes(), youtube);
        System.out.println("\n");
        youtube.notificar();
        System.out.println("\n");

        System.out.println("****NETFLIX****");
        System.out.println("\n ****Dia 4**** \n");


         main.cobroNetflix();
        main.ejecutarCobro(netflix.getClientes(), netflix);
        System.out.println("\n");
        netflix.notificar();
        System.out.println("\n");

        System.out.println("****AMAZON****");
        System.out.println("\n ****Dia 4**** \n");


        main.cobroAmazonPV();
        main.ejecutarCobro(amazonpv.getClientes(), amazonpv);
        System.out.println("\n");
        amazonpv.notificar();
        System.out.println("\n");

        System.out.println("****TWITCH****");
        System.out.println("\n ****Dia 4**** \n");

        
        if(amazonpv.verificaCliente(c1) == true){
        c1.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c2) == true){
        c2.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c4) == true){
        c4.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c5) == true){
        c5.cambiarServicio(twitch, "desc");
    }
    main.cobroTwitch();
    main.ejecutarCobro(twitch.getClientes(), twitch);

         System.out.println("\n");

         twitch.notificar();

         System.out.println("\n");

        System.out.println("****SPOTIFY****");
        System.out.println("\n ****Dia 4**** \n");

        main.cobroSpotify();
        main.ejecutarCobro(spotify.getClientes(), spotify);
        System.out.println("\n");
        spotify.notificar();
        System.out.println("\n");

        System.out.println("****YOUTUBE****");
        System.out.println("\n ****Dia 4**** \n");

        main.cobroYoutube();
        main.ejecutarCobro(youtube.getClientes(), youtube);
        System.out.println("\n");
        youtube.notificar();
        System.out.println("\n");


        System.out.println("****NETFLIX****");
        System.out.println("\n ****Dia 4**** \n");


         main.cobroNetflix();
        main.ejecutarCobro(netflix.getClientes(), netflix);
        System.out.println("\n");
        netflix.notificar();
        System.out.println("\n");

        System.out.println("****AMAZON****");
        System.out.println("\n ****Dia 4**** \n");


        main.cobroAmazonPV();
        main.ejecutarCobro(amazonpv.getClientes(), amazonpv);
        System.out.println("\n");
        amazonpv.notificar();
        System.out.println("\n");

         System.out.println("****TWITCH****");
        System.out.println("\n ****Dia 5**** \n");

        
        if(amazonpv.verificaCliente(c1) == true){
        c1.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c2) == true){
        c2.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c4) == true){
        c4.cambiarServicio(twitch, "desc");
    }
    if(amazonpv.verificaCliente(c5) == true){
        c5.cambiarServicio(twitch, "desc");
    }
    main.cobroTwitch();
    main.ejecutarCobro(twitch.getClientes(), twitch);

         System.out.println("\n");

         twitch.notificar();

         System.out.println("\n");

        System.out.println("****SPOTIFY****");
        System.out.println("\n ****Dia 5**** \n");

        main.cobroSpotify();
        main.ejecutarCobro(spotify.getClientes(), spotify);
        System.out.println("\n");
        spotify.notificar();
        System.out.println("\n");

        System.out.println("****YOUTUBE****");
        System.out.println("\n ****Dia 5**** \n");

        main.cobroYoutube();
        main.ejecutarCobro(youtube.getClientes(), youtube);
        System.out.println("\n");
        youtube.notificar();
        System.out.println("\n");

    }
}
