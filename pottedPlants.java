public class pottedPlants extends PlantItem{
  // instance variables
  
  private boolean isIndoor;
  
  // constrcutor methods
  
  //no argument construcot
  
  public pottedPlants(){
    this.isIndoor=false;
}

 // parameterize construcotr
  public pottedPlants(String size, double price, boolean isIndoor){
    super(size, price);
    this.isIndoor=isIndoor;
}

  // accessor and mutator method
  public boolean getIsIndoor(){
    return isIndoor;
}
  public void setIsIndoor(boolean isIndoor){
    this.isIndoor = isIndoor;
}
 
  // toString method override
  public String toString(){
    return super.toString() + " and is an indoor plant? " + isIndoor;
  }
}
