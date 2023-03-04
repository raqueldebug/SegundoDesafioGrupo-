public class ContaJava {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        ContaEspecial contaEspecial = new ContaEspecial("Joao", 2, 100);

ContaBancariaEdicao edicao = new ContaBancariaEdicao();

        System.out.println("Caro "+contaEspecial.cliente+"\nConta criada, nº: 2\nSaldo inicial de "+ contaEspecial.saldo);
       edicao .sacar();
        System.out.println("");
        contaBancaria.depositar();


       /*  Após a implementação das classes acima, você deverá implementar uma classe
ContaJava, contendo o método main. Nesta classe, você deverá implementar:
a) Incluir dados relativos a(s) conta(s) de um cliente;
b) Sacar um determinado valor da(s) sua(s) conta(s);
c) Depositar um determinado valor na(s) sua(s) conta(s);
d) Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que
possuem conta poupança;
e) Mostrar os dados da(s) conta(s) de um cliente;

 LETRA D FICARÁ PARA O PROX*/





    }
}
