interface playable{
    void play();
}

class guitar implements playable{
    @Override
    public void play() {
        System.out.println("Playing quitar");
    }
}

class piano implements playable{
    @Override
    public void play() {
        System.out.println("Playing piano");
    }
}


public class inter_face {
    public static  void main(String[] args) {

        guitar g = new guitar();
        piano p = new piano();

        g.play();
        p.play();
    }
}
