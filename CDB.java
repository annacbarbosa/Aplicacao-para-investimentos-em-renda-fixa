public class CDB extends RendaFixa {
  private double juros;
    public CDB(String nome, String cpf, String banco) {
        super(nome, cpf, banco);
        this.juros = 1.2;
    }

    @Override
    public double calcularRendimento(double valorInvestido, int tempoMeses, double taxaSelic) {
        juros*= (taxaSelic/100)/12;
        double rendimento = (valorInvestido * Math.pow((1 + juros),tempoMeses))-valorInvestido;
      double ir = 0;

      if (tempoMeses <= 6) {
        ir = rendimento * 0.225;
      } else if (tempoMeses <= 12) {
        ir = rendimento * 0.2;
      } else if (tempoMeses <= 24) {
        ir = rendimento * 0.175;
      } else {
        ir = rendimento * 0.15;
      }

      rendimento -= ir;
      double valorTotal = valorInvestido + rendimento;

      return valorTotal;
  
    }
}
