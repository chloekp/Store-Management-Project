public class makeBouquets extends PlantItem{
  // instance variables
  
  private String color;
  
  // constrcutor methods
  
  //no argument construcot
  
  public makeBouquets(){
    this.color= " ";
}

 // parameterize construcotr
  public makeBouquets(String size, double price, String color){
    super(size, price);
    this.color=color;
}

  // accessor and mutator method
  public String getcolor(){
    return color;
}
  public void setcolor(String color){
    this.color = color;
}
 
  // toString method override
  public String toString(){
    return super.toString() + " and is " + color;
  }
}
