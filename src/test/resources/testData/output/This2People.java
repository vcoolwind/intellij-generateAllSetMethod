package testdata;

public class This2People {

    class People {

        private String name;
        private Integer age;
        private String address;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

    }

    class Student {

        private String name;
        private Integer age;
        private int grade;

        public Student(String name, Integer age, int grade) {
            this.name = name;
            this.age = age;
            this.grade = grade;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public People toPeople() {
            People people = new People();
            people.setAddress();
            people.setName(this.getName());
            people.setAge(this.getAge());
            return people;

        }
    }
}
