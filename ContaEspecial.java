public class ContaEspecial extends ContaBancaria {
    public ContaEspecial(String Hcliente, int Hnum_conta, float Hsaldo) {
        super(Hcliente, Hnum_conta, Hsaldo);
    }

    int limite = 50;

    // ele coloca o valor e se for uma quantia razoavel (>50,00)o banco empresta
    @Override
    public void sacar() {
        System.out.println("Caro "+cliente+", qual valor do emprestimo?");
        float valEmprestimo = in.nextFloat();

        /* RN= se o valor solicitado for acima de 300 o juros é de 2% ao mês*/


        /*  double montante = VALOR_TOTAL + VALOR_TOTAL * JUROS;
		int montanteEmCentavos = (int) (montante * 100);
		int valorParcela = montanteEmCentavos / NUMERO_PARCELAS;*/


        if (valEmprestimo >300 ) {


           float mont = (((valEmprestimo+valEmprestimo)*2)/3);



            System.out.println("Valores acima de 300 reais são cobrados taxa de 2.0 ao mês, " +
                    "ficando 3 parcelas cada uma no valor de: "+mont);


        } else {

            float calsJuros=  valEmprestimo/3;
            System.out.println("Valores abaixo de 300 reais não são cobrados taxas, portanto " +
                    "ficará 3 parcelas cada uma no valor de: "+calsJuros);
        }
    }


    /*redefinição do método sacar, permitindo saldo negativo até o valor limite*/
}
