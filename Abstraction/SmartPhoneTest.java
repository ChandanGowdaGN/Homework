interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo taken");
    }

    public void playMusic() {
        System.out.println("Playing music");
    }
}

public class SmartPhoneTest {
    public static void main(String[] args) {

        SmartPhone s = new SmartPhone();
        s.takePhoto();
        s.playMusic();
    }
}
