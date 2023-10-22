package carro.comportamentos.musica;

public class ComportamentoMusicaPouco implements ComportamentoMusica {

	@Override
	public void aumentarVolume() {
		System.out.println("Aumentando um pouco o volume.");
		
	}

	@Override
	public void baixarVolume() {
		System.out.println("Baixando um pouco o volume.");
		
	}

}
