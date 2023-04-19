package contratacao;

import java.util.Date;

public class Candidato {
    private Date dtNascimento;

    public Candidato(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    
    public int getIdade() {
    	Date now = new Date();
    	return this.dtNascimento.compareTo(now);
    }
}
