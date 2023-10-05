import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner inp = new Scanner(System.in);

          
            System.out.print("Informe o valor a ser investido (R$): ");
            double valorInvestido = inp.nextDouble();

            System.out.print("Informe o tempo de investimento (meses): ");
            int tempoMeses = inp.nextInt();

            System.out.print("Informe a taxa SELIC do ano: ");
            double taxaSelic = inp.nextDouble();

            if (taxaSelic < 0 || taxaSelic > 100) {
                throw new IllegalArgumentException("Valor informado inválido! Deve estar entre 0% e 100%.");
            }

            RendaFixa cdb = new CDB("João", "123456789", "Banco A");
            RendaFixa lci = new LCI("Maria", "987654321", "Banco B");
            RendaFixa lca = new LCA("Pedro", "555555555", "Banco C");
            RendaFixa poupanca = new Poupanca("Ana", "111111111", "Banco D");

            System.out.println("\nResultados para CDB:");
            double rendimentoCDB = cdb.calcularRendimento(valorInvestido, tempoMeses, taxaSelic);
            System.out.println("Rendimento: R$" + rendimentoCDB);
            cdb.salvarResultado("CDB", valorInvestido, tempoMeses, taxaSelic);

            System.out.println("\nResultados para LCI:");
            double rendimentoLCI = lci.calcularRendimento(valorInvestido, tempoMeses, taxaSelic);
            System.out.println("Rendimento: R$" + rendimentoLCI);
            lci.salvarResultado("LCI", valorInvestido, tempoMeses, taxaSelic);

            System.out.println("\nResultados para LCA:");
            double rendimentoLCA = lca.calcularRendimento(valorInvestido, tempoMeses, taxaSelic);
            System.out.println("Rendimento: R$" + rendimentoLCA);
            lca.salvarResultado("LCA", valorInvestido, tempoMeses, taxaSelic);

            System.out.println("\nResultados para Poupança:");
            double rendimentoPoupanca = poupanca.calcularRendimento(valorInvestido, tempoMeses, taxaSelic);
            System.out.println("Rendimento: R$" + rendimentoPoupanca);
            poupanca.salvarResultado("Poupança", valorInvestido, tempoMeses, taxaSelic);
        } catch (Exception e) {
            System.out.println("Erro! " + e.getMessage());
        }
    }
}
