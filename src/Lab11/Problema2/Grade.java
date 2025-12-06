package Lab11.Problema2;

public class Grade implements Comparable<Grade> {
    private Double partialScore, examScore;
    private Student student;
    private String course;

    public Grade(String course, Student student) {
        this(course, student, 0.0, 0.0);
    }

    public Grade(String course, Student student, Double partialScore, Double examScore) {
        this.partialScore = partialScore;
        this.examScore = examScore;
        this.course = course;
        this.student = student;
    }

    public void setPartialScore(Double score) { partialScore = score; }
    public void setExamScore(Double score) { examScore = score; }

    public Double getPartialScore() { return partialScore; }
    public Double getExamScore() { return examScore; }
    public Double getTotal() { return partialScore + examScore; }
    public Student getStudent() { return student; }
    public String getCourse() { return course; }

    @Override
    public int compareTo(Grade o) {
        return Double.compare(this.getTotal(), o.getTotal());
    }

    @Override
    public String toString() {
        return student + " [partial=" + partialScore + ", exam=" + examScore + "]";
    }
}
