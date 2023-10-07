class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON");
    }

    public void off() {
        System.out.println("Amplifier is OFF");
    }
}

class DVDPlayer {
    public void play() {
        System.out.println("DVD Player is playing");
    }

    public void stop() {
        System.out.println("DVD Player stopped");
    }
}

class Projector {
    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }
}

class HomeTheaterFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheaterFacade() {
        amplifier = new Amplifier();
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
    }

    public void watchMovie() {
        System.out.println("Get ready to watch a movie!");
        amplifier.on();
        dvdPlayer.play();
        projector.on();
    }

    public void endMovie() {
        System.out.println("Movie is over. Shutting down the theater.");
        amplifier.off();
        dvdPlayer.stop();
        projector.off();
    }
}
 class HomeTheaterDemo {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
      
        homeTheater.watchMovie();
        homeTheater.endMovie();
    }
}