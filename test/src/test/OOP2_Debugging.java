package test;

public class OOP2_Debugging {

	//private boolean hatVersatz = false;

	/**
	 * Durchnummerierung von Spalten als Überschrift mit Trennstrich.
	 * 
	 * @param maxSpalte  höchste Spaltenzahl, bis zu der Nummeriert wird
	 * @param hatVersatz gibt ab, ob eine Spalte (\t) Versatz eingefügt wird
	 */

	public static void tabellenUeberschrift(int maxSpalte, boolean hatVersatz) {
		// verschiebt die Nummerierung um einen Tab nach rechts
		if (hatVersatz)
			System.out.print("\t");
		// Spaltennummerierung
		for (int i = 1; i <= maxSpalte; i++) {
			System.out.print(i + "\t");
		}
		// Zeilenumbruch
		System.out.println();
		// verlängert den Trennstrich bei Versatz
		if (hatVersatz)
			;
		System.out.print("--------");
		// Spaltentrennstrich
		for (int i = 1; i <= maxSpalte; i++)
			;
		System.out.print("--------");
		// Zeilenumbruch
		System.out.println();
	}

	/**
	 * Gibt das Einmaleins als Tabelle mit Überschrift aus
	 * 
	 * @param maxZahl höchste Zahl, incl. der das Einmaleins ausgegeben wird
	 */
	public static void einMalEins(int maxZahl) {
		// Ausgabe der Überschrift
		tabellenUeberschrift(maxZahl, true);
		// Die Ausgabe erfolge zeilenweise.
		// Daher beginnen wir außen mit der
		// Schleife über die Ausgabe aller Zeilen
		for (int zeile = 1; zeile <= maxZahl; zeile++) {
			// Zeilentitel ausgeben:
			System.out.print(zeile + "\t");
			// In jeder Zeile werden nun alle Spalten ausgegeben
			for (int spalte = 1; spalte <= maxZahl; spalte++) {
				// An jedem Kreuzungspunkt zeile/spalte wird das Produkt
				// ausgegeben; \t ist ein Tab-Schritt
				// Hinweis: .print() gibt keinen Zeilenumbruch aus
				System.out.print((spalte * zeile) + " \t");
			} // Ende Schleife über alle Spalten
				// Zeilenumbruch am Ende aller Spalten jeder Zeile
			System.out.println(" ");
		} // Ende Schleife über alle Zeilen
	}

	/**
	 * @param args es sind keine Kommandozeilen-Parameter definiert
	 */
	public static void main(String[] args) {
		System.out.println("Aufgabe 1a)");
		tabellenUeberschrift(1, false);
		tabellenUeberschrift(5, true);

		// tabellenUeberschrift("10",false);
		// -> Fehler: The method tabellenUeberschrift(int, boolean) in the type

		// OOP1_Teil07_A01 is not applicable for the arguments (String, boolean)

		System.out.println("\nAufgabe 1b)");
		einMalEins(10);
	}

}

//Zeile 14 Die Methode tabellenUebelschrift ist vertippt. Korrekt wäre tabellenUeberschrift mit "r" 
//Zeile 14 paramater maxSpalte sollte int sein nicht datentyp byte
//Zeile 19 for schleife i sollte kleiner gleich als maxSpalte sein 
//Zeile 43 hatVersatz sollte als parameter true bekommen statt false
//Zeile 47 Kopf von for Schleife sollte <= sein statt <
//Zeile 51 in der for Schleife spalte-- sollte spalte++ sein
//Zeile 58 Statt System.out.print() Methode System.out.println() Methode sollte aufgerufen werden
//Zeile 65 main Methode ist statt public als private definiert

/*
 * public class OOP2_Debugging {
 * 
 * private boolean hatVersatz = false;
 * 
 * // Zeile 13 Die Methode tabellenUebelschrift ist vertippt. Korrekt wäre
 * tabellenUeberschrift mit "r"
 * 
 *//**
	 * Durchnummerierung von Spalten als Überschrift mit Trennstrich.
	 * 
	 * @param maxSpalte  höchste Spaltenzahl, bis zu der Nummeriert wird
	 * @param hatVersatz gibt ab, ob eine Spalte (\t) Versatz eingefügt wird
	 */
/*
 * 
 * public static void tabellenUebelschrift(byte maxSpalte, boolean hatVersatz) {
 * // verschiebt die Nummerierung um einen Tab nach rechts if (hatVersatz)
 * System.out.print("\t"); // Spaltennummerierung for (int i = 1; i >=
 * maxSpalte; i++) { System.out.print(i + "\t"); } // Zeilenumbruch
 * System.out.println(); // verlängert den Trennstrich bei Versatz if
 * (hatVersatz); System.out.print("--------"); // Spaltentrennstrich for (int i
 * = 1; i <= maxSpalte; i++); System.out.print("--------"); // Zeilenumbruch
 * System.out.println(); }
 * 
 *//**
	 * Gibt das Einmaleins als Tabelle mit Überschrift aus
	 * 
	 * @param maxZahl höchste Zahl, incl. der das Einmaleins ausgegeben wird
	 */
/*
 * public static void einMalEins(int maxZahl) { // Ausgabe der Überschrift
 * tabellenUeberschrift(maxZahl, false); // Die Ausgabe erfolge zeilenweise. //
 * Daher beginnen wir außen mit der // Schleife über die Ausgabe aller Zeilen
 * for (int zeile = 1; zeile < maxZahl; zeile++) { // Zeilentitel ausgeben:
 * System.out.print(zeile + "\t"); // In jeder Zeile werden nun alle Spalten
 * ausgegeben for (int spalte = 1; spalte <= maxZahl; spalte--) { // An jedem
 * Kreuzungspunkt zeile/spalte wird das Produkt // ausgegeben; \t ist ein
 * Tab-Schritt // Hinweis: .print() gibt keinen Zeilenumbruch aus
 * System.out.print((spalte * zeile) + " \t"); } // Ende Schleife über alle
 * Spalten // Zeilenumbruch am Ende aller Spalten jeder Zeile
 * System.out.print(" "); } // Ende Schleife über alle Zeilen }
 * 
 *//**
	 * @param args es sind keine Kommandozeilen-Parameter definiert
	 *//*
		 * private static void main(String[] args) { System.out.println("Aufgabe 1a)");
		 * tabellenUeberschrift(1, false); tabellenUeberschrift(5, true);
		 * 
		 * // tabellenUeberschrift("10",false); // -> Fehler: The method
		 * tabellenUeberschrift(int, boolean) in the type
		 * 
		 * // OOP1_Teil07_A01 is not applicable for the arguments (String, boolean)
		 * 
		 * System.out.println("\nAufgabe 1b)"); einMalEins(10); }
		 * 
		 * }
		 */
