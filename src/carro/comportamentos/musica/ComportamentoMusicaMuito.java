package carro.comportamentos.musica;

public class ComportamentoMusicaMuito implements ComportamentoMusica{
	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando muito o volume.");
		
	}

	@Override
	public void baixarVolume() {
		System.out.println("Baixando muito o volume.");
		
	}

}
