

public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU IOU = new IOU();
        IOU.setSum("Mom", 100000000.00);
        IOU.setSum("kids in my neighborhood", 10000.00);
        System.out.println(IOU.howMuchDoIOweTo("Mom"));
        System.out.println("-----------");
        System.out.println(IOU.howMuchDoIOweTo("Cristiono"));
    }
}
