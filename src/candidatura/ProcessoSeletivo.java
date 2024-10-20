package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {

    }
    static void analisarCadidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar Para Candidato");
        } else if(salarioBase == salarioPretendido){
            System.out.println("Ligar Para O Candidato Com Contra Proposta");
        } else {
            System.out.println("Aguardando Os Demais Candidatos");
        }
    }
}