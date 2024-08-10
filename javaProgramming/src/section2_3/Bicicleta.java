package section2_3;

public abstract class Bicicleta {

	// Propriedades Genericas
	private String codigo;
	private String tipoDeQuadro;
	private String tipoDeRoda;
	private int aro;
	private int quantiMarchas;
	private double velocMedia;
	
	// Construtores
	public Bicicleta() {}

	public Bicicleta(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantiMarchas, double velocMedia) {
		
		this.codigo = codigo;
		this.tipoDeQuadro = tipoDeQuadro;
		this.tipoDeRoda = tipoDeRoda;
		this.aro = aro;
		this.quantiMarchas = quantiMarchas;
		this.velocMedia = velocMedia;
	
	}
	
	// Comportamentos
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipoDeQuadro() {
		return tipoDeQuadro;
	}

	public void setTipoDeQuadro(String tipoDeQuadro) {
		this.tipoDeQuadro = tipoDeQuadro;
	}

	public String getTipoDeRoda() {
		return tipoDeRoda;
	}

	public void setTipoDeRoda(String tipoDeRoda) {
		this.tipoDeRoda = tipoDeRoda;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public int getQuantiMarchas() {
		return quantiMarchas;
	}

	public void setQuantiMarchas(int quantiMarchas) {
		this.quantiMarchas = quantiMarchas;
	}

	public double getVelocMedia() {
		return velocMedia;
	}

	public void setVelocMedia(double velocMedia) {
		this.velocMedia = velocMedia;
	}

	@Override
	public String toString() {
		return "Bicicleta [codigo=" + codigo + ", tipoDeQuadro=" + tipoDeQuadro + ", tipoDeRoda=" + tipoDeRoda
				+ ", aro=" + aro + ", quantiMarchas=" + quantiMarchas + ", velocMedia=" + velocMedia + "]";
	}
	
	
	
	
}
