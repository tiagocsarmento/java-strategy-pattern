
import carro.comportamentos.mecanismos.*;
import carro.comportamentos.musica.*;

public class Test {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		
		ComportamentoMecanismos rapido = new ComportamentoMecanismosRapido();
		ComportamentoMecanismos devagar = new ComportamentoMecanismosDevagar();
		
		ComportamentoMusica pouco = new ComportamentoMusicaPouco();
		ComportamentoMusica muito = new ComportamentoMusicaMuito();
		
		meuCarro.ligarCarro();
		
		meuCarro.setComportamentoVelocidade(rapido);
		meuCarro.mover();
		
		meuCarro.setComportamentoVidro(devagar);
		meuCarro.baixarVidro();
		
		meuCarro.setComportamentoVolume(muito);
		meuCarro.aumentarVolume();
	}
}
