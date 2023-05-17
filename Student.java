public class Student {

  private String Name;
  private int Age;
  private String LastName;
  private String BirthDate;
  
  

  public Student(String name, String lastname, int age, String birthdate) {
    Name = name;
    Age = age;
    LastName = lastname;
    BirthDate= birthdate;
  }

  public String GetName() {return Name;}
   public String GetLastName() {return LastName;}
  public int GetAge() {return Age;}
  public String GetBirthDate() {return BirthDate;}

  public String ToString() {
    return Name + " " + LastName + " " + Integer.toString(Age) + " " + BirthDate;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", "Parse Error", -1 , "Parse Error" );
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}