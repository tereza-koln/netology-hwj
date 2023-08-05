public class HW_PRIM
{

    public static void main(String[] args) {

        int price;
        int bonusesPer = 20;
        price = (int) (Math.random() * (50000 - 20)) + 20;
        int bonuses = price / bonusesPer;
        System.out.println(bonuses);
    }
}