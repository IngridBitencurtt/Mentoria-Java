public class CEO extends Funcionario{
    public CEO(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "CEO: " + getSalario() + " " + getNome()+ " " + getBonificacao();
    }
    @Override
    public double getBonificacao(){
        return getSalario() * 0.15;
    }

}
