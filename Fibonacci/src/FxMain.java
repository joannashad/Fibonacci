/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.stage.Stage;


public class FxMain extends Application {

    @Override
    public void start(Stage primaryStage) {
        int N = 15;
        int fibI;
        fibI = getRecursive(N);
        System.out.println("The " + N + " number of the Fibonacci series is " + fibI);


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private int getRecursive(int n){
        Fibonacci fib = new Fibonacci();
        int fibR = fib.FibRecursive(n);       
        return fibR;
    }
 
 /*
  @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

    
        StackPane root = new StackPane();
        Label lbl = new Label("N");
        grid.add(lbl, 1, 0); 
        TextField txt = new TextField();
        grid.add(txt, 2, 0,2,1);
        
        Button btn1 = new Button();
        btn1.setText("Iterative and Recursive");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int fibI;
                int N = 0;
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Error");
                alert.setHeaderText("Improper input");
                
                if(txt.getText().length() == 0){
                    alert.setContentText("N must be a number!") ;
                    alert.showAndWait();}
                try{
                    N = Integer.valueOf(txt.getText());
                    
                if(N<0){
                    alert.setContentText("N must be a positive number!") ;
                    alert.showAndWait();
                }
                else{
                    fibI = getIterative(Integer.valueOf(N));
                    
                    //iterative
                    alert.setTitle("Fibonacci Iterative");
                    alert.setHeaderText("Fibonacci Iterative");
                    alert.setContentText("The " + N + "th value in the " 
                            + "Fibonacci series is " + fibI );
                    alert.showAndWait();
                    //recursive
                    alert.setTitle("Fibonacci Recursive");
                    alert.setHeaderText("Fibonacci Recursive");
                    alert.setContentText("The " + N + "th value in the " 
                            + "Fibonacci series is " + getRecursive(N));
                    alert.showAndWait();
                }
                    
                }
                catch(Exception e){
                    alert.setContentText("N must be an integer!") ;
                    alert.showAndWait();  
                }
                
                    
                    
                    
                
                
            }
        });
        
        grid.add(btn1, 2, 1);
        
        Button btnChart = new Button();
        btnChart.setText("View Chart");
        btnChart.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Scene scene  = new Scene(GetChart(),800,600);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
        
        grid.add(btnChart, 2, 2,2,1);
  
        Scene scene = new Scene(grid, 280, 300);
        
        primaryStage.setTitle("Fibonacci Series");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private LineChart GetChart(){
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("N");
        yAxis.setLabel("Time");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Fibonacci Series Iterative vs Recursive methods");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("Iterative");
        //populating the series with data
        for(int i=0; i<iterativeArray.size(); i++){
            series.getData().add(new XYChart.Data(iterativeArray.get(i),iterativeTimeArray.get(i)));
        }
        
         //defining a series
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Recursive");
        //populating the series with data
        for(int i=0; i<iterativeArray.size(); i++){
            series2.getData().add(new XYChart.Data( recursiveArray.get(i),recursiveTimeArray.get(i)));
        }

        lineChart.getData().addAll(series, series2);
        return lineChart;
        
        }
       private int getIterative(int n){
        Fibonacci fib = new Fibonacci();
        fib.startTime =  System.nanoTime();
        int fibI = fib.FibIterative(n);
        iterativeArray.add(n);
        iterativeTimeArray.add(fib.processTime);
        return fibI;
        
    } 
*/
}
