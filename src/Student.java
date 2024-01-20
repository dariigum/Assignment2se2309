class Student extends Person {
    private double gpa;
    private static final double Stipend_amount = 36660.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        return (gpa > 2.67) ? Stipend_amount : 0.0;
    }

    @Override
    public String toString() {
        return String.format("%s earns %.2f tenge", super.toString(), getPaymentAmount());
    }
}
