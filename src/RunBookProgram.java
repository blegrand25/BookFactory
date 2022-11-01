public class RunBookProgram {
    public static void main(String[] args) {
        RunBookProgram runRobot = new RunBookProgram();
    }

    public RunBookProgram() {
        Book ludwig;
        ludwig = new Book('s', 200, 10, 180, "square");
        ludwig.printInfo();

        Book jerry;
        jerry = new Book('l', 30, 255, 120, "triangle");
        jerry.printInfo();
    }
}
