package CarType;
public class Test2 {

    public static void main(String[] args) {

        Test1 car = Test1.CAR;
        switch (car) {
        case TRAIN:
            System.out.println("You chose type Train");
            break;
        case CAR:
            System.out.println("You chose type Car");
            break;
        case PLANE:
            System.out.println("You chose type Plane");
            break;
        case BUS:
            System.out.println("You chose type Bus");
            break;
        default:
            break;
        }
    }
}
