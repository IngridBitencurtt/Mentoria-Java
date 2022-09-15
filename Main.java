public class Main {
    public static void main(String[] args) {
        Funcionario desenvolvedor = new Desenvolvedor("Ingrid", 1000);
        Funcionario gerente = new Gerente ("Romario", 5500);
        Funcionario ceo = new CEO("Bia", 25000);

        System.out.println(desenvolvedor.toString());
        System.out.println(gerente.toString());
        System.out.println(ceo.toString());
    }
}
