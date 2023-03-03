public class ContaEspecial extends ContaBancaria {
    public ContaEspecial(String Hcliente, int Hnum_conta, float Hsaldo) {
        super(Hcliente, Hnum_conta, Hsaldo);
    }

    int limite = 50;

    // ele coloca o valor e se for uma quantia razoavel (>50,00)o banco empresta
    @Override
    public void sacar() {
        System.out.println("Caro "+cliente+", qual valor deseja sacar?");
        float valSacar = in.nextFloat();
        if (saldo < valSacar) {

            float resultado = saldo - valSacar;
            System.out.println("Saldo disponível: " + resultado);


            if (resultado < limite) {
                System.out.println("Saldo disponível para emprestimo: $ 50,00");
            } else {
                System.out.println("Acima do limite permitido, não será realizado emprestimo");
            }

        } else {
            System.out.println("Efetuado com sucesso!");
            float resultado = saldo - valSacar;
            System.out.println("Saldo disponível: " + resultado);

        }
    }


    /*redefinição do método sacar, permitindo saldo negativo até o valor limite*/
}
