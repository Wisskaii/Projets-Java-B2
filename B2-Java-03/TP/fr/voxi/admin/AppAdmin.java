package fr.voxi.admin;

public class AppAdmin {

	public static void main(String[] args) {
		
		
		AudioBook [] lesAudiobooks = {
				
				new AudioBook( 1 , "Français" , 15 ) ,
				new AudioBook( 2 , "Anglais" , 20 ) ,
				new AudioBook( 3 , "Français" , 10 ) ,
				new AudioBook( 4 , "Français" , 8 ) ,
				new AudioBook( 5 , "Allemand" , 33 ) ,
				new AudioBook( 6 , "Allemand" , 10 ) ,
				new AudioBook( 7 , "Anglais" , 15 ) ,
				new AudioBook( 8 , "Français" , 20 )
				
		} ;
		
		Lecteur lecteur1 = new Lecteur(101, "SANTERRE", "Jean", 20) ;
		System.out.println(lecteur1.toString());
		System.out.println("Nom du lecteur 101 : " + lecteur1.getNom());

		Lecteur lecteur2 = new Lecteur(102, "NONATO", "Isabella") ;
		System.out.println(lecteur2.toString());
		System.out.println("Nom du lecteur 102 : " + lecteur2.getNom());

		System.out.println("La lectrice numéro 102 vient de se marier et se nomme maintenant \"SANTERRE\"");
		lecteur2.setNom("SANTERRE");
		System.out.println("Nom du lecteur 102 : " + lecteur2.getNom());

		System.out.println(lecteur1.estActif());
		System.out.println(lecteur2.estActif());

		System.out.println("Nombre d'Audiobooks produit par le lecteur 101 : " + lecteur1.getNbAudiobooksProduits());
		lecteur1.produireUnAudiobook();
		System.out.println("Le lecteur 101 vient de produire un nouvel Audiobook");
		System.out.println("Nombre d'Audiobooks produit par le lecteur 101 : " + lecteur1.getNbAudiobooksProduits());

		Evaluation eval1 = new Evaluation(1, 5, "Excellent !!!", 23, true) ;
		Evaluation eval2 ;
		System.out.println(eval1.toString());
		System.out.println("Un utilisateur vient d'aimer l'évaluation 1");
		eval1.ajouterLike();
		System.out.println("Nombre de like de l'évaluation 1 : " + eval1.getNbLikes());
		eval2 = eval1 ;
		System.out.println(eval2.toString());
		System.out.println(eval1.toString());
		eval2.ajouterLike();
		System.out.println("Un utilisateur vient d'aimer l'évaluation 2");
		System.out.println(eval2.toString());
		System.out.println(eval1.toString());

		System.out.println( "Réf. Éval. n° 1 : " + eval1.hashCode() ) ;
		System.out.println( "Réf. Éval. n° 2 : " + eval2.hashCode() ) ;

		System.out.println( "\n\n----[ Question 3.4 ]----\n" ) ;
		visualiserAB( lesAudiobooks ) ;
		
		
		System.out.println( "\n\n----[ Question 3.5 ]----\n" ) ;
		visualiserLangueAB( lesAudiobooks ) ;
		
		
		System.out.println( "\n\n----[ Question 3.6 ]----\n" ) ;
		visualiserLangueABMaj( lesAudiobooks ) ;
		
		
		System.out.println( "\n\n----[ Question 3.7 ]----\n" ) ;
		int nbABenFr = calculerNbABenFrancais( lesAudiobooks ) ;
		System.out.println( "Nombre d'audios en français : " + nbABenFr ) ;
		
		
		System.out.println( "\n\n----[ Question 3.8 ]----\n" ) ;
		visualiserNbMaxChapitres( lesAudiobooks ) ;
		
	}
	
	
	private static void visualiserAB( AudioBook [] lesABooks ) {
		// Question 3.4 : Votre code ici

		for(int i = 0 ; i < lesABooks.length ; i++){
			System.out.println(lesABooks[i]);
		}
	}
	
	
	private static void visualiserLangueAB( AudioBook [] lesABooks ) {
		// Question 3.5 : Votre code ici

		for(int i = 0 ; i < lesABooks.length ; i++){
			System.out.println(lesABooks[i].getLangue());
		}
		
	}
	

	private static void visualiserLangueABMaj( AudioBook [] lesABooks ) {
		// Question 3.6 : Votre code ici

		for(int i = 0 ; i < lesABooks.length ; i++){
			System.out.println(lesABooks[i].getLangue().toUpperCase());
		}
		
	}
	
	
	private static int calculerNbABenFrancais( AudioBook [] lesABooks ) {
		// Question 3.7 : Votre code ici

		int nbABooksFr = 0 ;

		for(int i = 0 ; i < lesABooks.length ; i++){
			if(lesABooks[i].getLangue() == "Français"){
				nbABooksFr++ ;
			}
		}
		return nbABooksFr ;
	}
	
	
	private static void visualiserNbMaxChapitres( AudioBook [] lesABooks ) {
		// Question 3.8 : Votre code ici

		if(lesABooks.length > 0){
			int nbMaxChapitres = 0 ;
			for(int i = 0 ; i < lesABooks.length ; i++){
				if(lesABooks[i].getNbChapitres() > nbMaxChapitres){
					nbMaxChapitres = lesABooks[i].getNbChapitres() ;
				}
			}
			System.out.println(nbMaxChapitres);
		}
		else{
			System.out.println("Aucun audiobook recensé");
		}
	}

}
