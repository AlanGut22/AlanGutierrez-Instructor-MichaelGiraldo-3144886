public class CuentaBancaria {
    String titular;
    Integer numeroCuenta;
    Integer saldo;

    public CuentaBancaria(String titular, Integer numeroCuenta, Integer saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public void depositar(Integer cantidad) {
        saldo += cantidad;
        System.out.println("Se depositó " + cantidad + " de la cuenta número " + numeroCuenta + " del titular " + titular + ". Nuevo saldo: " + saldo);
    }

    public void retirar(Integer cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiró " + cantidad + " de la cuenta número " + numeroCuenta + " del titular " + titular + ". Nuevo saldo: " + saldo);
        } else {
            System.out.println("Fondos insuficientes para retirar " + cantidad + " de la cuenta número " + numeroCuenta + " del titular " + titular + ", saldo actual: " + saldo);
        }
    }

    public void transferir(CuentaBancaria destino, Integer cantidad) {
        if (cantidad <= saldo) {
            destino.saldo += cantidad;
            saldo -= cantidad;
            System.out.println("Se transfirió " + cantidad + " de la cuenta " + numeroCuenta + " del titular " + titular + " a la cuenta " + destino.numeroCuenta + " del titular " + destino.titular + ". Saldo origen: " + saldo + ", saldo destino: " + destino.saldo);
        } else {
            System.out.println("Fondos insuficientes para transferir " + cantidad + " de la cuenta número " + numeroCuenta + " del titular " + titular + ", saldo actual: " + saldo);
        }
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("José Flores", 1243432332, 2000000);
        CuentaBancaria cuenta2 = new CuentaBancaria("María Lopez", 2109358300, 3500000);

        System.out.println("-----------Pruebas cuenta 1-----------");
        cuenta1.mostrarInfo();
        System.out.println();
        cuenta1.depositar(200);
        System.out.println();
        cuenta1.mostrarInfo();
        System.out.println();
        cuenta1.retirar(200);
        System.out.println();
        cuenta1.mostrarInfo();
        System.out.println();
        cuenta1.transferir(cuenta2, 1000);
        System.out.println();
        cuenta1.mostrarInfo();
        System.out.println();
        cuenta2.mostrarInfo();
        System.out.println();

        System.out.println("-----------Pruebas cuenta 2-----------");
        cuenta2.mostrarInfo();
        System.out.println();
        cuenta2.depositar(500);
        System.out.println();
        cuenta2.mostrarInfo();
        System.out.println();
        cuenta2.retirar(1500);
        System.out.println();
        cuenta2.mostrarInfo();
        System.out.println();
        cuenta2.transferir(cuenta1, 2000);
        System.out.println();
        cuenta2.mostrarInfo();
        System.out.println();
        cuenta1.mostrarInfo();
    }
}