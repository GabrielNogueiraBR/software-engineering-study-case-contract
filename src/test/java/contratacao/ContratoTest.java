package contratacao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ContratoTest {
	Candidato candidato;
	Contrato contrato;
	
	@Before
	public void preparaContexto() {
		
	}
	
	@Test
	public void naoDeveSerContratadoComoContratoIntegral() {
		candidato = new Candidato(17);
		contrato = new Contrato(candidato);
		
		boolean contratado = contrato.assinarContrato(OpcaoContrato.CONTRATO_INTEGRAL);
		
		assertFalse(contratado);
		assertEquals(contrato.getOpcaoContrato(), OpcaoContrato.SEM_CONTRATO);
	}
	
	@Test
	public void naoDeveSerContratadoComoContratoParcial() {
		candidato = new Candidato(57);
		contrato = new Contrato(candidato);
		
		boolean contratado = contrato.assinarContrato(OpcaoContrato.CONTRATO_PARCIAL);
		
		assertFalse(contratado);
		assertEquals(contrato.getOpcaoContrato(), OpcaoContrato.SEM_CONTRATO);
	}
	
	@Test
	public void deveSerContratadoComoContratoIntegral() {
		candidato = new Candidato(23);
		contrato = new Contrato(candidato);
		
		boolean contratado = contrato.assinarContrato(OpcaoContrato.CONTRATO_INTEGRAL);
		
		assertTrue(contratado);
		assertEquals(contrato.getOpcaoContrato(), OpcaoContrato.CONTRATO_INTEGRAL);
	}
	
	@Test
	public void deveSerContratadoComoContratoParcial() {
		candidato = new Candidato(33);
		contrato = new Contrato(candidato);
		
		boolean contratado = contrato.assinarContrato(OpcaoContrato.CONTRATO_PARCIAL);
		
		assertTrue(contratado);
		assertEquals(contrato.getOpcaoContrato(), OpcaoContrato.CONTRATO_PARCIAL);
	}
	
	
}
