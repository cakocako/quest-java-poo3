public interface Fly{

    void land();

    int descend(int meters);

    int ascend(int meters);

    void takeOff();
  
default void glide(){
    System.out.println("It glides into the air ");
  } 
    
}