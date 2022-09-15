public class Desenvolvedor  extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + getSalario() + " " + getNome() + " " + getBonificacao();
    }
    @Override
    public double getBonificacao(){
        return getSalario() * 0.10;
    }

}
