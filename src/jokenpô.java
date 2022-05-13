import java.util.Scanner;
import java.util.Random;

public class jokenpô {

	public static void main(String[] args) {

		/*
		 * Pedra ganha da tesoura (amassando-a ou quebrando-a). Tesoura ganha do papel
		 * (cortando-o). Papel ganha da pedra (embrulhando-a).
		 */

		int computador, jogador, placarComputador = 0, placarJogador = 0;

		Scanner sc = new Scanner(System.in);

			do {

				System.out.println("****        JoKenPô        ****");
				System.out.println("Você jogara contra o computador!");
				System.out.println("");
				System.out.println("***** Placar Atual *****");
				System.out.printf("jogador: %d || Computador: %d%n", placarJogador, placarComputador);
				System.out.println("************************");
				System.out.println("");
				System.out.println("1 - Pedra");
				System.out.println("2 - Papel");
				System.out.println("3 - Tesoura");
				System.out.println("");
				System.out.print("Escolha um numero: ");
				jogador = sc.nextInt();
				System.out.println("");

				// Jogador
				switch (jogador) {
				case 1: {
					System.out.println("Jogador escolheu PEDRA");
					break;
				}

				case 2: {
					System.out.println("Jogador escolheu PAPEL");
					break;
				}

				case 3: {
					System.out.println("Jogador escolheu Tesoura");
					break;
				}

				default:
					System.out.println("Opção invalida!");
					break;
				}

				// Computador
				Random random = new Random();
				computador = random.nextInt(3) + 1;

				switch (computador) {
				case 1: {
					System.out.println("Computador escolheu PEDRA");
					break;
				}

				case 2: {
					System.out.println("Computador escolheu PAPEL");
					break;
				}

				case 3: {
					System.out.println("Computador escolheu TESOURA");
					break;
				}

				}

				// Vencedor
				System.out.println("");
				if (jogador == computador) {
					System.out.println("Mesma jogada!");
					System.out.println("");
					System.out.println("-------------");
					System.out.println("");
				} else {
					if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
							|| (jogador == 3 && computador == 2)) {
						System.out.println("Jogador venceu!");
						System.out.println("");
						System.out.println("-------------");
						System.out.println("");
						placarJogador++;
					} else {
						System.out.println("Computador venceu!");
						System.out.println("");
						System.out.println("-------------");
						System.out.println("");
						placarComputador++;

					}

				}

			} while ((placarJogador < 3) && (placarComputador < 3));
			
			// placar
			if (placarJogador > placarComputador) {
				System.out.println("Jogador venceu o Computador!");
			} else {
				System.out.println("Computador venceu o jogador!");
			}

			System.out.println("Jogador: " + placarJogador + " || Computador: " + placarComputador);
			System.out.println("Fim de jogo.");		
		
		sc.close();
	}
}