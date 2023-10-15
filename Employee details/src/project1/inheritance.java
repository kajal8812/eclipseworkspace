abstract class vehicle{
public abstract void engine();
public void break(){
System.out.println("break");
}
}

class bus extends vehicle{
public void engine(){
System.out.println("engine differs for each vehicle");
}
}

class Main{
public static void main(String[] args){
bus b=new bus(); 
b.engine();
b.break();
}