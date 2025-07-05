public class _01_basic {
    public static void main(String[] args) {
        Pen p = new Pen();

        p.setColor("Black");
        p.setTip(10);

        System.out.println(p.color);
        System.out.println(p.tip);
    }    
}
// pen class
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }


}
class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}
