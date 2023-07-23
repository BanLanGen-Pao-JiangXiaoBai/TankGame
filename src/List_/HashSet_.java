package List_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 12; i++) {
            hashMap.put(new A(i), i);
        }

    }
}

class A {
    int i;

    public A(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
