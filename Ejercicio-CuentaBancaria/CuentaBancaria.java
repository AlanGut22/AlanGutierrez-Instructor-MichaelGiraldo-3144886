import java.util.Scanner;

public class CuentaBancaria {
    private String titular;
    private Integer numeroCuenta;
    private Integer saldo;

    public CuentaBancaria(String titular, Integer numeroCuenta, Integer saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    Scanner scan = new Scanner(System.in);

    public String getTitular(){
        return this.titular;
    }

    public Integer getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public Integer getSaldo(){
        return this.saldo;
    }

    public void setTitular(String nuevoTitular){
        this.titular = nuevoTitular;
    }

    public void setNumeroCuenta(Integer nuevoNumeroCuenta){
        this.numeroCuenta = nuevoNumeroCuenta;
    }

    public void setSaldo(Integer nuevoSaldo){
        this.saldo = nuevoSaldo;
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Numero de cuenta: " + getNumeroCuenta());
        System.out.println("Saldo: " + getSaldo());
    }

    public void depositar(Integer cantidad) {
        saldo += cantidad;
        System.out.println("Se depositó " + cantidad + " de la cuenta número " + getNumeroCuenta() + " del titular " + getTitular() + ". Nuevo saldo: " + getSaldo());
    }

    public void retirar(Integer cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiró " + cantidad + " de la cuenta número " + getNumeroCuenta() + " del titular " + getTitular() + ". Nuevo saldo: " + getSaldo());
        } else {
            System.out.println("Fondos insuficientes para retirar " + cantidad + " de la cuenta número " + getNumeroCuenta() + " del titular " + getTitular() + ", saldo actual: " + getSaldo());
        }
    }

    public void transferir(CuentaBancaria destino, Integer cantidad) {
        if (cantidad <= saldo) {
            destino.saldo += cantidad;
            saldo -= cantidad;
            System.out.println("Se transfirió " + cantidad + " de la cuenta " + getNumeroCuenta() + " del titular " + getTitular() + " a la cuenta " + destino.getNumeroCuenta() + " del titular " + destino.getTitular() + ". Saldo origen: " + getSaldo() + ", saldo destino: " + destino.saldo);
        } else {
            System.out.println("Fondos insuficientes para transferir " + cantidad + " de la cuenta número " + getNumeroCuenta() + " del titular " + getTitular() + ", saldo actual: " + getSaldo());
        }
    }
}