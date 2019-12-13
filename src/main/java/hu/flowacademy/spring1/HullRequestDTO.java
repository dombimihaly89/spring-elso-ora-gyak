package hu.flowacademy.spring1;

public class HullRequestDTO {

    private double radius;
    private double edgeVertical;
    private double edgeHorizontal;
    private double height;
    private Kind kind;

    public HullRequestDTO(double radius, double edgeVertical, double edgeHorizontal, double height, Kind kind) {
        this.radius = radius;
        this.edgeVertical = edgeVertical;
        this.edgeHorizontal = edgeHorizontal;
        this.height = height;
        this.kind = kind;
    }

    public HullRequestDTO() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getEdgeVertical() {
        return edgeVertical;
    }

    public void setEdgeVertical(double edgeVertical) {
        this.edgeVertical = edgeVertical;
    }

    public double getEdgeHorizontal() {
        return edgeHorizontal;
    }

    public void setEdgeHorizontal(double edgeHorizontal) {
        this.edgeHorizontal = edgeHorizontal;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kind) {
        this.kind = kind;
    }
}

enum Kind{
    cube,
    prism,
    sphere,
    cylinder,
    cone
}
