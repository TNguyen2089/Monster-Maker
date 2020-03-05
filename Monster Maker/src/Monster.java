import java.util.HashMap;

public abstract class Monster extends Driver{

    private Integer hp;
    private Integer maxHP;
    private Integer xp = 10;
    private HashMap<String, Integer> items;


    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    public Integer getMaxHP() {
        return maxHP;
    }

    public Monster(Integer maxHP, Integer xp, HashMap<String, Integer> items) {

        this.maxHP = maxHP;
        hp = this.maxHP;
        this.xp = xp;
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (hp != null ? !hp.equals(monster.hp) : monster.hp != null) return false;
        if (maxHP != null ? !maxHP.equals(monster.maxHP) : monster.maxHP != null) return false;
        if (xp != null ? !xp.equals(monster.xp) : monster.xp != null) return false;
        return items != null ? items.equals(monster.items) : monster.items == null;
    }

    @Override
    public int hashCode() {
        int result = hp != null ? hp.hashCode() : 0;
        result = 31 * result + (maxHP != null ? maxHP.hashCode() : 0);
        result = 31 * result + (xp != null ? xp.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        return result;
    }

    public String toString(){
        return "hp="+getHp()+ "/"+ getMaxHP();
    }

}



