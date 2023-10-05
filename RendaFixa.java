public abstract class RendaFixa {
    private double juros;
    private String nome;
    private String cpf;
    private String banco;

    public RendaFixa(String nome, String cpf, String banco) {
        this.nome = nome;
        this.cpf = cpf;
        this.banco = banco;
        this.juros = 1.2;
      
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBanco() {
        return banco;
    }

    public abstract double calcularRendimento(double valorInvestido, int tempoMeses, double taxaSelic);

    public void salvarResultado(String titulo, double valorInvestido, int tempoMeses, double taxaSelic) {
      
    }
}
