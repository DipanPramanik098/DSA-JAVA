public class _03_gettersANDsetters {
    public static void main(String[] args) {
        Pen p = new Pen();

        p.setColor("Black");
        p.setTip(10);

        System.out.println(p.getColor());
        System.out.println(p.getTip());
    }
}

// pen class
class Pen {
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }

}
