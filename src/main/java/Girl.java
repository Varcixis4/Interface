public class Girl implements Player, Study {
    public void play(){
        System.out.println("Girl play ");
    }

    @Override
    public void read() {
        System.out.println("Girl is reading... the book");
    }
}
