package creational.prototype;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        double mass, height;
        Position position, otherPosition;

        mass = 5.9;
        height = 10.22;
        position = new Position(5, 9);
        otherPosition = new Position(9, 5);

        PlasticTree plasticTree = new PlasticTree(mass, height);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        System.out.printf("%b\n", position.equals(plasticTree.getPosition()));
        System.out.printf("%b\n", otherPosition.equals(anotherPlasticTree.getPosition()));

        // create instance of PineTree
        PineTree pineTree = new PineTree(mass, height);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(Collectors.toList());

        Tree plasticTreeClone = treeClones.get(0);

        System.out.printf("%b\n", mass == plasticTreeClone.getMass());
        System.out.printf("%b\n", height == plasticTreeClone.getHeight());
        System.out.printf("%b\n", position.equals(plasticTreeClone.getPosition()));
    }
}
