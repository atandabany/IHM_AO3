package application;

import javafx.application.Application;
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
		 * ----------------------- Bannnière -----------------------
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
		 * ----------------------- Footer -----------------------
		 * Contient : 
		 * - 
		 * - 
		 * - 
		 */
				
		// ----------------------- [Amélia code ici] -----------------------

		
		
		
		
		
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
		VBox body = new VBox(sloganAll, groupeFandomsTags); //Dans l'odre, la slogan est au dessus de Fandoms / Tags
		root.setCenter(body); //Place le body au centre de la fenêtre
		
		
		
		/**
		 * ----------------------- Assemblage Footer -----------------------
		 * Création de : 
		 * - 
		 * - 
		 * - 
		 * - 
		 */
		
		// ----------------------- [Amélia code ici] -----------------------
		
		
		
		
		
		
		
		// Créer une scène
		Scene scene = new Scene(root, 1200, 640); //Taille de la fenêtre
		root.setStyle("-fx-background-color: white;"); //Couleur de fond en blanc
		primaryStage.setTitle("Archive of Our Own"); //Titre de la fenêtre
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}