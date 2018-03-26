package com.clay;

/**
 * Leaf
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("");
    }

    @Override
    public void Display(int depth) {
        System.out.println("");
    }
}