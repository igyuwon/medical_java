package stuPjt;

import java.util.ArrayList;

public class StuMain {
    public static void main(String[] args) {
        // 변수선언 부분
        ArrayList list = new ArrayList();
        list.add(new Students("홍길동",100,100,99));
        list.add(new Students("유관순",89,87,99));
        list.add(new Students("이순신",90,90,92));
        list.add(new Students("김구",100,99,99));
        list.add(new Students("김유신",50,50,71));
        list.add(new Students("홍길자",90,99,98));
        list.add(new Students("홍길순",80,85,99));
        StuProcess sp = new StuProcess();

        while(true) {
            int choice = sp.screen(list);

            switch (choice){
                case 1:
                    sp.stu_input(list);
                    break;
                case 2:
                    sp.stu_print(list);
                    break;
                case 3:
                    sp.stu_update(list);
                    break;
                case 4:
                    sp.stu_delete(list);
                    break;
                case 5:
                    sp.stu_search(list);
                    break;
                case 6:
                    sp.stu_rank(list);
                    break;
            }
        }
    }
}
