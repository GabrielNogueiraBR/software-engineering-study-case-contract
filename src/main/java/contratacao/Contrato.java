package contratacao;

public class Contrato {
	private Candidato candidato;
	// Candidato inicalmente nao possui contrato
	private OpcaoContrato opcaoContrato = OpcaoContrato.SEM_CONTRATO;
	
	public Contrato(Candidato candidato) {
		this.candidato = candidato;
	}
	
	public Candidato getCandidato() {
		return this.candidato;
	}
	
	public boolean assinarContrato(OpcaoContratoValido opcao) {
		int idade = this.candidato.getIdade();
		
		if(idade < 16) {
			this.opcaoContrato = OpcaoContrato.SEM_CONTRATO;
			return false;
    	}
    	else if (idade > 55) {
    		this.opcaoContrato = OpcaoContrato.SEM_CONTRATO;
			return false;
        } else if (idade >= 16 && idade < 18) {
        	if(opcao ==  OpcaoContratoValido.CONTRATO_PARCIAL) {
        		this.opcaoContrato = OpcaoContrato.CONTRATO_PARCIAL;
        		return true;
        	}
        	
        	this.opcaoContrato = OpcaoContrato.SEM_CONTRATO;
            return false;
        } else {
            this.opcaoContrato = OpcaoContrato.CONTRATO_INTEGRAL;
        	return true;
        }
	}
	
	public OpcaoContrato getOpcaoContrato() {
		return this.opcaoContrato;
	}
}
