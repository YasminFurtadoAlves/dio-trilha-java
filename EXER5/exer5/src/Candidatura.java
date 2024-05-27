import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class Candidatura {
    public static void main(String[] args) throws Exception {
        imprimirSalcionados ();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for(String candidato:candidatos){
            entrandoEmcontato(candidato);   
        }
    } 
    static void entrandoEmcontato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentad=true;
        boolean atendeu=false;
        do{
            atendeu= atender();
            continuarTentad=!atendeu;
            if (continuarTentad){
                tentativasRealizadas++;    
            }else{
                System.out.println("Contato realixado");
            }
        

        }while(continuarTentad &&  tentativasRealizadas <3);
        if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSalcionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo Lista de cantidados");
        for(int indice=0; indice<candidatos.length;indice++){
            System.out.println("O canditado de numero "+ indice +"é"+ candidatos[indice]);
        }
  
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados=0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou um salário de %.2f\n", candidato, salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado.\n", candidato);
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    } 
static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);}

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase =200.0;
    if(salarioBase>salarioPretendido){
        System.out.println("Não aprovado");
    }else if(salarioBase==salarioPretendido)
        System.out.println("Ligar para cantidado ");
    else{
        System.out.println("Entrevista ");
    }   
    }
    }
    

