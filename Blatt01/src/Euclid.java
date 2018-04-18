
public class Euclid {

	public static void main(String[] args){
		
		//Fehlermeldung wenn nicht zwei Parameter übergeben wurden
		if( args.length != 2){
			System.out.println("****Bitte geben Sie die Klassenname zusammen mit zwei Eingabeparametern an****");
			System.out.println("****Beispiel: java Euclid 264 846****");
			throw new IllegalArgumentException();
		
		//Durch 0 dürfen wir nicht dividieren
		} if (Integer.parseInt(args[0]) == 0){
			System.out.println("****Durch 0 darf nicht geteilt werden!****");
			throw new IllegalArgumentException();		
		} else {
			System.out.println(ggt(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
		}
	}
	
	//Euclid Methode zur Berechnung des Größten gemeinsamen Teiler
	public static int ggt(int a, int b){
		
		//Abbruchbedingung
		if( b == 0 ){
			return a;
			
		//Rekursionsaufruf nach Euklidische Formel
		} else {
			return ggt(b, a % b);
		}
	}
	
	
}
