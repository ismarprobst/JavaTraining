package inheritance7abstract;

public abstract class Shape {

    private Color color;

    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();// como colocamos como abstract, obrigatoriamente a classe tb precisa virar abstract

}
