package Lab8.Problema2;


import java.util.Comparator;
import java.util.TreeSet;

public class Catalog extends TreeSet<Catalog.Student> {

    public class Student implements Comparable<Student>{
        String name;
        double media;
        int clazz;

        public Student(String name, double media, int clazz) {
            this.name = name;
            this.media = media;
            this.clazz = clazz;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getMedia() {
            return media;
        }

        public void setMedia(double media) {
            this.media = media;
        }

        public int getClazz() {
            return clazz;
        }

        public void setClazz(int clazz) {
            this.clazz = clazz;
        }

        @Override
        public int compareTo(Student s) {
            if(media != s.getMedia())
                return Double.compare(media, s.getMedia());
            return name.compareTo(s.getName());
        }

        @Override
        public String toString() {
            return "Nume: " + name + ", media: " + media + ", class: " + clazz + "\n";
        }
    }

    public Catalog (Comparator comparator ) {
        super(comparator);
    }
    public Catalog ( ) {
        super();
    }

    public void addStudent(String name, double media, int clazz) {
        this.add(new Student(name, media, clazz));
    }
    public Student getStudent ( String name) {
        for(Student s : this)
            if (s.getName().equals(name))
                return s;
        return null;
    }

    public void removeStudent ( String name) {
        Student to = getStudent(name);
        if(to != null)
            this.remove(to);
    }

    public Catalog byClass (int clazz ) {
        Catalog result = new Catalog(new Comparator<Student>() {
           @Override
           public int compare(Student s1, Student s2) {
               return s1.getName().compareTo(s2.getName());
           }
        });

        for (Student s : this)
            if (s.getClazz() == clazz)
                result.add(s);
        return result;
    }

    public int size() {
        return super.size();
    }
}
