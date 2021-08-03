package hw1;

public class Human implements  Competitable {
    private int jumpHeight;
    private int runLenght;

        public Human(int jumpHeight, int runLenght) {
            this.jumpHeight = jumpHeight;
            this.runLenght = runLenght;
        }

    @Override
    public void jump(int height) {
        if (height > jumpHeight) {
            System.out.println("Я человек, я не смог перепрыгнуть");
        } else {
            System.out.println("Я человек, я смог перепрыгнуть");
        }
    }


    @Override
    public void run(int length) {
        if (length > runLenght) {
            System.out.println("Я человек, я не смог пробежать");
        } else {
            System.out.println("Я человек, я смог пробежать");
        }
    }
}