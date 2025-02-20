import java.io.IOException;
import java.io.InputStreamReader;.java.io.*;
import java.io.BufferedReader;
public class Main{

    public static void main(String[] args){
      String name;
      int year;
      double height;
      double weight;
      InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

   try{

   System.out.println("What is your name; ");
   name = bufferedReader.readLine();

   System.out.println("What is your birth year?");
   year = Integer.parseInt(bufferedReader.readLine());

  System.out.println("Enter your height in meters:")
  height = Double.parseDouble(bufferedReader.readLine());

  System.out.println("Enter your weight in kilograms: ");
  weight = Double.parseDouble(bufferedReader.readLine());

  System.out.println("Your name is: " + name);
  System.out.println("You will turn " + (2024 - year) + "years this year");
  System.out.println("Your body mass index is:" + weight / (height));

 }catch (IOException e){
   System.out.println(e.getMessage());
}catch (NumberFormatException e) {
   System.out.println("Number format exception  |");


}
}
}
