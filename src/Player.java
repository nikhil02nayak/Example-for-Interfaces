import java.util.ArrayList;
import java.util.List;

public class Player implements Isaveable {
    private String name;
    private int hitpoints ;
    private int strength ;
    private String weapon ;

    public Player(String name, int hitpoints, int strength) {
        this.name = name;
        this.hitpoints = hitpoints;
        this.strength = strength;
        this.weapon = "Sword" ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>() ;
        values.add(0,this.name) ;
        values.add(1, "" + hitpoints) ;
        values.add(2,"" + strength) ;
        values.add(3,weapon) ;

        return values;
    }

    @Override
    public void read(List<String> savedvalues) {
        if (savedvalues != null && savedvalues.size() > 0)
        {
            this.name = savedvalues.get(0) ;
            hitpoints = Integer.parseInt(savedvalues.get(1)) ;
            strength = Integer.parseInt(savedvalues.get(2));
            weapon = savedvalues.get(3) ;

        }
    }
}
