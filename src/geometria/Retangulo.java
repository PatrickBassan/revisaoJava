package geometria;

public class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo() {
        base = 1.0;
        altura = 1.0;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(double base, double altura, String cor, boolean preenchido) {
        super(cor, preenchido);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
    }

    @Override
    public double getPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Retangulo[" +
                "base=" + base +
                ", altura=" + altura +
                ", " + super.toString() +
                ']';
    }
}