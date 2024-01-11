
    public class Main {
        public static void main(String[] args) {
            Student taiwo = new Student("taiwo","112233","2");
            Student micheal = new Student("micheal","114455","4");

            taiwo.addCourse("Biology");
            taiwo.addCourse("Maths");
            taiwo.addCourse("Physics");

            taiwo.printCourses();

           // taiwo.removeCourse(1);

           // taiwo.changeCourse(0,"geology");


            taiwo.courseChecker("English");
            taiwo.printCourses();
        }
    }
