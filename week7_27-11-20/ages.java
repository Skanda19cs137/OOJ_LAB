import java.util.*;
class WrongAge extends Exception {
 int detail;
 WrongAge(int a) {
  detail = a;
 }
 public String toString() {
  return "enter correct age "+detail+" is invalid";
 }

}
class father{
 public int age;
 Scanner in =new Scanner(System.in);
 father() throws WrongAge{
  System.out.print("Enter the father's age :");
  age= in.nextInt();
  if(age<0)
    throw new WrongAge(age);
 }
}
class son extends father{
 Scanner in =new Scanner(System.in);
 int fage;
 son(father f) throws WrongAge{
  this.fage=f.age;
  System.out.print("Enter the son's age :");
  this.age= in.nextInt();
  if(this.age<0)
    throw new WrongAge(age);
  if(this.age>f.age)
    throw new WrongAge(age);
 }
 
}
class ages{
 public static void main(String[] args){
  try{
   father f= new father();
   son s= new son(f);
  }
  catch(Exception e){
    System.out.println(e);
 }
 }
}