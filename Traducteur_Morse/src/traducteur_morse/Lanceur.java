/*
 *  Fichier : Lanceur.java ( main )
 *
 *  Projet : Voici un traducteur Morse vers Texte et inversement en java
 *           sous forme procédurale
 * 
 *  Auteur : Clément
 *
 *  Date de mise à jour : 03/09/2021  
 *
 */
package traducteur_morse;

import javax.swing.JOptionPane;

public class Lanceur 
{
    // Tableaux des codes Utiles
    
    // 0 : Modèle
    
    private static char [] Test = new char [ 5 ];
    
    // 1 : Lettres
    
    private static char [] Tableau_Lettres = new char [ 37 ];
    
    // 2 : Morse
    
    private static String [] Tableau_Morses = new String [ 37 ];
    
    // Indicateur de validite
    
    private static boolean Validité = false;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
                   
        // initialisation du contennu des tableaux
        
        // Type primitif char de Java :
        // caractère unicode codé sur 2 octets
        
        // Terminaison de chaine en : '\u0000'
        
        Tableau_Lettres [ 0 ] = 'A';
        Tableau_Morses [ 0 ] = ".-\u0000";
        
        Tableau_Lettres [ 1 ] = 'B';
        Tableau_Morses [ 1 ] = "-...\u0000";
        
        Tableau_Lettres [ 2 ] = 'C';
        Tableau_Morses [ 2 ] = "-.-.\u0000";
        
        Tableau_Lettres [ 3 ] = 'D';
        Tableau_Morses [ 3 ] = "-..\u0000";
                
        Tableau_Lettres [ 4 ] = 'E';
        Tableau_Morses [ 4 ] = ".\u0000";
        
        Tableau_Lettres [ 5 ] = 'F';
        Tableau_Morses [ 5 ] = "..-.\u0000";
        
        Tableau_Lettres [ 6 ] = 'G';
        Tableau_Morses [ 6 ] = "--.\u0000";
        
        Tableau_Lettres [ 7 ] = 'H';
        Tableau_Morses [ 7 ] = "....\u0000";
        
        Tableau_Lettres [ 8 ] = 'I';
        Tableau_Morses [ 8 ] = "..\u0000";
        
        Tableau_Lettres [ 9 ] = 'J';
        Tableau_Morses [ 9 ] = ".---\u0000";
        
        Tableau_Lettres [ 10 ] = 'K';
        Tableau_Morses [ 10 ] = "-.-\u0000";
        
        Tableau_Lettres [ 11 ] = 'L';
        Tableau_Morses [ 11 ] = ".-..\u0000";
        
        Tableau_Lettres [ 12 ] = 'M';
        Tableau_Morses [ 12 ] = "--\u0000";
        
        Tableau_Lettres [ 13 ] = 'N';
        Tableau_Morses [ 13 ] = "-.\u0000";
        
        Tableau_Lettres [ 14 ] = 'O';
        Tableau_Morses [ 14 ] = "---\u0000";
        
        Tableau_Lettres [ 15 ] = 'P';
        Tableau_Morses [ 15 ] = ".--.\u0000";
        
        Tableau_Lettres [ 16 ] = 'Q';
        Tableau_Morses [ 16 ] = "--.-\u0000";
        
        Tableau_Lettres [ 17 ] = 'R';
        Tableau_Morses [ 17 ] = ".-.\u0000";
        
        Tableau_Lettres [ 18 ] = 'S';
        Tableau_Morses [ 18 ] = "...\u0000";
        
        Tableau_Lettres [ 19 ] = 'T';
        Tableau_Morses [ 19 ] = "-\u0000";
        
        Tableau_Lettres [ 20 ] = 'U';
        Tableau_Morses [ 20 ] = "..-\u0000";
        
        Tableau_Lettres [ 21 ] = 'V';
        Tableau_Morses [ 21 ] = "...-\u0000";
        
        Tableau_Lettres [ 22 ] = 'W';
        Tableau_Morses [ 22 ] = ".--\u0000";
        
        Tableau_Lettres [ 23 ] = 'X';
        Tableau_Morses [ 23 ] = "-..-\u0000";
        
        Tableau_Lettres [ 24 ] = 'Y';
        Tableau_Morses [ 24 ] = "-.--\u0000";
        
        Tableau_Lettres [ 25 ] = 'Z';
        Tableau_Morses [ 25 ] = "--..\u0000";
        
        Tableau_Lettres [ 26 ] = '.';
        Tableau_Morses [ 26 ] = ".-.-.-\u0000";
        
        Tableau_Lettres [ 27 ] = '0';
        Tableau_Morses [ 27 ] = "-----\u0000";
        
        Tableau_Lettres [ 28 ] = '1';
        Tableau_Morses [ 28 ] = ".----\u0000";
        
        Tableau_Lettres [ 29 ] = '2';
        Tableau_Morses [ 29 ] = "..---\u0000";
        
        Tableau_Lettres [ 30 ] = '3';
        Tableau_Morses [ 30 ] = "...--\u0000";
        
        Tableau_Lettres [ 31 ] = '4';
        Tableau_Morses [ 31 ] = "....-\u0000";
        
        Tableau_Lettres [ 32 ] = '5';
        Tableau_Morses [ 32 ] = ".....\u0000";
        
        Tableau_Lettres [ 33 ] = '6';
        Tableau_Morses [ 33 ] = "-....\u0000";
        
        Tableau_Lettres [ 34 ] = '7';
        Tableau_Morses [ 34 ] = "--..\u0000";
        
        Tableau_Lettres [ 35 ] = '8';
        Tableau_Morses [ 35 ] = "---..\u0000";
        
        Tableau_Lettres [ 36 ] = '9';
        Tableau_Morses [ 36 ] = "----.\u0000";
        // 1 - Test unitaire des 4 fonctions
        
        ////////////////////////////////////////////////////////////////////////////////////////////
        // LETTRE EN MORSE
        
        // Fonctionne
        
        System.out.println("\nFonctionne ----------- LETTRE EN MORSE");
        
        char Morse [ ];
        
        Morse = new char [ 10 ];
        
        Morse [ 0 ] = '\u0000';
        
        Morse = Traduire_Lettre_En_Morse('A');
        
        String s_Morse = String.copyValueOf( Morse );
        
        System.out.println("Voici la traduction de : " + 'A' + " : " + s_Morse );
        System.out.println("Validité : " + Validité );
        
        // Erreur
        
        System.out.println("Erreur ----------- LETTRE EN MORSE");
        
        Morse [ 0 ] = '\u0000';
        
        Morse = Traduire_Lettre_En_Morse('a');
        
        s_Morse = String.copyValueOf( Morse );
        
        System.out.println("Voici la traduction de : " + 'a' + " : " + s_Morse );
        System.out.println("Validité : " + Validité );
        
        ///////////////////////////////////////////////////////////////////////////////////////////
        // TEXTE EN MORSE
        
        // fonctionne
        
        System.out.println("\nFonctionne ----------- TEXTE EN MORSE");
        
        char Morse_2 [  ];
        
        Morse_2 = new char [ 10 ];
        
        Morse_2 = "TOTO SOS".toCharArray();
        
        Morse_2 = Traduire_Texte_En_Morse(Morse_2);
        
        System.out.println("Voici la traduction de TOTO SOS : " + String.valueOf(Morse_2));
        System.out.println("Validité : " + Validité );
        
        // Erreur
        
        System.out.println("Erreur ----------- LETTRE EN MORSE");
        
        Morse_2 = "toTo SOs".toCharArray();
        
        Morse_2 = Traduire_Texte_En_Morse(Morse_2);
        
        System.out.println("Voici la traduction de toTo SOs : " + String.valueOf(Morse_2));
        System.out.println("Validité : " + Validité );
        
        ///////////////////////////////////////////////////////////////////////////////////////////
        // MORSE EN LETTRE
        
        // fonctionne
        
        System.out.println("\nFonctionne ----------- MORSE EN LETTRE");
        
        char lettre;
        
        char morse_5 [];
        
        morse_5 = ".-".toCharArray();
        
        lettre = Traduire_Morse_En_Lettre(morse_5);
        
        System.out.println("Voici la traduction de .- : " + lettre);
        System.out.println("Validité : " + Validité );
        
        // Erreur
        
        System.out.println("Erreur ----------- MORSE EN LETTRE");
                
        String morse_4 = ".-.....";
        
        lettre = Traduire_Morse_En_Lettre(morse_4.toCharArray());
        
        System.out.println("Voici la traduction de .-..... : " + lettre);
        System.out.println("Validité : " + Validité );
        
        ///////////////////////////////////////////////////////////////////////////////////////////
        // MORSE EN TEXTE
        
        // fonctionne
        
        System.out.println("\nFonctionne ----------- MORSE EN TEXTE");
        
        char Morse_3 [  ];
        
        
        Morse_3 = new char [ 500 ];
        
        Morse_3 = "-/---/-/---/ /.../---/.../!".toCharArray();
        
        Morse_3 = Traduire_Morse_En_Texte(Morse_3);
        
        System.out.println("Voici la traduction de -/---/-/---/ /.../---/.../! : " + String.valueOf(Morse_3));
        System.out.println("Validité : " + Validité );
        
        // Erreur
        
        System.out.println("Erreur ----------- MORSE EN TEXTE");
               
        Morse_3 = "-/---/-/--....-/ /..---./-------/.../!".toCharArray();
        
        Morse_3 = Traduire_Morse_En_Texte(Morse_3);
        
        System.out.println("Voici la traduction de -/---/-/--....-/ /..---./-------/.../! : " + String.valueOf(Morse_3));
        System.out.println("Validité : " + Validité );
       
        // 2 - Programme général
        
        char chaine_saisie [ ];
        
        chaine_saisie = new char [ 500 ];
        
        
        chaine_saisie [ 0 ] = '\u0000';

	char chaine_traduite [ ];
        
        chaine_traduite = new char [ 500 ];
        
        chaine_traduite [ 0 ] = '\u0000';

        // Saisir une chaîne de caractères
        
        // reponse stockée dans un string tampon
        String Texte = JOptionPane.showInputDialog(null, "Entrez votre message :");
        
        chaine_saisie = Texte.toCharArray();
                
	// Détecter/isoler le premier caractère

	// Si 1er caractère vaut . ou -

	if ( chaine_saisie [ 0 ] == '.' || chaine_saisie [ 0 ] == '-' )
	{
	// ALORS Traduire en texte 

                chaine_traduite = Traduire_Morse_En_Texte(chaine_saisie);
            
		System.out.println("Voici la traduction de " + String.copyValueOf(chaine_saisie) + " : " + String.valueOf(chaine_traduite));
                
                System.out.println("Validité : " + Validité );
	}
	// SINON Traduire en morse
	else 
	{
		chaine_traduite = Traduire_Texte_En_Morse(chaine_saisie);
            
		System.out.println("Voici la traduction de " + String.copyValueOf(chaine_saisie) + " : " + String.valueOf(chaine_traduite));
                
                System.out.println("Validité : " + Validité );
	}
        
    } // Fin du main
    
    // Définition de fonctions personnalisées
    
        
    /**
     * @see lettre en morse
     * 
     * @param lettre
     * 
     * @return morse , char
     */
    
    // 1 : Traduire_Lettre_En_Morse
    
    private static char [ ] Traduire_Lettre_En_Morse ( char lettre )
    {
        // variables locales
        
        char morse [ ];
        
        morse = new char [ 10 ];
        
        morse [ 0 ] = '\u0000';
        
        Validité = false;
        
        // scrutation 
        
        for ( int i = 0 ; i < Tableau_Lettres.length ; i++ )
        {
            // lorsque le charactère inconnu correspond 
            // à un charactère connu
            
            if ( lettre == Tableau_Lettres [ i ] )
            {
               morse =  Tableau_Morses [ i ].toCharArray() ;
               
               Validité = true;
            }
        }
        
        // si la traduction est impossible, on place des ???
        
        if ( Validité == false )
        {
            String s = "???";
            
            morse = s.toCharArray();
        }
        return morse;
    }
    
    /**
     * @see texte en ensemble_morse
     * 
     * @param texte
     * 
     * @return ensemble_morse, char
     */
    
    // 2 : Traduire_Texte_En_Morse
    
    private static char [ ] Traduire_Texte_En_Morse ( char texte [ ] )
    {
        // variables locales
        
        Validité = false;
        
        char ensemble_morse [ ];
        
        ensemble_morse = new char [ 500 ];
        
        ensemble_morse [ 0 ] = '\u0000';
                
        // String tampon de morse
        String s_morse;
        
        s_morse = "";
                
        int compteur_traduction = 0;
        
        // mesure du texte
        
        int taille = texte.length;
        
        // scrutation selon la taille
        
        for ( int i = 0 ; i < taille ; i++ )
        {
            // en cas d'espace alors :
            if ( texte [ i ] == ' ' )
            {
                ensemble_morse = String.valueOf(ensemble_morse).concat(" ").toCharArray();
                                               
                compteur_traduction++;
                         
                s_morse = "";
            }
            // si le charactère n'est pas un espace
            // alors on peut traduire la lettre en morse
            
            if ( texte [ i ] != ' ' )
            {
                ensemble_morse = Traduire_Lettre_En_Morse( texte [ i ] );
            }         
            
            s_morse += String.copyValueOf(ensemble_morse) + "|";
            
            ensemble_morse = s_morse.toCharArray();
        }
        
        // la validité est vraie seulement si le nombre de charactère traduit 
        // vaut la taille du texte
        
        if ( compteur_traduction == taille )
        {
            Validité = true;
        }
        
        return ensemble_morse;
    }
        
    /**
     * @see morse en lettre
     * 
     * @param morse
     * 
     * @return lettre, char
     */
    
    // 3 : Traduire Morse_En_Lettre
    private static char Traduire_Morse_En_Lettre ( char morse [] )
    {
        // variables locales
        
        char lettre = ' ';
        
        // string tampon du morse connu
        String comparaison = "";
        
        // pour comparer les tailles entre nos 2 morses
        int Difference_Taille = 0;
        
        Validité = false;
        
        // scrutation
        for ( int i = 0 ; i < Tableau_Morses.length ; i++ )
        {       
        // comparaison de taille entre le code morse inconnu et connu
        // on retirera un caractère à cause du '\u0000'
            
        comparaison = Tableau_Morses[i].substring(0, Tableau_Morses[i].length()-1);
        
        Difference_Taille = String.copyValueOf(morse).compareTo(comparaison);   
        
            // si la taille est similaire la taille sera de 0
            // et donc on pourra placer la lettre souhaitée
            
            if ( Difference_Taille == 0 )
            {
               lettre =  Tableau_Lettres [ i ];
               
               Validité = true;
            }
        } // fin du for
        
        if ( Validité == false )
        {            
            lettre = '?';
        }
        
        return lettre;
    }
        
    
    /**
     * @see morse en texte
     * 
     * @param ensemble_morse
     * 
     * @return texte, char
     */
    
    // 4 : Traduire Morse_En_Texte
    private static char [ ] Traduire_Morse_En_Texte ( char ensemble_morse [ ] )
    {
        // paramètre de retour - texte traduit
        char texte [ ];
        
        texte = new char [ 500 ];
        
        texte [ 0 ] = '\u0000';
        
        // variables locales
	Validité = false;
	
	// tableau ensemble morse
	int i = 0;
	int j = 0;

	// tableau texte
	int k = 0;

	char lettre = ' ';

	char morse [ ];
        
        morse = new char [ 50 ];
        
        morse [ 0 ] = '\u0000';

	int compteur1 = 0;
	int compteur2 = 0;
        
        // morse tampon
        String morse_2 = "";
                
	do 
	{
		// scrutation morse par morse
		j = 0;

		morse [ 0 ] = '\u0000';

		do
		{
			morse [ j ] = ensemble_morse [ i ];
			i++;
			j++;
		} while ( ensemble_morse [ i ] != '/' );

		// remplacement morse en lettre dans un premier temps

		compteur1++;

		morse [ j ] = '\u0000';
                
                // on prend le morse qui nous interesse en retirant les '\u0000'
                morse_2 = String.copyValueOf(morse).substring(0, String.copyValueOf(morse).length()-(50-j));
                
                // si en cas d'espace, on en place un
                if ( morse_2.equals(" ") )
                {
                    lettre = ' ';
                } 
                
                // auquel cas, on traduit le code morse
                else 
                {
                    lettre = Traduire_Morse_En_Lettre ( morse_2.toCharArray() );
                }
                               
		if ( lettre != '?' )
		{
		
		compteur2++;
		
		}

		texte [ k ] = lettre;
		
		k++;

		i++; 
	} while ( ensemble_morse [ i ] != '!' );

	// on place le dernier caractère de la chaine en caractère NUL

	texte [ k ] = '\u0000';

        // la validité de traduction est vraie si chaque élément a été traduit
        
	if ( compteur1 == compteur2 )
	{
	
	Validité = true;

	} 
        else 
        {
            Validité = false;
        }
        
        return texte;
    }
} // Fin classe
