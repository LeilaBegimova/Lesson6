public class Boss extends GameEntity {


    private Weapon weapon;



    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public  Boss (int health, int domage, Weapon weapon ){
        setHealth( health);
        setDomage(domage);
        this.weapon= weapon;


    }


}
