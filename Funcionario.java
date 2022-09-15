public class Funcionario {
     public Funcionario(String nome, double salario){
         this.nome = nome;
         this.salario = salario;
     }
        private String nome;
        private double salario;
        public double getBonificacao(){
            return this.salario * 0.05;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

