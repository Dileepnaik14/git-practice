public interface Vehical {
void start();
}

class car{
    public void start(){
        System.out.println("Car has been started")
    }
}

class Ride{
    public static void main(String [] args){
        Vehical v=new Vehical();
        v.start();
    }
}

