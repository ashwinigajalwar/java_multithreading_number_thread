public class Main {
    public static void main(String[] args) {

        NumberThread nt= new NumberThread(1,100,500);
        nt.start();
    }
}
