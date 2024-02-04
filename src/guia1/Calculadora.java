package guia1;

public class Calculadora {

    public float num1, num2, result;

    public void suma() {
        result = num1 + num2;
    }

    public void resta() {
        result = num1 - num2;
    }

    public void multi() {
        result = num1 * num2;
    }

    public void divi() {
        result = num1 / num2;
    }

    public void sen(double a) {
        result = (float) Math.sin(a);
    }

    public void tan(double a) {
        result = (float) Math.tan(a);
    }

    public void cos(double a) {
        result = (float) Math.cos(a);
    }

    public void raiz(double a, double b) {
        result = (float) Math.pow(a, 1 / b);
    }

    public void pot(double a, double b) {
        result = (float) Math.pow(a, b);
    }

    public void iva() {
        result = num1 + (num1 * (num2 / 100));
    }

}
