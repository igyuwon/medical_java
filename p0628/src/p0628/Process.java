package p0628;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Process{
    HashMap<String, Object> read_con(){
        ArrayList list = new ArrayList(); // for문으로 불러오기 가능
        list.add(new Students("홍길동",100,100,99));
        list.add(new Students("유관순",100,100,99));
        ArrayList list2 = new ArrayList();
        list2.add(new Card(1,"SPADE"));
        list2.add(new Card(2,"SPADE"));

        HashSet set = new HashSet(); // Iterator 이터레이터 필요
        set.add(new Person("이순신",20));
        set.add(new Person("강감찬",30));
        set.add(new Person("김구",40));


        HashMap<String,Object> map = new HashMap();
        map.put("list", list);
        map.put("list2", list2);
        map.put("set", set);


        return map;
    }
}
