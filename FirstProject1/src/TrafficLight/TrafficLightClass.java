package TrafficLight;

public class TrafficLightClass {

    public static void main(String[] args) {

        TrafficLightEnum traffic = TrafficLightEnum.YELLOW;

        switch (traffic) {
            case RED:
                System.out.println("Остановитесь");
                break;
            case YELLOW:
                System.out.println("Приготовьтесь");
                break;
            case GREEN:
                System.out.println("Можно ехать.");
                break;
            default:
                break;
        }
    }
}
