package section3_2.hashsetexample;

import java.util.HashSet;

public class CoinDriver {

	public static void main(String[] args) {
		
		HashSet<Coin> wallet = new HashSet<>();
		
		Coin coin1 = new Coin(1);
		Coin coin5 = new Coin(5);
		Coin coin10 = new Coin(10);
		Coin coin25 = new Coin(25);
		Coin coin50 = new Coin(50);
		Coin coin100 = new Coin(100);

		// Adicionando coin na wallet
		wallet.add(coin1);
		wallet.add(coin5);
		wallet.add(coin10);
		wallet.add(coin25);
		wallet.add(coin50);
		wallet.add(coin100);
		wallet.add(coin50);
		wallet.add(coin25);
		
		// chamando o método display no console
		displayWallet(wallet);
		
		System.out.println("Quantidade de moedas na carteira " + wallet.size());		
		System.out.println("A carteira está vazia? " + wallet.isEmpty());
		//wallet.clear();
		//System.out.println("A carteira está vazia? " + wallet.isEmpty());
		
	}

	private static void displayWallet(HashSet<Coin> wallet) {
		for (Coin arrTemp : wallet) {
			System.out.println("Moedinha de: " + arrTemp.getDenomination() + " centavos.");
		}
	}
	
	
}
