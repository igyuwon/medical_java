package p0624;

public class Car {
    static int  count;
    String serial_no;
    String color;
    String gearType;
    int door;
    // 초기화 블록 - 생성자를 호출하기전에
    // 먼저 실행을 시켜줌.
    {
        count += 1;
        this.serial_no = "HD"+String.format("%04d",count);
    }

    Car(){
//        this("white","auto",4); // 코드의 재사용성을 높인 코드
//        color = "white";
//        gearType = "auto";
//        door = 4;
    } // 기본생성자

//    Car(String c, String g, int d){
//        color = c;
//        gearType = g;
//        door = d;
//    }
    Car(String color){
        this.color = color;
    }

    Car(String color, String gearType, int door){
        this.color = color; // this 를 붙여줘야 위에 인스턴스 변수를 가리킴
        this.gearType = gearType;
        this.door = door;
    }
}
