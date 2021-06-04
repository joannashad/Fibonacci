/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FxMain extends Application {
    ArrayList<Integer> iterativeArray = new ArrayList<Integer>();
    ArrayList<Long> iterativeTimeArray = new ArrayList<Long>();
    ArrayList<Integer> recursiveArray = new ArrayList<Integer>();
    ArrayList<Long> recursiveTimeArray = new ArrayList<Long>();
    
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
        btn1.setText("Iterative");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                int fibI =getIterative(Integer.valueOf(txt.getText()));

                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Fibonacci Iterative");
                alert.setHeaderText("Fibonacci series");
                alert.setContentText("The " + txt.getText() + "th value in the " 
                        + "Fibonacci series is " + fibI );
                alert.showAndWait();
            }
        });
        
        grid.add(btn1, 2, 1);
        Button btn2 = new Button();
        btn2.setText("Recursive");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
        
            @Override
            public void handle(ActionEvent event) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Fibonacci Recursive");
                alert.setHeaderText("Fibonacci series");
                alert.setContentText("The " + txt.getText() + "th value in the " 
                        + "Fibonacci series is " + getRecursive(Integer.valueOf(txt.getText())) );
                alert.showAndWait();
                
                ;
            }
        });
        
        grid.add(btn2, 3, 1);
  
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    private int getIterative(int n){
        Fibonacci fib = new Fibonacci();
        fib.startTime =  System.nanoTime();
        int fibI = fib.FibIterative(n);
        iterativeArray.add(n);
        iterativeTimeArray.add(fib.processTime);
        return fibI;
        
    }
    private int getRecursive(int n){
        Fibonacci fib = new Fibonacci();
        fib.startTime =  System.nanoTime();
        int fibR = fib.FibRecursive(n);
        recursiveArray.add(n);
        recursiveTimeArray.add(fib.processTime);        
        return fibR;
    }
 private LineChart GetChart(){
        //stage.setTitle("Fibonacci Iterative vs Recursive methods");
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
}
