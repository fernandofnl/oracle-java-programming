package crud;

import java.sql.SQLException;
import java.util.List;

public class FilmController {

	private final FilmDAO filmDAO;

	public FilmController(FilmDAO filmDao) {
		this.filmDAO = filmDao;
	}

	public void createFilm(FilmModel filme) {

		try {
			
			if (filmDAO.create(filme)) {
				System.out.println("Filme criado com sucesso");

			} else {
				System.out.println("Erro ao criar filme");
			}

		} catch (SQLException e) {
			System.out.println("Erro na base de dados: " + e.getMessage());
		}
	}

	public void readFilme() {
		try {
			
			List<FilmModel> filmes = filmDAO.read();
			
			if (filmes.isEmpty()) {
				System.out.println("Nenhum filme cadastrado1");
			} else {
				System.out.println("Listagem de Filmes:");
				
				for (FilmModel arrTemp : filmes) {
					System.out.println(arrTemp);
				}
			}
		} catch (SQLException e) {
			System.out.println("Erro na base de dados: " + e.getMessage());
		}
	}

	public void updateFilm(FilmModel filme) {
		try {
			
			if (filmDAO.update(filme)) {
			System.out.println("Filme atualizado com sucesso!");
			
			} else {
				System.out.println("Erro ao atualizar filme!");
			}
			
		} catch (SQLException e) {
			System.out.println("Erro na base de dados: " + e.getMessage());
		}
	}
	
	public void deleteFilm(String codigo) {
		try {
			
			if (filmDAO.delete(codigo)) {
			System.out.println("Filme deletado com sucesso!");
			
			} else {
				System.out.println("Erro ao deletar filme!");
			}
			
		} catch (SQLException e) {
			System.out.println("Erro na base de dados: " + e.getMessage());
		}
		
	}
	
}
