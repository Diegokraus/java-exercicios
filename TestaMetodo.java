public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.depositar(300);
        conta.depositar(500);
        conta.depositar(50.30);


        boolean conseguiuRealizarSaque = conta.sacar(2000);

        if(conseguiuRealizarSaque){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Não foi possivel realizar o saque.");
        }

        System.out.println(conta.saldo);
    }
}
