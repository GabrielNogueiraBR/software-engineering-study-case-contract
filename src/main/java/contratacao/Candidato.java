package contratacao;

public class Candidato {
    private int idade;

    public Candidato(int idade) {
        this.idade = idade;
    }

    public boolean contratarCandidato() {
    	if(idade < 16) {
    		return false;
    	}
    	else if (idade > 55) {
            return false;
        } else if (idade >= 16 && idade < 18) {
            return true; // contratação em tempo parcial
        } else {
            return true; // contratação em período integral
        }
    }
}
