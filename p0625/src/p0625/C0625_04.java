package p0625;
import introduce.ComInfo;
import introduce.Info;

// 접근제어자
// private 같은 클래스 내
public class C0625_04 {
    public static void main(String[] args) {
        Info i = new Info();

        ComInfo c = new ComInfo(); // default 같은 패키지 내에서까지 접근가능
    }
}
