class Student{
int rollno; //instance variable
String name;
static String collage="ITS"; //static variable
 
//Constructure
Student(int r, String n){
rollno=r;
name=n;
}

//Method to display the value
void display(){
System.out.println(rollno +"" + name + "" + collage);
}

}

//Test class to show the value of object
class TestVariable
{
public static void main(String args[])
{
Student s1 =new Student(111,"Karan");
Student s2 =new Student(222,"Aryan");
s1.display();
s2.display();
}
}