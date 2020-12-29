package assignment14;

 class Q4Person {
  private String firstName, lastName;
  private int age;
  Q4Person(){
   firstName = "undefined";
   lastName = "undefined";
   age = -1;
  }
  Q4Person(String firstName, String lastName, int age){
   this.firstName = firstName;
   this.lastName = lastName;
   this.age = age;

  }
  public void setFirstName(String firstName)
  {
   this.firstName = firstName;
  }
  public void setLastName(String lastName){
   this.lastName = lastName;
  }
  public void setAge(int age){
   this.age = age;
  }
  public String getFirstName(){
   return firstName;
  }
  public String getLastName(){
   return lastName;
  }
  public int getAge(){
   return age;
  }
  public String toString() {
   return firstName +" | "+ lastName +" | "
           + age ;
  }
 }
