package Domain;

public class ComplexNumber {
    // Действительная и мнимая части комплексного числа.
    private double real, imag;

    // Конструктор класса ComplexNumber.
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Геттеры и сеттеры для действительной и мнимой частей.
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // Метод toString возвращает строковое представление комплексного числа.
    public String toString() {
        return real + " + " + imag + "j";
    }
}

