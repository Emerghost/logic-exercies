package multiplos;

public class NumeroPrimo {

	public static void main(String[] args) {
		int x = 3, primo = 0, num = 0, limite = 10;

		for (int i = 0; primo <= limite; i++) {
			x++;

			if (x < 10) {
				if (x % 2 == 0 || x % 3 == 0) {
					System.out.println("nao e primo");
				} else {
					System.out.println(x);
					primo++;
				}

			}

			else {
				for (int j = 2; j <= 10; j++) {

					if (x % i == 0) {
						num++;

					}

				}
				if (num != 0) {

				}

				if (num == 0) {
					primo++;
				}

			}

		}

	}
}
