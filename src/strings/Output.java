package strings;

public class Output {

    private String s;
    public Output(String s) {
        this.s = s;
    }
    public String getS() {
        return s;
    }
    public void output() {
        System.out.println(s);
    }

    public static void world(String s) {
        s = "World";
    }
    public static void change(Output a) {
        a.output();
        world(a.getS());
        a.output();
        a = new Output("World");
        a.output();
    }

    public static void main(String[] args) {
        Output a = new Output("Hello");
        a.output();
        change(a);
        a.output();
    }
}
