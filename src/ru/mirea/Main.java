package ru.mirea;

import java.io.File;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] g={"java","lesson","17"};
        Integer [] b={-10,-5,-7};
        Collection f= new Collection();
        f.addArray(g);
        f.addArray(b);
        f.add(3.0);
        f.getList();
        System.out.println(f);
        System.out.println(f.get(3));
        System.out.println(f.get(10));

        System.out.println(Solution.createArrayList(g));
        System.out.println(Solution.createHashList(g));
        System.out.println(Solution.createHashMap(g,b));
       // f.addArray(new File());
    }
}
