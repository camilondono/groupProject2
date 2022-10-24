package taskTwoMarks;

 abstract class Marks{
        abstract double getPercentage();
    }

    //class A
    class A extends Marks{
        private double sub1, sub2, sub3;

        public A(double s1, double s2, double s3) {
            sub1 = s1;
            sub2 = s2;
            sub3 = s3;
        }
        double getPercentage() {
            return (sub1 + sub2 + sub3)/300.0 * 100;
        }
    }

    //class B
    class B extends Marks{
        private double sub1, sub2, sub3, sub4;

        public B(double s1, double s2, double s3, double s4) {
            sub1 = s1;
            sub2 = s2;
            sub3 = s3;
            sub4 = s4;
        }
        double getPercentage() {
            return (sub1 + sub2 + sub3 +sub4)/400.0 * 100;
        }
    }

    //class with main method
    class Main{
        public static void main(String[] args){

            A a = new A(90, 69, 78);
            B b = new B(74, 88, 66, 92);

            double p1 = a.getPercentage();
            double p2 = b.getPercentage();

            System.out.println("Percentage of student A : " + p1);
            System.out.println("Percentage of student B : " + p2);
        }

}
