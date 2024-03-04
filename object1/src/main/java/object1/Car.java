package object1;

 class Car {
     //make, model, year, mileage
  private String make;
  private String model;
  private int year;
  private int mileage;


  public Car(String make, String model, int year, int mileage){
   this.make = make;
   this.model = "honda";
   this.year = year;
   this.mileage = mileage;
  }

  public String getMake(){
   return make;
  }

  public void setMake(String make){
   this.make = make;
  }

  public String getModel(){
   return model;
  }

  public int getYear(){
   return year;
  }

  public void setYear(int year){
   this.year = year;
  }

  public int getMileage(){
   return mileage;
  }

  public void setMileage(int mileage){
   this.mileage = mileage;
  }

}
