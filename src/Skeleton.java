public class Skeleton extends GameEntity {
    String name;
    int quantity;
    public Skeleton (String name, int quantity){
        this. name = name;
        this. quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }


}
