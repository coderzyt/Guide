package main.java.com.clay;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class Composite extends Component {

    private List children = new ArrayList<>();

    public Composite(Stirng name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        children.add(c);
        System.out.println("");
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
        System.out.println("");
    }

    @Override
    public void Display(int depth) {
        System.out.println("");
        children.forEach(component -> {
            component.Display(depth + 2);
        });
    }

    public static void main(String[] args) {
        Component root = new Component("root");
        root.Add(new Leaf("Leaf A"));
        root.Add(new Leaf("Leaf B"));
        Composite comp = new Composite("Composite X");
        comp.Add(new Leaf("Leaf XA"));
        comp.Add(new Leaf("Leaf XB"));
        root.Add(comp);
        Composite comp2 = new Composite("Composite XY");
        comp2.Add(new Leaf("Leaf XYA"));
        comp2.Add(new Leaf("Leaf XYB"));
        comp.Add(comp2);
        root.Add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("Leaf D");
        root.Add(leaf);
        root.Remove(leaf);
        root.Display(1);
    }
    
}