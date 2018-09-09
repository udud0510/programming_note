package baekjun;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Sort
{
    public static void main (String[] args) throws java.lang.Exception
    {
        List<Student> list = new ArrayList<Student>();
        
        list.add(new Student("a", 5));
        list.add(new Student("b", 10));
        list.add(new Student("c", 1));
        list.add(new Student("d", 52));
        list.add(new Student("e", 23));
        
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getScore() < s2.getScore()) {
                    return -1;
                } else if (s1.getScore() > s2.getScore()) {
                    return 1;
                }
                return 0;
            }
        });
 
        
        for (Student s : list) {
            System.out.println(s.getScore());
        }
    }
}
 
class Student {
    String name;
    int score;
    
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
}



