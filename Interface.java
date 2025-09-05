interface readable{
    void read();
}

interface writable{
    void write();
}

interface playable{
    void play();
}

class File implements readable,writable,playable{
    public void read(){
        System.out.println("Reading");
    }
    public void write(){
        System.out.println("Writing");
    }
     public void play(){
        System.out.println("Playing");
    }
}

public class Interface {
    public static void main(String[] args) {
        File f=new File();
        f.read();
        f.write();
        f.play();
    }
}
