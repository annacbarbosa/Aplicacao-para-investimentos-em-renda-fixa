public class LCI extends RendaFixa {
  private double juros;
    public LCI(String nome, String cpf, String banco) {
        super(nome, cpf, banco);
      this.juros = 1.0;
      
    }

    @Override
    public double calcularRendimento(double valorInvestido, int tempoMeses, double taxaSelic) {
         juros*= (taxaSelic/100)/12;
        double rendimento = (valorInvestido * Math.pow((juros+1), tempoMeses));
        return rendimento;
    }
}