import java.awt.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.List;
import java.util.Random;

public class Main {


    public static void addNameToBestQueue(String name) {

        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        int ramdomSize1 = (int) (Math.random() * 6);
        int ramdomSize2 = (int) (Math.random() * 6);

        System.out.println(ramdomSize1);
        System.out.println(ramdomSize2);
        if (ramdomSize1 == 5 && ramdomSize2 == 5) {
            System.out.println("Позовите Галю!");
        } else {
            if (ramdomSize1 < ramdomSize2) {
                queue1.add(name);
                System.out.println(name + " добавлен в первую очередь");
            } else {
                queue2.add(name);
                System.out.println(name + " добавлен во вторую очередь");
            }
        }
    }

    private static final Random RANDOM = new Random();
    public static List<String> names = List.of("Sam", "Bill", "Jack", "Adam", "Mary", "Jane", "Ann", "Kat");

    public static void main(String[] args) {

        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);
        //  int ramdomSize1 =(int)(Math.random()*6);
        //  int ramdomSize2 =(int)(Math.random()*6);
        List<String> names = List.of("Sam", "Bill", "Jack", "Adam", "Mary", "Jane", "Ann", "Kat");

        randomAdd(queue1);
        randomAdd(queue2);
        addRandomNameToBestQueue(queue1, queue2);
        addRandomNameToBestQueue(queue1, queue2);
        addRandomNameToBestQueue(queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);
        deleteFromRandomQueue(queue1, queue2);
        deleteFromRandomQueue(queue1, queue2);
        deleteFromRandomQueue(queue1, queue2);
        System.out.println(queue1);
        System.out.println(queue2);

    }

    public static void randomAdd(Queue queue) {
        int ramdomSize = RANDOM.nextInt(5) + 1;
        for (int i = 0; i < ramdomSize; i++) {
            int index = RANDOM.nextInt(names.size());
            String randomName = names.get(index);
            queue.add(randomName);
        }
        System.out.println("Очередь " + queue + " длиной " + ramdomSize);
    }

    public static void addRandomNameToBestQueue(Queue queue1, Queue queue2) {
        if (queue1.size() == 5 && queue2.size() == 5) {
            System.out.println("Позовите Галю!");
        } else {
            if (queue1.size() < queue2.size()) {
                int index = RANDOM.nextInt(names.size());
                String randomName = names.get(index);
                queue1.add(randomName);
                System.out.println(randomName + " добавлен в первую очередь");
            } else {
                int index = RANDOM.nextInt(names.size());
                String randomName = names.get(index);
                queue2.add(randomName);
                System.out.println(randomName + " добавлен во вторую очередь");
            }
        }
    }

    public static void deleteFromRandomQueue(Queue queue1, Queue queue2)
    { if (Math.random() < 0.5 && !queue1.isEmpty()) {

        System.out.println("Удалили " + queue1.poll() + " из первой очереди");
    } else if (!queue2.isEmpty()) {

        System.out.println("Удалили " + queue2.poll() + " из второй очереди");
    } else System.out.println("Обе очереди пустые");
    }


}