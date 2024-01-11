import java.util.ArrayList;
import java.util.List;

    public class Student {
        private String name;
        private String matricNumber;
        private String level;

        private List<String> courses;

        public Student(String name, String matricNumber, String level) {
            this.name = name;
            this.matricNumber = matricNumber;
            this.level = level;
            this.courses = new ArrayList<>();
        }

        public void addCourse(String course){
            courses.add(course);
        }

        public void levelChange(String level){
            this.level=level;
        }

        public void removeCourse(int index){
            courses.remove(index);
            System.out.println(courses);
        }

        public void printCourses() {
            for (String i : courses) {
                System.out.println(i);
            }
        }
           public void changeCourse(int index,String newCourse){
                courses.set(index,newCourse);
               System.out.println(courses);
            }


            public void courseChecker(String myCourse){

            if (courses.contains(myCourse)){
                    System.out.println("Registered");
                }
                else{
                courses.add(myCourse);
                System.out.println("Newly Registered");
            }
            }








    }





