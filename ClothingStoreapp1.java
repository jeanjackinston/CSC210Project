import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;

public class ClothingStoreapp1 extends Application { 
   //FIELD
    private ClothingStore clothingStore = new ClothingStore();
    private TextField usernameField;
    private PasswordField passwordField;
    private Label displayItem;//LABEL FOR ITEMS 
    private Label displayPrice;//LABEL FOR PRICE
    private ComboBox<Integer> itemNumberComboBox;//COMBO BOX FOR ITEMS NUMBER
    private TextField quantityField; 
    private Label costLabel;
    private Label taxLabel;
    private Label totalCostLabel;

    public static void main(String[] args) {
    //LAUNCH THE APPLICATION
        launch(args);
    }
   
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JC Clothing Store");

        // LOGIN SCENE
            
        
        
        
        //Create Label to display prompt for the Login System
        Label ClothingSt = new Label("JC ClothingStore");
        Label loginSystem = new Label("Login System");
        ClothingSt.setStyle("-fx-background-color: white ; -fx-text-fill: blue;");// 
        ClothingSt.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        ClothingSt.setTextFill(Color.BLUE);


        Label usernameLabel = new Label("Username:");
        usernameField = new TextField();
        
        Label passwordLabel = new Label("Password:");
        

       passwordField = new PasswordField();
       
       usernameField.setStyle("-fx-border-color: lightblue; -fx-border-width: 1px; -fx-border-radius: 5px;");

        
       passwordField.setStyle("-fx-border-color: lightblue; -fx-border-width: 1px; -fx-border-radius: 5px;");

        Button loginButton = new Button("Login");//CREATE A BUTTON TO LOGIN
        
      
       // Set a gridpane for the login System 
        GridPane loginGrid = new GridPane();
        loginGrid.setAlignment(Pos.CENTER);
        loginGrid.setHgap(10);
        loginGrid.setVgap(10);
        loginGrid.setPadding(new Insets(25, 25, 25, 25));

         //Put the Label and the button of the login System in the Gridpane
        loginButton.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size: 14px;");
        loginGrid.add(loginSystem, 1, 1);
        loginGrid.add(ClothingSt, 0, 0);
        loginGrid.add(loginButton, 1, 4);
        loginGrid.add(passwordLabel, 0, 3);
        loginGrid.add(usernameField, 1, 2);
        loginGrid.add(usernameLabel, 0, 2);
        loginGrid.add(passwordField, 1, 3);



        //CREATION OF THE SCENE OBJECT FOR THE LOGIN SYSTEM 
        Scene loginScene = new Scene(loginGrid, 400, 300);
        loginScene.setFill(Color.LIGHTBLUE);
        // END OF THE LOGIN SCENE


        // CREATE JC CLOTHING STORE SCENE
                
        //CREATE AND PROMPT LABELS
        Label ClothingStoreName = new Label("JC Clothing Store");
               
        Label Items = new Label("Item #");
        Label Clothes = new Label("Clothes");
        Label Cost = new Label("Price");
        Label label1 = new Label("1");
        Label label2 = new Label("2");
        Label label3 = new Label("3");
        Label label4 = new Label("4");
        Label item1 = new Label("Shirt");
        Label item2 = new Label("Pants");
        Label item3 = new Label("Dress");
        Label item4 = new Label("Jacket");
        Label cost1 = new Label("20");
        Label cost2 = new Label("30");
        Label cost3 = new Label("125");
        Label cost4 = new Label("40");
       
        Label priceLabel = new Label("Price:");
        Label itemNumberLabel = new Label("Item Number:");
        Label quantityLabel = new Label("Quantity:");
        costLabel = new Label();
        taxLabel = new Label();
        totalCostLabel = new Label();
        Label taxSpecification = new Label("(tax per Item)");
        totalCostLabel = new Label();
        Label itemToDisplay = new Label("Item:");
        Label priceToDisplay = new Label("Price:");
        Label displayItem = new Label();
        Label displayPrice = new Label();
        
        //Create a TextField for input the quantity of Items
        quantityField = new TextField();
        Button calculateButton = new Button("Calculate");// Create a button to Calculate 


         

        
         // Set a gridpane for the Clothing store
        GridPane storeGrid = new GridPane();
        storeGrid.setAlignment(Pos.CENTER);
        storeGrid.setHgap(10);
        storeGrid.setVgap(10);
        storeGrid.setPadding(new Insets(25, 25, 25, 25));

        
        storeGrid.add(ClothingStoreName, 0, 0);

        storeGrid.add(Clothes, 1, 1);
        storeGrid.add(Items, 0, 1);
        storeGrid.add(label1, 0, 2);
        storeGrid.add(label2, 0, 3);
        storeGrid.add(label3, 0, 4);
        storeGrid.add(label4, 0, 5);
        storeGrid.add(item1, 1, 2);
        storeGrid.add(item2, 1, 3);
        storeGrid.add(item3, 1, 4);
        storeGrid.add(item4, 1, 5);
        storeGrid.add(Cost, 2, 1);
        storeGrid.add(cost1, 2, 2);
        storeGrid.add(cost2, 2, 3);
        storeGrid.add(cost3, 2, 4);
        storeGrid.add(cost4, 2, 5);
        storeGrid.add(itemToDisplay, 0, 8);// update
        storeGrid.add(priceToDisplay, 2, 8);//update
        storeGrid.add(displayItem, 1, 8);//updayr
        storeGrid.add(displayPrice, 3, 8);//update
       

        
        storeGrid.add(quantityLabel, 0, 9);
        storeGrid.add(quantityField, 1, 9);
        storeGrid.add(costLabel, 0, 11);
        storeGrid.add(taxLabel, 0, 12);
        storeGrid.add(totalCostLabel, 0, 13);
        storeGrid.add(calculateButton, 1, 10);
        storeGrid.add(taxSpecification, 1, 12);

        


                
        // Create a combo box for the Item Number
        
        itemNumberComboBox = new ComboBox<>();
        itemNumberComboBox.getItems().addAll(1, 2, 3, 4);
        storeGrid.add(itemNumberLabel, 0, 7); 
        storeGrid.add(itemNumberComboBox, 1, 7);


       // SET FONT AND COLOR FOR THE CLOTHING STORE 
            
        ClothingStoreName.setStyle("-fx-background-color: blue; -fx-text-fill: white; -fx-font-size: 16px;");
        ClothingStoreName.setTextFill(Color.BLUE);// SET THE COLOR OF THE CLOTHING sTORE LABEL

                
        
        
        calculateButton.setStyle("-fx-background-color: skyblue; -fx-text-fill: white; -fx-font-size: 14px;");

        costLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        taxLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        taxSpecification.setTextFill(Color.RED);
        itemToDisplay.setStyle("-fx-font-weight: bold;");
        priceToDisplay.setStyle("-fx-font-weight: bold;");
        displayItem.setStyle("-fx-font-weight: bold;");
        displayPrice.setStyle("-fx-font-weight: bold;");
       
        
        
        
                
        
        
        totalCostLabel.setFont(Font.font("Arial", FontWeight.BOLD, 12));

        Scene storeScene = new Scene(storeGrid, 600, 400);
      
       
 

        // Set login button action
        loginButton.setOnAction(e -> {
            if (LoginSystem()) {
                primaryStage.setScene(storeScene);// TO PUT THE STORE SCENE RIGHT AFTER TO LOGIN IS VALIDATED
            } else {
                System.out.println("Invalid login" + "Please enter valid username and password.");
            }
        });
        
         itemNumberComboBox.setOnAction(e -> {
            Integer itemNumber = itemNumberComboBox.getValue(); // REGISTER AND ACTIVATE THE COMBO BOX 
            if (itemNumber != null) {
               String itemName = clothingStore.getItemNames()[itemNumber - 1];// Retrieve item name using the selected item number
               displayItem.setText(itemName);
       


             
               double price = clothingStore.getPrice(itemName);
               displayPrice.setText(String.format("$%.2f", price));
              
            }
         });       

        // Set calculate button action
        calculateButton.setOnAction(e -> calculateCost());

        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    private boolean LoginSystem() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        return username.equals(clothingStore.getUsername()) && password.equals(clothingStore.getPassword());
    }
    private void showItemName() {
        
      Integer itemNumber = itemNumberComboBox.getValue(); 
      if (itemNumber != null && itemNumber >= 1 && itemNumber <= clothingStore.getItemNames().length) {
        String itemName = clothingStore.getItemNames()[itemNumber - 1];
        displayItem.setText(itemName);   
                
       } 
    }
    
    private void calculateCost() {// Method used for the button
      int itemNumber = itemNumberComboBox.getValue();
      String quantityText = quantityField.getText();
         
                     
      if (itemNumber > 0) {
        String itemName = clothingStore.getItemNames()[itemNumber - 1];// To get the Items by their index
        double price = clothingStore.getPrice(itemName);

 


        try {
            
            int quantity = Integer.parseInt(quantityText);
            if (quantity > 0) {
            
             
             double cost = clothingStore.calculateCost(quantity, itemName);
             double tax = clothingStore.calculateTax(price);
             double totalCost = clothingStore.calculateTotalCost(quantity, itemName);
             

             costLabel.setText("Cost: $" + String.format("%.2f", cost));
             taxLabel.setText("Tax: $" + String.format("%.2f", tax));
             totalCostLabel.setText("Total Cost: $" + String.format("%.2f", totalCost));
            } else {
                System.out.println("Invalid Quantity"+ "Please enter a valid quantity (greater than 0).");
            }
        } 
        catch (NumberFormatException e) {
            System.out.println("Invalid Quantity"+ "Please enter a valid quantity.");
        }
     }
            
   } 

}

        