import java.util.LinkedList;

public class LList1 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
        //Nama : Alvino Albas
        saya.add("A");
        saya.add("L");
        saya.add("V");
        saya.add("I");
        saya.add("N");
        saya.add("O");
        saya.add(" ");
        saya.add("A");
        saya.add("L");
        saya.add("B");
        saya.add("A");
        saya.add("S");

        System.out.println("Nama Saya : " +saya);
        //tambah karakter
        saya.addFirst("D");
        saya.set(1, "r");
        saya.add(2, ".");
        saya.addLast("P");
        System.out.println("Nama saya setelah penambahan karakter : " +saya);

        //hapus karakter
        saya.remove(3);
        saya.remove(12);
        System.out.println("Nama saya setelah menghapus element : " +saya);

        //fungsi push
        saya.push("adalah");
        saya.push("Pintar");
        saya.push("dan");
        saya.push("Baik");
        System.out.println("Nama Setelah melakukan fungsi push : " +saya);

        //fungsi pop
        saya.pop();
        saya.pop();
        saya.pop();
        saya.pop();
        System.out.println("Nama setelah melakukan fungsi pop : " +saya);


    }
}
