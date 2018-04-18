

public class Eratosthenes {

	public static void main(String[] args){
		
		//Fehlermeldung falls kein Parameter, oder
		//zu viele Parameter, übergeben worden sind
		if(args.length == 0 || args.length > 2){
			System.out.println("Bitte geben Sie die Klasse zusammen mit eins oder zwei Eingabeparametern");
			System.out.println("Beispiel: java Eratosthenes 100");
			System.out.println("Geben sie -o als zweites Parameter um die Primzahlen auch auszudrücken");
			System.out.println("Beispiel: java Eratosthenes 100 -o");
		} else {
		
			//Der Eingabeparameter wird zu einem integer konvertiert
			int n = Integer.parseInt(args[0]);
			
			//Hilfsarray, um die Primzahlen mit den Indexes zu bestimmen
			boolean[] isPrime = new boolean[n + 1];
			
			//Setze alles auf true am Anfang
			for(int i = 0; i <= n; i++){
				isPrime[i] = true;
			}
			
			
			//bei 2 anfangen, da 0 und 1 keine Primzahlen sind
			for(int i = 2; i <= n; i++){
				if( isPrime[i] == true ){
					for(int j = i + 1; j <= n; j++){
						if( j % i == 0){
							//alle nicht Primzahlen setzen wir auf false
							isPrime[j] = false;
						}
					}
				}
			}
			
			//Count zählt die Anzahl der Primzahlen
			int count = 0;
			for(int i = 2; i <= n; i++){
				if( isPrime[i] == true){
					count++;
				}
			}
			
			System.out.println(count + " Primzahlen wurden gefunden.");
			
			//Falls -o übergeben worden ist, bekommen wir eine Liste der Primzahlen
			if(args.length == 2){
				if(args[1].equals("-o")){				
					for(int i = 2; i <= n; i++){
						if( isPrime[i] == true){
							System.out.println(i);
						}
					}
				}
			}
		}
		
	}
}
