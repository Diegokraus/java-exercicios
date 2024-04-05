public class TestaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();


        primeiraConta.saldo = 1525.40;
        primeiraConta.agencia = 1;
        primeiraConta.numero = 100;


        System.out.println("O titular da primeira conta é: " + primeiraConta.titular);
        System.out.println("Agência: " + primeiraConta.agencia + " Numero: " + primeiraConta.numero);
        System.out.println("O saldo é: " + primeiraConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("As 2 variaveis apontam pra o mesmo local.");
        }else {
            System.out.println("sao diferentes");
        }
    }
}
