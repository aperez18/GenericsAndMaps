package common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Labs {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Perez","Andrew","111-11-1111");
        Employee e2 = new Employee(2, "Malasuk","Joss","666-66-6666");
        Employee e3 = new Employee(3, "Malasuk","Joss","666-66-6666");
        Employee e4 = new Employee(4, "Lombardo","Jim","999-99-9999");
        
        Map<String, Employee> emps = new HashMap<String, Employee>();
        emps.put("111-11-1111", e1);
        emps.put("666-66-6666", e2);
        emps.put("666-66-6666", e3);
        emps.put("999-99-9999", e4);
        
        Set<String> keys = emps.keySet();
        for(String key : keys){
            System.out.println(emps.get(key));
        }
        
        System.out.println("\n"+emps.get("666-66-6666"));
    }
}
