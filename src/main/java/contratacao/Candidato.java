package contratacao;

public class Candidato {
    private int idade;

    public Candidato(int idade) {
        this.idade = idade;
    }

    public OpcaoContrato contratarCandidato() {
    	if(idade < 16) {
    		return OpcaoContrato.SEM_CONTRATO;
    	}
    	else if (idade > 55) {
            return OpcaoContrato.SEM_CONTRATO;
        } else if (idade >= 16 && idade < 18) {
            return OpcaoContrato.CONTRATO_PARCIAL;
        } else {
            return OpcaoContrato.CONTRATO_INTEGRAL;
        }
    }
}
