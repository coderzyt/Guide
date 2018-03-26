package com.clay;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite
 */
public class Composite extends Component {

    private List children = new ArrayList<Component>();

    public Composite(String name) {
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

    }

    public static void main(String[] args) {
        
    }
    
}