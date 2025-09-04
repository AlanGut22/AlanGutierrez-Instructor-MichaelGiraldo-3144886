public class Main {
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
        System.out.println();

        System.out.println("-----------Cambiar Credenciales cuenta 1-----------");
        cuenta1.mostrarInfo();
        System.out.println();
        System.out.println("Nuevas credenciales:");
        cuenta1.setTitular("Marcos Perez");
        cuenta1.setNumeroCuenta(123456789);
        cuenta1.setSaldo(5000000);
        cuenta1.mostrarInfo();
    }
}
