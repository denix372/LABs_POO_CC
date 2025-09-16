package Lab8.Problema2;

import java.util.*;

public class Catalog extends TreeSet<Catalog.Student> {

    public Catalog(Comparator<Student> comparator) {
        super(comparator);
    }

    public Catalog() {
        super();
    }

    public static class Student implements Comparable<Student> {
        String name;
        double media;
        int clazz;

        public Student(String name, double media, int clazz) {
            this.name = name;
            this.media = media;
            this.clazz = clazz;
        }

        @Override
        public int compareTo(Student other) {
            int r = Double.compare(this.media, other.media);
            if(r == 0)
                r = this.name.compareTo(other.name);
            return r;
        }

        @Override
        public String toString() {
            return name + " (media: " + media + ", grupa: " + clazz + ")";
        }

        @Override
        public boolean equals(Object obj) {
            if(!(obj instanceof Student))
                return false;
            Student other = (Student) obj;
            return Objects.equals(this.name, other.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public void addStudent(String name, double media, int clazz) {
        this.add(new Student(name, media, clazz));
    }

    public Student getStudent(String name) {
        for (Student s : this)
            if (s.name.equals(name))
                return s;
        return null;
    }

    public void removeStudent(String name) {
        Student toRemove = getStudent(name);
        if(toRemove != null)
            this.remove(toRemove);
    }

    public Catalog byClass(int clazz) {
        Catalog result = new Catalog(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        for (Student s : this)
            if (s.clazz == clazz)
                result.add(s);

        return result;
    }
}
