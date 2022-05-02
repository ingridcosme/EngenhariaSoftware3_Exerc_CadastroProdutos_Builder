package model;

public class JogoEletronico extends Produto {

	private String titulo;
	private TipoVideogame videogame;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public TipoVideogame getVideogame() {
		return videogame;
	}
	
	public void setVideogame(TipoVideogame videogame) {
		this.videogame = videogame;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Jogo Eletronico\n");
		buffer.append(nome);
		buffer.append("\nTitulo: ");
		buffer.append(titulo);
		buffer.append("\nVideogame: ");
		buffer.append(videogame);
		buffer.append("\nValor: ");
		buffer.append(valor);
		buffer.append(" ");
		buffer.append(moeda);
		buffer.append("\n");
		return buffer.toString();
	}
	
}
