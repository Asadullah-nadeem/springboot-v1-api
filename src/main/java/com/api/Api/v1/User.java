package com.api.Api.v1;

public class User {
  private int id;
  private String Name;
  private String Message;

  // Constructor
  public User(int id, String Name, String Message){
    this.id =  id;
    this.Name = Name;
    this.Message = Message;
  }


  // Getter
  public int getID(){
    return id;
  }
  public String getName(){
    return Name;
  }
  public String getMessage(){
    return Message;
  }

}
