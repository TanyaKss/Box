public class Run {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setObj("Котики");
        box.getObj();
        box.delObj();
        box.getObj();

        System.out.println();
        Box<Integer> boxInt = new Box<>();
        boxInt.delObj();
        boxInt.setObj(2);
        boxInt.getObj();

    }
}
