package crud;

import java.util.Scanner;
import java.sql.Date;

public class FilmView {
	
	/*private FilmController filmController;
	
	public FilmView(FilmController filmController) {
		this.filmController = filmController;
	}*/

	public void displayMenu() {
		
		MySQLConnection db = new MySQLConnection();
		
		try {
			
			if (!db.getConnection()) {
				System.out.println("Erro ao conectar com o banco de dados!");
				return;
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		FilmDAO filmDAO = new FilmDAO(db);
		
		FilmController filmController = new FilmController(filmDAO);
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\nMenu de Opções:");
			System.out.println("1. Cadastrar filme");
			System.out.println("2. Listar filme");
			System.out.println("3. Atualizar filme");
			System.out.println("4. Deletar filme");
			System.out.println("0. Sair do Programa");
			
			System.out.println("Digite sua opção: ");
			int option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
			
			case 0:
				System.out.println("Progama finalizado!");
				sc.close();
				db.closeConnection();
				System.exit(0);
				break;
			
			case 1:
				System.out.println("Digite o código do filme: ");
				String codigo = sc.nextLine();
				
				System.out.println("Digite o título do filme: ");
				String titulo = sc.nextLine();
			
				System.out.println("Digite o gênero do filme: ");
				String genero = sc.nextLine();
				
				System.out.println("Digite o nome da produtora do filme: ");
				String produtora = sc.nextLine();
				
				System.out.println("Digite a data da compra: ");
				Date dataCompra = Date.valueOf(sc.nextLine());
				
				FilmModel filme = new FilmModel(codigo, titulo, genero, produtora, dataCompra);
				filmController.createFilm(filme);
				
				break;
				
			case 2:
				filmController.readFilme();
				break;
				
			case 3:
				System.out.println("Digite o código do filme: ");
				codigo = sc.nextLine();
				
				System.out.println("Digite o título do filme: ");
				titulo = sc.nextLine();
			
				System.out.println("Digite o gênero do filme: ");
				genero = sc.nextLine();
				
				System.out.println("Digite o nome da produtora do filme: ");
				produtora = sc.nextLine();
				
				System.out.println("Digite a data da compra: ");
				dataCompra = Date.valueOf(sc.nextLine());
				
				filme = new FilmModel(codigo, titulo, genero, produtora, dataCompra);
				filmController.updateFilm(filme);
			
				
				break;
				
			case 4:
				System.out.println("Digite o código do filme que deseja deletar: ");
				codigo = sc.nextLine();
				
				filmController.deleteFilm(codigo);
				break;
				
			default:
				System.out.println("Opção inválida. Tente novamente!");
			}
			
		}
		
		
	}

}
