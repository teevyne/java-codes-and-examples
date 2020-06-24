//package EmployeeRecord;
//
////import java.util.ArrayList;
//import java.text.NumberFormat;
//import javafx.application.Platform;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.Background;
//import javafx.scene.layout.BackgroundFill;
//import javafx.scene.layout.Border;
//import javafx.scene.layout.BorderStroke;
//import javafx.scene.layout.BorderStrokeStyle;
//import javafx.scene.layout.BorderWidths;
//import javafx.scene.layout.CornerRadii;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.stage.Stage;
//import javafx.scene.control.TextInputDialog;
//import javafx.application.Application;
//import javafx.stage.Stage;
//import java.util.Scanner;
//
//public class Hostel extends Application
//{
//	public static Scanner sc = new Scanner(System.in);
//	
//	private int noOfRooms;
//	private TenantList list;
//	
//	private final int WIDTH = 800;
//	private final int HEIGHT = 500;
//	
//	// visual components declared as attributes of the class
//	private Label headingLabel = new Label("Hostel Application");
//	private Label roomLabel1 = new Label("Room");
//	private TextField roomField1 = new TextField();
//	private Label nameLabel = new Label("Name");
//	private TextField nameField = new TextField();
//	private Button addButton = new Button("Add Tenant");
//	private Button displayButton = new Button("Display Tenants");
//	private Button removeButton = new Button("Remove Tenant");
//	private Button saveAndQuitButton = new Button("Save and Quit");
//	private TextArea displayArea1 = new TextArea();
//	private Label roomLabel2 = new Label("Room");
//	private TextField roomField2 = new TextField();
//	private Label monthLabel = new Label("Month");
//	private TextField monthField = new TextField();
//	private Label amountLabel = new Label("Amount");
//	private TextField amountField = new TextField();
//	private Button paymentButton = new Button("Make Payment");
//	private Button listButton = new Button("List Payments");
//	private TextArea displayArea2 = new TextArea();
//	
//	// methods
//	@Override
//	public void start(Stage stage)
//	{
//		
//		noOfRooms = getNumberOfRooms(); // call private method
//		// initialise tenant list
//		list = new TenantList(noOfRooms);
//		TenantFileHandler.readRecords(list);
//		
//		// code to layout components, process event handling routines and initialise the list here
//		// create four HBoxes
//		HBox roomDetails = new HBox (10);
//		HBox tenantButtons = new HBox(10);
//		HBox paymentDetails = new HBox(10);
//		HBox paymentButtons = new HBox(10);
//		// add components to HBoxes
//		roomDetails.getChildren().addAll(roomLabel1, roomField1, nameLabel, nameField);
//		tenantButtons.getChildren().addAll(addButton, displayButton, removeButton, saveAndQuitButton);
//		paymentDetails.getChildren().addAll( roomLabel2, roomField2, monthLabel, monthField,
//		amountLabel, amountField);
//		paymentButtons.getChildren().addAll(paymentButton, listButton);
//		// create VBox
//		VBox root = new VBox(10);
//		// add components to VBox
//		root.getChildren().addAll( headingLabel, roomDetails, tenantButtons, displayArea1,
//		paymentDetails, paymentButtons, displayArea2);
//		// add the VBox to the Scene
//		Scene scene = new Scene(root, Color.LIGHTBLUE);
//		
//		// call private methods for button event handlers
//		addButton.setOnAction(e -> addHandler());
//		displayButton.setOnAction(e -> displayHandler() );
//		removeButton.setOnAction( e -> removeHandler());
//		paymentButton.setOnAction( e -> paymentHandler());
//		listButton.setOnAction( e -> listHandler());
//		saveAndQuitButton.setOnAction( e -> saveAndQuitHandler());
//	}
//	
//	private int getNumberOfRooms()
//	{
//		System.out.print("How many rooms?: ");
//		int num = sc.nextInt();
//		return num;
//	}
//	public static void main(String[] args)
//	{
//		launch(args);
//	}
//}
//
