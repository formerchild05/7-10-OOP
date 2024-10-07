
import java.util.List;
import java.util.ArrayList;
public class TrangTrai {
    private List<Animal> animals = new ArrayList<Animal>();

    public int get_size() {
        return animals.size();
    }
    public void add_animal(Animal a) {
        animals.add(a);
    }
    public void get_walk() {
        for(Animal a : animals) {
            if(a.getWalk())
                System.out.print(a.getType() + " ");
        }
    }
    public void get_swim() {
        for(Animal a : animals) {
            if(a.getSwim())
                System.out.print(a.getType() + " ");
        }
    }
    public static void main(String[] args) {
        TrangTrai t = new TrangTrai();
        pig a = new pig();
        t.add_animal(a);
        t.get_walk();
    }
}
