package _01_Abstractions_Exercise._5_Greedy_Times;

public enum ItemType {

    GOLD,
    GEM,
    CASH;


    public static ItemType getItem(String name){

        ItemType itemType = null;
        if (name.length() == 3){
            itemType = ItemType.CASH;
        } else if (name.toLowerCase().endsWith("gem")) {
            itemType = ItemType.GEM;
        } else if (name.equalsIgnoreCase("gold")) {
            itemType = ItemType.GOLD;
        }
        return itemType;

    }

}
