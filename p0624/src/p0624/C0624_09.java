package p0624;

public class C0624_09 {
    public static void main(String[] args) {

        // Car 객체 선언 후 white, auto, 4
        // Car 객체 선언 후 red, auto, 5
        // Car 객체 선언 후 blue, auto, 3
//        Car c1 = new Car();
//        c1.color = "white";
//        c1.gearType = "auto";
//        c1.door = 4;
//        Car c2 = new Car();
//        c2.color = "red";
//        c2.gearType = "auto";
//        c2.door = 5;
//        Car c3 = new Car();
//        c3.color = "blue";
//        c3.gearType = "auto";
//        c3.door = 3;
        Car c1 = new Car("white", "auto", 4);
        Car c2 = new Car("red", "auto", 5);
        Car c3 = new Car("blue", "auto", 3);

        System.out.println("Car1 : "+c1.color);
        System.out.println("Car2 : "+c2.gearType);
        System.out.println("Car3 : "+c3.door);

//        Data d = new Data(); // 에러없음
//        Data2 d2 = new Data2(); // 에러
//        Data2 d3 = new Data2(10); // 에러없음

    }
}
