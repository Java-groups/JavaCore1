package HW7;


    public class Student extends Person implements Cloneable {
        private int course;

        public Student(FullName fullName, int age, int course) {
            super(fullName, age);
            this.course = course;
        }

        @Override
        public String info() {
            return super.info() + ", course - " + course;
        }

        @Override
        public String activity() {
            return "I study at the university";
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        @Override

            protected Object clone () throws CloneNotSupportedException {
                return super.clone();
            }
        }
