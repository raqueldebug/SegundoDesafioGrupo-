import java.util.Scanner;

public class ContaBancaria {



    public String cliente="João";
    public int num_conta = 2;
    public float saldo = 100;

//construtor
    public ContaBancaria(String Hcliente, int Hnum_conta, float Hsaldo) {
        this.cliente = Hcliente;
        this.num_conta = Hnum_conta;
        this.saldo = Hsaldo;
    }

    Scanner in = new Scanner(System.in);

    public ContaBancaria() {

    }


    public void sacar() {
        System.out.println("Caro "+cliente+", qual valor deseja sacar?");
        float valSacar = in.nextFloat();
        if (saldo < valSacar) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Saldo disponível: " + saldo);




        } else {
            System.out.println("Efetuado com sucesso!");
            float resultado = saldo - valSacar;
            System.out.println("Saldo disponível: " + resultado);

        }

    }

    /**
     * Aqui ele está na lója fixa e solicita atendente do brb para depositar,
     * ** RN:
     * -Caso ele deposite na propria conta será uma adição ao saldo inicial de $100.00
     * -Caso ele deposite em outra conta será retido do saldo inicial de $100.00
     */
    public void depositar() {
        System.out.println("Digite o valor que deseja depositar: ");
        float valDepositar = in.nextFloat();
        System.out.println("Número da conta que deseja depositar: ");
        int conta = in.nextInt();


        //finge que o deposito é no fisico e aqui foi onde a operadora registrou
        if (conta == num_conta) {
            System.out.println("Efetuado com sucesso!");
            float resultado = saldo + valDepositar;                //aqui se ele depositar na própria conta saldo fica positivo
            System.out.println("Saldo disponível: " + resultado);
        } else {
            // aqui deposita para outra pessoa saida de dinheiro

            if (saldo > valDepositar) {
                float resultado = saldo - valDepositar;
                System.out.println("Saldo disponível: " + resultado);
            } else {
                float resultado = valDepositar - saldo;
                System.out.println("Saldo disponível: " + resultado);
            }


        }


    }


 /*
FORMAS DE ESCREVER

PascalCase: arquivos e classe: NotaFistal
camelCase:  atributos, objetos, metodos ex: notaFiscal
kibab-case: nota-fiscal
snake_case: nota_fiscal

*/


}
