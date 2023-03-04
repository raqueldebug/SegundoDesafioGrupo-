public class ContaBancariaEdicao extends ContaBancaria {

    ContaEspecial especial = new ContaEspecial(cliente, num_conta, saldo);

    @Override
    public void sacar() {
        System.out.println("Caro " + cliente + ", qual valor deseja sacar?");
        float valSacar = in.nextFloat();
        if (saldo < valSacar) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo disponível: " + saldo);
            System.out.println("Deseja verificar opções de emprestimo digite 1 ");
            int op = in.nextInt();
            if(op==1){especial.sacar(); }
              // eu fiz uma copia da abstração para poder editar a classe de abstração de forma indireta

        } else {
            System.out.println("Efetuado com sucesso!");
            float resultado = saldo - valSacar;
            System.out.println("Saldo disponível: " + resultado);

        }
    }
}
