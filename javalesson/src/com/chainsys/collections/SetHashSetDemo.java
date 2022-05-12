package com.chainsys.collections;

import java.util.HashSet;
import java.util.Iterator;

import com.chainsys.classandmethods.Employee;





public class SetHashSetDemo {
    public static void main(String[]args)
    {
        demoA();
        demoB();
    }
    public static void demoA()
    {
        HashSet<String>string_hs = new HashSet<String>();
        string_hs.add("Bee");
        string_hs.add("Apple");
        string_hs.add("Doll");
        string_hs.add(null);
        string_hs.add("Egg");
        string_hs.add("Cinema");
        string_hs.add("Fan");
        System.out.println("Size : "+string_hs.size());
        string_hs.add("Fan");        //Ignore
        string_hs.add(null);        //Ignore
        System.out.println("Size : "+string_hs.size());
        
        Iterator <String>set_itr=string_hs.iterator();
        while(set_itr.hasNext())
        {
            System.out.println(set_itr.next()+"-");
        }
    }
    public static void demoB()
    {
        HashSet<Employee> hs=new HashSet<Employee>();
        Employee e1=null;
        for(int i=0;i<10;i++)
        {
            e1=new Employee(i); // e1=new Employee(); mc
            e1.getEmpId();
            e1.name="Employee "+i;
            hs.add(e1);
        }
        System.out.println("Count "+hs.size());
        e1=new Employee(0);
        hs.add(e1);
        System.out.println("Count "+hs.size());
        Iterator<Employee>itr=hs.iterator();
        while(itr.hasNext())
        {
            Employee e2=itr.next();
            System.out.println(e2.getEmpId()+""+e2.name);
        }
    }
    }
