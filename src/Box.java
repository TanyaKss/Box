public class Box<T> {
    private T obj;

    public void setObj(T obj) {
        if (obj != null) {
            this.obj = obj;
            System.out.println("Мы положили в коробочку: " + obj);
        } else {
            System.out.println("В коробочке уже занято все место!");
        }
    }

    public T getObj() {
        if (obj == null) {
            System.out.println("В коробочке ничего нет!");
        } else {
            System.out.println("В коробочке - " + obj);
        }
        return obj;
    }

    public void delObj() {
        if (obj != null) {
            this.obj = null;
            System.out.println("Мы обнулили коробочку");
        } else {
            System.out.println("В коробочке пусто!");
        }
    }
}
