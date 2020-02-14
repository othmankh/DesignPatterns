import java.util.List;

public class TreeFactory {

    private static List<TreeType> treeTypes;

    public static TreeType getTreeType(String name, String color, String texture) {

        TreeType existingTreeType = getExistingTree(name, color, texture);

        if (existingTreeType != null) {
            return existingTreeType;
        }

        TreeType newTreeType = new TreeType(name, color, texture);
        treeTypes.add(newTreeType);

        return newTreeType;
    }

    private static TreeType getExistingTree(String name, String color, String texture) {
        return treeTypes.stream().filter(treeType ->
                        treeType.getColor().equals(color)
                                && treeType.getName().equals(name)
                                && treeType.getTexture().equals(texture)
            ).findFirst().orElse(null);
    }
}
