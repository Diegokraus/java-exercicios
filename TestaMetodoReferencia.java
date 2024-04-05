public class TestaMetodoReferencia {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.depositar(1000);

        primeiraConta.transferir(500, segundaConta);
        primeiraConta.transferir(250, segundaConta);


        System.out.println(primeiraConta.saldo);
        System.out.println(segundaConta.saldo);

        System.out.println("saldo da primeira conta" + primeiraConta.saldo);
        System.out.println("Saldo da segunda conta" + segundaConta.saldo);
    }
}
