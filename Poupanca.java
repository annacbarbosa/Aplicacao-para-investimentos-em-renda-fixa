public class Poupanca extends RendaFixa {
  private double juros;
    public Poupanca(String nome, String cpf, String banco) {
        super(nome, cpf, banco);
        this.juros = 0.5/100;
    }

    @Override
    public double calcularRendimento(double valorInvestido, int tempoMeses, double taxaSelic) {
          double rendimento = 0, valorTotal=0;
            
        if (taxaSelic >= 8.5) {
          rendimento = valorInvestido * (Math.pow(1 + 0.005, tempoMeses));
          valorTotal = rendimento;
         
        } else {
          juros = taxaSelic * 0.7 / 1200;
       
          rendimento = (valorInvestido * Math.pow((1 + juros), tempoMeses));
          valorTotal = rendimento;
        }

      return valorTotal;
    }
}
