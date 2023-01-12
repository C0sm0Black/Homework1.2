public class Homework {

    public static void main(String[] args) {

        var timeWork = 640;
        var timeWorksman = 8;

        System.out.println("Всего работников в компании — " + (timeWork / timeWorksman) + " человек");
        System.out.println("Если в компании работает " + ((timeWork / timeWorksman) + 94) + " человек, то всего " + (((timeWork / timeWorksman) + 94) * 8) + " часов работы может быть поделено между сотрудниками");

    }

}
