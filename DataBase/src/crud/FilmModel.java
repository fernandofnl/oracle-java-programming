package crud;

import java.sql.Date;

public class FilmModel {

	private String codigo;
	private String titulo;
	private String genero;
	private String produtora;
	private Date dataCompra;

	//Constructors
	public FilmModel() {}

	public FilmModel(String codigo, String titulo, String genero, String produtora, Date dataCompra) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
		this.produtora = produtora;
		this.dataCompra = dataCompra;
	}

	
	//Behaviors
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getProdutora() {
		return produtora;
	}

	public void setProdutora(String produtora) {
		this.produtora = produtora;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	@Override
	public String toString() {
		return "FilmModel [codigo=" + codigo + ", titulo=" + titulo + ", genero=" + genero + ", produtora=" + produtora
				+ ", dataCompra=" + dataCompra + "]";
	}
	
	
	
	
	
	
}
