import java.util.concurrent.ThreadLocalRandom;
public class candidatura {
    public static void main(String[] args) throws Exception {
        selecaoCadidatos();
    } 

    static void imprimirSalcionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo Lista de cantidados");
        for(int indice=0; indice<candidatos.length ;indice++){
            System.out.println("O canditado de numero "+ indice+"é"+ candidatos[indice]);
        }
  
    }
    static void selecaoCadidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados=0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
            String candidato=candidatos[candidatosAtual];
            double salarioPretendido= valorPretendido();

            System.out.println("O candidato"+candidato+"Solicitou esse valor ");
            if(salarioBase>salarioPretendido){
                System.out.println("O cantidado "+candidato+"foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;
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
    

