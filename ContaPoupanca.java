public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String Hcliente, int Hnum_conta, float Hsaldo) {
        super(Hcliente, Hnum_conta, Hsaldo);
    }

    int diadeRendimento;
//aqui vou fazer o valor ser atualizado a cada 24 horas. com new date e condicional vai ficar legal, deve para px
    public void calcularNovoSaldo() {
       /* recebe a taxa de rendimento da poupança e atualiza o
        saldo*/
    }
}
