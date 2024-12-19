package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToolBar;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		BorderPane root = new BorderPane();

		/**
		 * ----------------------- Header -----------------------
		 * Contient :
		 * - la bannière (banner)
		 * - barre de navigation (navbar)
		 */
		
		
		/**
		 * ----------------------- Bannière -----------------------
		 * Contient : 
		 * - le bouton Home
		 * - le logo AO3
		 * - le titre : Archive of Your Own
		 * - la barre de recherche
		 */
		
		//Bouton Home
		Button homeButton = new Button("Home");
		homeButton.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //Police Arial, en gras et de taille 20
		homeButton.setTextFill(Color.WHITE); //Police blanche
		
		
		//Evenement
		homeButton.setOnAction(new EventHandler<ActionEvent>() { //On définit l'événement
			public void handle(ActionEvent event) { //Methode pour etre redirigé vers une autre page 
	                Page page = new Page(); //Instanciation de la page "Page"
	                page.start(primaryStage); //Appel de la methode start de la classe Page pour afficher la page 
	            }
	        });
		
		
		//Logo AO3
		Image logo = new Image(getClass().getResourceAsStream("/images/logo_ao3.png"));
		ImageView imageView = new ImageView(logo); //Vue pour afficher le logo AO3
		//Titre 
		Label titre = new Label("Archive of Your Own");
		titre.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //Police Arial, en gras et de taille 20
		titre.setTextFill(Color.rgb(136, 21, 21)); //Police rouge foncé
		//Barre de recherche
		TextField recherche = new TextField("Search...");
		recherche.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //Police Arial, en gras et de taille 20

		
		
		/**
		 * ----------------------- Navbar -----------------------
		 * Contient : 
		 * - le menu déroulant des Fandoms
		 * - le menu déroulant de Browse
		 * - le menu déroulant de Search
		 * - le bouton log in
		 */
		
		//Menu déroulant de Fandoms
		MenuButton optionsMenuFandoms = new MenuButton("Fandoms");
		optionsMenuFandoms.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
		//Création des items
		MenuItem optionFandoms1 = new MenuItem("All Fandoms");
		MenuItem optionFandoms2 = new MenuItem("Anime & Manga");
		MenuItem optionFandoms3 = new MenuItem("Books & Literature");
		MenuItem optionFandoms4 = new MenuItem("Cartoons & Comics & Graphic Novels");
		MenuItem optionFandoms5 = new MenuItem("Celebrities & Real People");
		MenuItem optionFandoms6 = new MenuItem("Movies");
		MenuItem optionFandoms7 = new MenuItem("Music & Bands");
		MenuItem optionFandoms8 = new MenuItem("Other Media");
		MenuItem optionFandoms9 = new MenuItem("Theater");
		MenuItem optionFandoms10 = new MenuItem("TV Shows");
		MenuItem optionFandoms11 = new MenuItem("Video Games");
		MenuItem optionFandoms12 = new MenuItem("Uncategorized Fandoms");
		//Ajout des items dans le menu déroulant
		optionsMenuFandoms.getItems().addAll(
				optionFandoms1, 
				optionFandoms2, 
				optionFandoms3, 
				optionFandoms4,
				optionFandoms5, 
				optionFandoms6,
				optionFandoms7, 
				optionFandoms8, 
				optionFandoms9, 
				optionFandoms10,
				optionFandoms11, 
				optionFandoms12);

		
		//Menu déroulant de Browse
		MenuButton optionsMenuBrowse = new MenuButton("Browse");
		optionsMenuBrowse.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
		//Création des items
		MenuItem optionBrowse1 = new MenuItem("Works");
		MenuItem optionBrowse2 = new MenuItem("Bookmarks");
		MenuItem optionBrowse3 = new MenuItem("Tags");
		MenuItem optionBrowse4 = new MenuItem("Collections");
		//Ajout des items dans le menu déroulant
		optionsMenuBrowse.getItems().addAll(
				optionBrowse1, 
				optionBrowse2,
				optionBrowse3,
				optionBrowse4);

		
		//Menu déroulant Search
		MenuButton optionsMenuSearch = new MenuButton("Search");
		optionsMenuSearch.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
		//Création des items
		MenuItem optionSearch1 = new MenuItem("Works");
		MenuItem optionSearch2 = new MenuItem("Bookmarks");
		MenuItem optionSearch3 = new MenuItem("Tags");
		MenuItem optionSearch4 = new MenuItem("People");
		//Ajout des items dans le menu déroulant
		optionsMenuSearch.getItems().addAll(
				optionSearch1, 
				optionSearch2, 
				optionSearch3,
				optionSearch4);

		
		//Bouton Log In
		Button loginButton = new Button("Log In");
		loginButton.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
		
		
		
		/**
		 * ----------------------- Assemblage Header -----------------------
		 * Création de : 
		 * - bannière
		 * - navbar
		 * - header (bannière + navbar)
		 */
		
		//Création de la bannière dans un conteneur HBox (horizontal)
		HBox banner = new HBox(10, homeButton, imageView, titre, recherche); //Espace de 10 entre homeButton, imageView, titre, recherche
		banner.setAlignment(Pos.CENTER_LEFT); //Alignement au centre à gauche
		banner.setStyle("-fx-background-color: #828282;"); //Couleur de fond en gris foncé
		banner.setPadding(new Insets(10)); //Ajout d'un espace de 10 autour de la bannière
		
		//Création de la navbar dans un conteneur HBox (horizontal)
		HBox navbar = new HBox(10, optionsMenuFandoms, optionsMenuBrowse, optionsMenuSearch, loginButton); //Espace de 10 entre optionsMenuFandoms, optionsMenuBrowse, optionsMenuSearch, loginButton
		navbar.setAlignment(Pos.CENTER_LEFT); //Alignement au centre à gauche
		navbar.setStyle("-fx-background-color: #F2EEEE;"); //Couleur de fond en gris clair
		navbar.setPadding(new Insets(10));  //Ajout d'un espace de 10 autour de la navbar
		
		//Fusion de la bannière et de la navbar pour créer le header dans un conteneur VBox (vertical)
		VBox header = new VBox(banner, navbar); //Dans l'odre, la bannière est au dessus de la navbar
		root.setTop(header); //Place le header en haut de la fenêtre

		

		
		
		/**
		 * ----------------------- Body -----------------------
		 * Contient : 
		 * - le slogan
		 * - la liste des fandoms favoris
		 * - le liste des tags favoris
		 */
		
		//Création du slogan découpé en 2 car slogan1 doit être plus gros que slogan2
		Label slogan1 = new Label("Share and have access to fanworks !\n" + "Welcome to AO3");
		Label slogan2 = new Label("Created by FANS\n" + "Run by FANS\n" + "Non profit !");
		
		slogan1.setFont(Font.font("Arial", FontWeight.BOLD, 30)); //Police Arial, en gras et de taille 30
		slogan1.setTextAlignment(TextAlignment.CENTER); //Alignement du slogan1 au centre
		
		slogan2.setFont(Font.font("Arial", FontWeight.BOLD, 20)); //Police Arial, en gras et de taille 20
		slogan2.setTextAlignment(TextAlignment.CENTER); //Alignement du slogan2 au centre

		
		//Fandoms favoris
		Label favoritesTitre = new Label("Find Your Favorites"); //Création d'un titre
		favoritesTitre.setPadding(new Insets(10)); //Ajoute de l'espace autour du titre
		favoritesTitre.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
		//Création d'un conteneur VBox (vertical)
		VBox favoritesLiens = new VBox(); 
		//Création des liens
		Hyperlink animeManga = new Hyperlink("Anime & Manga");
		Hyperlink booksLiterature = new Hyperlink("Books & Literature");
		Hyperlink cartoonsComics = new Hyperlink("Cartoons & Comics & Graphic Novels");
		Hyperlink celebritiesPeople = new Hyperlink("Celebrities & Real People");
		Hyperlink movies = new Hyperlink("Movies");
		Hyperlink theater = new Hyperlink("Theater");
		Hyperlink tvShows = new Hyperlink("TV Shows");
		Hyperlink videoGames = new Hyperlink("Video Games");
		//Affectation des liens dans le conteneur
		favoritesLiens.getChildren().addAll(
				animeManga, 
				booksLiterature, 
				cartoonsComics, 
				celebritiesPeople, 
				movies, 
				theater, 
				tvShows, 
				videoGames);

		
		//Tags favoris
		Label tagsTitre = new Label("Find Your Tags"); //Création d'un titre
		tagsTitre.setPadding(new Insets(10)); //Ajoute de l'espace autour du titre
		tagsTitre.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
		//Création d'un conteneur VBox (vertical)
		VBox tagsLiens = new VBox(); 
		//Création des liens
		Hyperlink alternateUniverse = new Hyperlink("Alternate Universe");
		Hyperlink angst = new Hyperlink("Angst");
		Hyperlink fluff = new Hyperlink("Fluff");
		Hyperlink family = new Hyperlink("Family");
		Hyperlink friendship = new Hyperlink("Friendship");
		Hyperlink hurtComfort = new Hyperlink("Hurt/Comfort");
		Hyperlink love = new Hyperlink("Love");
		Hyperlink notCanonCompliant = new Hyperlink("Not Canon Compliant");
		Hyperlink relationship = new Hyperlink("Relationship(s)");
		Hyperlink romance = new Hyperlink("Romance");
		//Affectation des liens dans le conteneur
		tagsLiens.getChildren().addAll(
				alternateUniverse, 
				angst, 
				fluff, 
				family, 
				friendship, 
				hurtComfort, 
				love, 
				notCanonCompliant, 
				relationship, 
				romance);
		
		
		
		/**
		 * ----------------------- Assemblage Body -----------------------
		 * Création de : 
		 * - slogan
		 * - fandoms favoris
		 * - tags favoris
		 * - body (slogan + famdoms favoris + tags favoris)
		 */
		
		//Création du slogan dans un conteneur VBox (vertical)
		VBox sloganAll = new VBox(5, slogan1, slogan2); //Espace de 10 entre slogan1 et slogan2
		sloganAll.setAlignment(Pos.CENTER); //Alignement au centre
		sloganAll.setPadding(new Insets(15)); //Espace de 15 autour du slogan

		//Création de Fandoms favoris dans un conteneur VBox (vertical)
		VBox fav = new VBox(favoritesTitre, favoritesLiens); //Contient le titre et les liens 
		fav.setAlignment(Pos.TOP_CENTER); //Aligne le contenu (titre + liens) en haut au centre
		fav.setStyle("-fx-background-color: F2EEEE; -fx-background-radius: 10px;"); //Fond gris clair et bordures arrondies
		fav.setPrefSize(250, 200); //L'affichage de la section est fixé à 250 par 200
		
		//Création de Tags favoris dans un conteneur VBox (vertical)
		VBox tag = new VBox(tagsTitre, tagsLiens); //Contient le titre et les liens 
		tag.setAlignment(Pos.TOP_CENTER); //Aligne le contenu (titre + liens) en haut au centre
		tag.setStyle("-fx-background-color: F2EEEE; -fx-background-radius: 10px;"); //Fond gris clair et bordures arrondies
		tag.setPrefSize(250, 200); //L'affichage de la section est fixé à 250 par 200
		
		//Fusion de Fandoms et Tags dans un conteneur HBox (horizontal)
		HBox groupeFandomsTags = new HBox(100,fav,tag); //Espace de 100 entre Fandoms et Tags
		groupeFandomsTags.setAlignment(Pos.CENTER); //Alignement au centre
		
		//Fusion de Slogan et de Fandoms / Tags (déjà fusionnés) pour créer le body dans un conteneur VBox (vertical)
		VBox body = new VBox(sloganAll, groupeFandomsTags); //Dans l'odre, le slogan est au dessus de Fandoms / Tags
		body.setPadding(new Insets(20)); // Ajoute un espace de 20 en bas
		root.setCenter(body); //Place le body au centre de la fenêtre
		
		
		
		/**
		 * ----------------------- Footer -----------------------
		 * Contient : 
		 * - une colonne About the Archives
		 * - une colonne Contact Us
		 * - une colonne Development 
		 * - une colonne Follow Us
		 */
				
		//Colonne 1 : About the Archives
		Label colonneUne = new Label("About the Archives"); //Création d'un titre
		colonneUne.setPadding(new Insets(2)); //Ajoute de l'espace autour du titre
		colonneUne.setFont(Font.font("Arial", FontWeight.BOLD, 10)); //Police Arial, en gras et de taille 10
		//Création d'un conteneur VBox (vertical)
		VBox colonneUneLiens = new VBox(); 
		//Création des liens
		Hyperlink siteMap = new Hyperlink("Site Map");
		siteMap.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Hyperlink diversityStatement = new Hyperlink("Diversity Statement");
		diversityStatement.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Hyperlink termsOfService = new Hyperlink("Terms of Service");
		termsOfService.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Hyperlink dmcaPolicy = new Hyperlink("DMCA Policy");
		dmcaPolicy.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		//Affectation des liens dans le conteneur
		colonneUneLiens.getChildren().addAll(
				siteMap, 
				diversityStatement, 
				termsOfService,
				dmcaPolicy);

		
		//Colonne 2 : Contact Us
		Label colonneDeux = new Label("Contact Us"); //Création d'un titre
		colonneDeux.setPadding(new Insets(2)); //Ajoute de l'espace autour du titre
		colonneDeux.setFont(Font.font("Arial", FontWeight.BOLD, 10)); //Police Arial, en gras et de taille 10
		//Création d'un conteneur VBox (vertical)
		VBox colonneDeuxLiens = new VBox(); 
		//Création des liens
		Hyperlink policyQuestionsAbuseReports = new Hyperlink("Policy Questions & Abuse Reports");
		policyQuestionsAbuseReports.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Hyperlink technicalSupportFeedback = new Hyperlink("Technical Support & Feedback");
		technicalSupportFeedback.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Hyperlink news = new Hyperlink("News");
		news.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		//Affectation des liens dans le conteneur
		colonneDeuxLiens.getChildren().addAll(
				policyQuestionsAbuseReports, 
				technicalSupportFeedback, 
				news);		

		
		//Colonne 3 : Development
		Label colonneTrois = new Label("Development"); //Création d'un titre
		colonneTrois.setPadding(new Insets(2)); //Ajoute de l'espace autour du titre
		colonneTrois.setFont(Font.font("Arial", FontWeight.BOLD, 10)); //Police Arial, en gras et de taille 10
		//Création d'un conteneur VBox (vertical)
		VBox colonneTroisLiens = new VBox(); 
		//Création des liens
		Hyperlink otwarchive = new Hyperlink("otwarchive v0.9.379.1");
		otwarchive.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Hyperlink knownIssues = new Hyperlink("Known Issues");
		knownIssues.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Hyperlink gpl = new Hyperlink("GPL-2.0-or-later by the OTW");
		gpl.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		//Affectation des liens dans le conteneur
		colonneTroisLiens.getChildren().addAll(
				otwarchive, 
				knownIssues, 
				gpl);	
				
				
		//Colonne 4 : Follow Us
		Label colonneQuatre = new Label("Follow Us"); //Création d'un titre
		colonneQuatre.setPadding(new Insets(2)); //Ajoute de l'espace autour du titre
		colonneQuatre.setFont(Font.font("Arial", FontWeight.BOLD, 10)); //Police Arial, en gras et de taille 10
		Image logoTwitter = new Image(getClass().getResourceAsStream("/images/logo_twitter.png"));
		ImageView imageViewTwitter = new ImageView(logoTwitter); //Vue pour afficher le logo twitter
		Hyperlink twitter = new Hyperlink("A03_Status on Twitter"); //Lien twitter
		twitter.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		Image logoTumblr = new Image(getClass().getResourceAsStream("/images/logo_tumblr.png"));
		ImageView imageViewTumblr = new ImageView(logoTumblr); //Vue pour afficher le logo tumblr
		Hyperlink tumblr = new Hyperlink("ao3org on Tumblr"); //Lien tumblr
		tumblr.setStyle("-fx-text-fill: black;"); //Lien de couleur noir
		
		
		
		/**
		 * ----------------------- Assemblage Footer -----------------------
		 * Création de : 
		 * - colonne About The Archives
		 * - colonne Contact Us
		 * - colonne Development
		 * - colonne follow Us
		 * - footer (colonneAboutTheArchives + colonneContactUs + colonneDevelopment + colonneFollowUs)
		 */
		
		//Création de la colonne About The Archives dans un conteneur VBox (vertical)
		VBox colonneAboutTheArchives = new VBox(colonneUne, colonneUneLiens);
		//Création de la colonne Contact Us dans un conteneur VBox (vertical)
		VBox colonneContactUs = new VBox(colonneDeux, colonneDeuxLiens);
		//Création de la colonne Development dans un conteneur VBox (vertical)
		VBox colonneDevelopment = new VBox(colonneTrois, colonneTroisLiens);
		
		//Fusion de tu logo twitter et du lien
		HBox twitterGroup = new HBox(imageViewTwitter, twitter);
		twitterGroup.setAlignment(Pos.CENTER_LEFT); //Alignement au centre à gauche
		
		//Fusion de tu logo tumblr et du lien
		HBox tumblrGroup = new HBox(imageViewTumblr, tumblr);
		tumblrGroup.setAlignment(Pos.CENTER_LEFT); //Alignement au centre à gauche
		
		//Création de la colonne Follow Us dans un conteneur VBox (vertical)
		VBox colonneFollowUs = new VBox(colonneQuatre, twitterGroup, tumblrGroup);
		
		HBox footer = new HBox(120, colonneAboutTheArchives, colonneContactUs, colonneDevelopment, colonneFollowUs); //Espace de 120 entre colonneAboutTheArchives, colonneContactUs, colonneDevelopment, colonneFollowUs
		footer.setAlignment(Pos.CENTER); //Alignement au centre
		footer.setStyle("-fx-background-color: #828282;"); //Couleur de fond en gris foncé
		footer.setPadding(new Insets(5)); //Ajout d'un espace de 5 autour du footer
		root.setBottom(footer); //Place le footer en bas de la fenêtre
		
		
		
		/**
		 * ----------------------- Scène -----------------------
		 * Création de : 
		 * - la scène + scrollpane (pour faire défiler la page)
		 */
		
		//Créer une scène qui permet le défilement avec scrollpane 
	    ScrollPane scrollPane = new ScrollPane();
	    scrollPane.setContent(root); //Ajout du borderpane dans le scrollpane
	    scrollPane.setFitToWidth(true); // scrollpane ajuste la largeur et permet de supprimer le volet gris à droite
	    
		
		// Créer une scène
		Scene scene = new Scene(scrollPane, 1200, 640); //Taille de la fenêtre
		root.setStyle("-fx-background-color: white;"); //Couleur de fond en blanc
		primaryStage.setTitle("Archive of Our Own"); //Titre de la fenêtre
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Code en dessous plus nécessaire si on ajoute le scrollpane
		/*
		Scene scene = new Scene(root, 1200, 640); //Taille de la fenêtre
		root.setStyle("-fx-background-color: white;"); //Couleur de fond en blanc
		primaryStage.setTitle("Archive of Our Own"); //Titre de la fenêtre
		primaryStage.setScene(scene);
		primaryStage.show();
		*/
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}