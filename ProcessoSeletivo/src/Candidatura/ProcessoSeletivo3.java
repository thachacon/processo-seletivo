package Candidatura;

public class ProcessoSeletivo3 {
    public static void main(String[] args) {
        imprimirSelecionados();
    }
    
    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indíce do elemento");
        
        for (int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é o " + candidatos[indice]);
        }
    }
}

