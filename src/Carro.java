import carro.comportamentos.mecanismos.ComportamentoMecanismos;
import carro.comportamentos.musica.ComportamentoMusica;

public class Carro {
	private ComportamentoMecanismos comportamentoVelocidade;
	private ComportamentoMecanismos comportamentoFreagem;
	private ComportamentoMecanismos comportamentoVidro;
	
	private ComportamentoMusica comportamentoVolume;
	
	public void ligarCarro() {
		System.out.println("Ligando carro.");
	}
	
	public void setComportamentoVelocidade(ComportamentoMecanismos comportamento) {
		this.comportamentoVelocidade = comportamento;
	}
	
	public void setComportamentoFreagem(ComportamentoMecanismos comportamento) {
		this.comportamentoFreagem = comportamento;
	}
	
	public void setComportamentoVidro(ComportamentoMecanismos comportamento) {
		this.comportamentoVidro = comportamento;
	}
	
	public void setComportamentoVolume(ComportamentoMusica comportamento) {
		this.comportamentoVolume = comportamento;
	}
	
	public void mover() {
		comportamentoVelocidade.mover();
	}
	
	public void freiar() {
		comportamentoFreagem.freiar();
	}
	
	public void baixarVidro() {
		comportamentoVidro.baixarVidro();
	}
	
	public void subirVidro() {
		comportamentoVidro.subirVidro();
	}
	
	public void aumentarVolume() {
		comportamentoVolume.aumentarVolume();
	}
	
	public void baixarVolume() {
		comportamentoVolume.baixarVolume();
	}
}
