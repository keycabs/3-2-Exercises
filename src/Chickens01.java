public class Chickens01 {
    public static void main(String[] args) {
        int chickenCount = 8;
        int eggsPerChicken = 4;
        int totalEggs = 0;

        int mondayEggs = chickenCount * eggsPerChicken;
        totalEggs += mondayEggs;

        chickenCount += 1;
        int tuesdayEggs = chickenCount * eggsPerChicken;
        totalEggs += tuesdayEggs;
        
        chickenCount /= 2;
        int wednesdayEggs = chickenCount * eggsPerChicken;
        totalEggs += wednesdayEggs;

        System.out.println(totalEggs);
    }   
}
