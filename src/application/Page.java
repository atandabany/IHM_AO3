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
import javafx.scene.control.CustomMenuItem;
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

public class Page extends Application {
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
	                Main main = new Main(); //Instanciation de la page "Main"
	                main.start(primaryStage); //Appel de la methode start de la classe Main pour afficher la page 
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
		 * - l'en-tête
		 * - section 1
		 * - section 2
		 * - section 3
		 * - volet Filters sur la droite
		 */
		
		
		//L'en-tête
		Label booksAndLiterature = new Label("Books & Litterature");
		booksAndLiterature.setPadding(new Insets(10)); //Ajout d'un espace de 10 autour de la bannière
		booksAndLiterature.setFont(Font.font("Arial", FontWeight.BOLD, 16)); //Police Arial, en gras et de taille 16
		
		
		//Menu déroulant Search
		MenuButton sortBy = new MenuButton("Sort By");
		//Création des boutons
		Button buttonPagination1 = new Button("<<");
        Button buttonPagination2 = new Button("<");
        Button buttonPagination3 = new Button("1");
        Button buttonPagination4 = new Button("2");
        Button buttonPagination5 = new Button("3");
        Button buttonPagination6 = new Button("7");
        Button buttonPagination7 = new Button("9");
        Button buttonPagination8 = new Button("10");
        Button buttonPagination9 = new Button(">");
        Button buttonPagination10 = new Button(">>");
        HBox pagination = new HBox(10); //conteneur Hbox (horizontal), espace de 10 entre les boutons
        //Ajout des boutons dans le menu déroulant
        pagination.getChildren().addAll(
        		buttonPagination1, 
        		buttonPagination2, 
        		buttonPagination3, 
        		buttonPagination4, 
        		buttonPagination5, 
        		buttonPagination6, 
        		buttonPagination7, 
        		buttonPagination8, 
        		buttonPagination9, 
        		buttonPagination10);
        pagination.setAlignment(Pos.CENTER); //Centre les boutons
		
		
        //Section 1
        
        //Titre oeuvre
        Label titreFiction1 = new Label("Every Wrong with Harry Potter");
        titreFiction1.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
        
        //Nom auteur
        Label auteur1 = new Label("By WittyWizard99");
        auteur1.setPadding(new Insets(2)); //Ajoute de l'espace autour du nom de l'auteur
        auteur1.setFont(Font.font("Arial", FontWeight.BOLD, 10)); //Police Arial, en gras et de taille 10
        
        //Description
        Label description1 = new Label("A satirical take on the Harry Potter series, highlighting plot holes, character "
        		+ "inconsistencies,\nand humorous critiques. The story playfully dissects key moments in the wizarding world,\n"
        		+ "offering witty commentary and alternative perspectives.");
       
        //Status
        Label status1 = new Label("Status : Completed");
        status1.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12

        //Hastags
        Button button1 = new Button("#Humor");
        Button button2 = new Button("#Satire");
        Button button3 = new Button("#HarryPotter");
        Button button4 = new Button("#Hogwarts");
        Button button5 = new Button("#AllAges");
        button1.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button2.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button3.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button4.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button5.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
       
        //Dernier chapitre
        Label lastChapitre1 = new Label("Last Chapter : 15");
        lastChapitre1.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
       
        //Création d'un conteneur pour aligner les boutons tags à l'horizontal
        HBox hastags1 = new HBox(10); //10 est l'espacement entre les boutons
        //Ajout des boutons dans le menu déroulant
        hastags1.getChildren().addAll(
        		button1, 
        		button2, 
        		button3,
        		button4, 
        		button5);
        
        //Création d'un conteneur pour aligner tous les éléments de la section 1 à la verticale
        VBox section1 = new VBox(10, titreFiction1, auteur1, description1, status1, hastags1, lastChapitre1);
        section1.setPadding(new Insets(20)); //Ajoute un espace de 20 autour de la section
        section1.setStyle("-fx-background-color: #F2EEEE; -fx-background-radius: 10px;");
        section1.setAlignment(Pos.CENTER_LEFT); //Aligne au centre à gauche
       
        
        
        //Section 2
        
        //Titre oeuvre
        Label titreFiction2 = new Label("Harry Potter and the Sorcerer’s Stone (Reimagined)");
        titreFiction2.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
        
        //Nom auteur
        Label auteur2 = new Label("By MagicalRewrites");
        auteur2.setPadding(new Insets(2)); //Ajoute de l'espace autour du nom de l'auteur
        auteur2.setFont(Font.font("Arial", FontWeight.BOLD, 10)); //Police Arial, en gras et de taille 12
        
        //Description
        Label description2 = new Label("A reimagined version of the first book in the series, "
        		+ "where small changes in Harry's first year\nlead to new outcomes.");
        
        //Status
        Label status2 = new Label("Status : Ongoing");
        status2.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12

        
        //Hastags
        Button button11 = new Button("#Adventure");
        Button button22 = new Button("#AlternateUniverse");
        Button button33 = new Button("#HarryPotter");
        Button button44 = new Button("#Magic");
        button11.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button22.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button33.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button44.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        
        //Dernier chapitre
        Label lastChapitre2 = new Label("Last Chapter : 20");
        lastChapitre2.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
        
        //Création d'un conteneur pour aligner les boutons tags à l'horizontal
        HBox hastags2 = new HBox(10); //10 est l'espacement entre les boutons
        //Ajout des boutons dans le menu déroulant
        hastags2.getChildren().addAll(
        		button11, 
        		button22,
        		button33,
        		button44);
        
        //Création d'un conteneur pour aligner tous les éléments de la section 2 à la verticale
        VBox section2 = new VBox(10, titreFiction2, auteur2, description2, status2, hastags2, lastChapitre2);
        section2.setPadding(new Insets(20)); //Ajoute un espace de 20 autour de la section
        section2.setStyle("-fx-background-color: #F2EEEE; -fx-background-radius: 10px;");
        section2.setAlignment(Pos.CENTER_LEFT); //Aligne au centre à gauche
        
        
        
        //Section 3
        
        //Titre oeuvre
        Label titreFiction3 = new Label("Ephemeral Harry Potter");
        titreFiction3.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
        
        //Nom auteur
        Label auteur3 = new Label("By LumosFading");
        auteur3.setPadding(new Insets(2)); //Ajoute de l'espace autour du nom de l'auteur
        auteur3.setFont(Font.font("Arial", FontWeight.BOLD, 10)); //Police Arial, en gras et de taille 10
        
        //Description
        Label description3 = new Label("This emotional exploration delves into Harry’s struggles with fame, loss, and identity,focusing\n"
        		+ "non overlooked moments in his life.");
        
        //Status
        Label status3 = new Label("Status : Ongoing");
        status3.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12

        //Hastags
        Button button111 = new Button("#HarryPotter");
        Button button222 = new Button("#Drama");
        Button button333 = new Button("#Emotional");
        Button button444 = new Button("#SelfDiscovery");
        button111.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button222.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button333.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        button444.setStyle("-fx-background-color: #828282; -fx-text-fill: white;");
        
        //Dernier chapitre
        Label lastChapitre3 = new Label("Last Chapter : 20");
        lastChapitre3.setFont(Font.font("Arial", FontWeight.BOLD, 12)); //Police Arial, en gras et de taille 12
        
        //Création d'un conteneur pour aligner les boutons tags à l'horizontal
        HBox hastags3 = new HBox(10); //10 est l'espacement entre les boutons
        //Ajout des boutons dans le menu déroulant
        hastags3.getChildren().addAll(
        		button111, 
        		button222, 
        		button333, 
        		button444);
        
        //Création d'un conteneur pour aligner tous les éléments de la section 3 à la verticale
        VBox section3 = new VBox(10, titreFiction3, auteur3, description3, status3, hastags3, lastChapitre3);
        section3.setPadding(new Insets(20)); // Ajoute un espace de 20 autour de la section
        section3.setStyle("-fx-background-color: #F2EEEE; -fx-background-radius: 10px;");
        section3.setAlignment(Pos.CENTER_LEFT); //Aligne au centre à gauche
		
        
		
        //Volet Filters
        
        //Titre
        Label filtersTitre = new Label("Filters");
        filtersTitre.setFont(Font.font("Arial", FontWeight.BOLD, 14)); //Police Arial, en gras et de taille 12
        filtersTitre.setPadding(new Insets(10)); // Ajoute un espace de 10 autour du titre
        
        //Menu déroulant pour les boutons checkbox
        MenuButton warnings = new MenuButton("Warnings");
		warnings.setPadding(new Insets(5)); //Crée de l'espace interieur pour agrandir le filtre


        // Création des checkboxs
        CheckBox checkBox1 = new CheckBox("No Archive Warnings Apply  Creator Chose");
        CheckBox checkBox2 = new CheckBox("Not To Use Archive Warnings");
        CheckBox checkBox3 = new CheckBox("Graphic Depictions Of Violence");
        CheckBox checkBox4 = new CheckBox("Major Character Death");
        CheckBox checkBox5 = new CheckBox("Underage");
        CheckBox checkBox6 = new CheckBox("Rape/Non-Con");
        
        //Ajout des boutons checkbox dans le menu déroulant
        warnings.getItems().addAll(
        	    new CustomMenuItem(checkBox1), 
        	    new CustomMenuItem(checkBox2), 
        	    new CustomMenuItem(checkBox3), 
        	    new CustomMenuItem(checkBox4), 
        	    new CustomMenuItem(checkBox5), 
        	    new CustomMenuItem(checkBox6)
        	);

        //Autres filtres 
        MenuButton ratings = new MenuButton("Ratings");
        ratings.setPadding(new Insets(5)); //Crée de l'espace interieur pour agrandir le filtre
        MenuButton relationships = new MenuButton("Relationships");
        relationships.setPadding(new Insets(5)); //Crée de l'espace interieur pour agrandir le filtre
        MenuButton addTags = new MenuButton("Add Tags");
        addTags.setPadding(new Insets(5)); //Crée de l'espace interieur pour agrandir le filtre
        MenuButton completionStatus = new MenuButton("Completion Status");
        completionStatus.setPadding(new Insets(5)); //Crée de l'espace interieur pour agrandir le filtre
        MenuButton crossovers = new MenuButton("Crossovers");
        crossovers.setPadding(new Insets(5)); //Crée de l'espace interieur pour agrandir le filtre
       
        
        //Volet filters
        
        //Conteneur VBox (vertical) pour le volet filters à droite de la page
		VBox filters = new VBox (40, filtersTitre, warnings, ratings, relationships, addTags, completionStatus, crossovers);
		filters.setStyle("-fx-background-color: #F2EEEE; -fx-background-radius: 10px;");
		filters.setPrefSize(600, 685); //L'affichage de la section est fixé à 600 par 685
        filters.setPadding(new Insets(20));// Crée de l'espace a gauche du volet de filters
     
       
		/**
		 * ----------------------- Assemblage Body -----------------------
		 * Création de : 
		 * - l'en-tête
		 * - volet à gauche
		 * - volet à droite
		 * - body (en-tête + (volet gauche et volet droite)
		 */
		
		//En-tête
		VBox entete = new VBox (booksAndLiterature, pagination, sortBy);
		
		//Volet à gauche
		VBox colonneGauche = new VBox(20, section1, section2,section3);
		colonneGauche.setPrefSize(1000, 0);
		
		//Volet à droite
		VBox colonneDroite = new VBox(20, filters);
		
		//Fusion colonne gauche et droite
		HBox groupement = new HBox(100, colonneGauche, colonneDroite);
        
        
        VBox body = new VBox(20,entete, groupement);
        body.setPadding(new Insets(20)); //Ajout d'un espace de 20 autour du body
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