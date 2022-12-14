public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Gerente: " + getSalario() + " " + getNome()+ " " + getBonificacao();
    }
    @Override
    public double getBonificacao(){
        return getSalario() * 0.20;
    }

}
