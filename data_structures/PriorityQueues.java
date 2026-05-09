import java.time.LocalDate;
import java.util.*;

/**
 * PriorityQueue - min-heap by default (smallest element at the head)
 * 1.  add(element)
 * 2.  offer(element)
 * 3.  remove()
 * 4.  poll()
 * 5.  peek()
 * 6.  element()
 * 7.  contains(element)
 * 8.  size()
 * 9.  isEmpty()
 * 10. iterator()
 * 11. toArray()
 * 12. clear()
 * 13. addAll(collection)
 * 14. remove(element)
 */
public class PriorityQueues {
    static Map<Integer, List<String>> conditionMap = new HashMap<>();

    static {
        conditionMap.put(1, new ArrayList<>(Arrays.asList("broken arm", "heart attack", "stroke", "cancer", "severe bleeding")));
        conditionMap.put(2, new ArrayList<>(Arrays.asList("allergic reaction", "severe mental disorder")));
        conditionMap.put(3, new ArrayList<>(Arrays.asList("severe tooth pain", "severe stomach pain")));
        conditionMap.put(4, new ArrayList<>(Arrays.asList("typhoid", "pneumonia")));
        conditionMap.put(5, new ArrayList<>(Arrays.asList("fever", "headache")));
    }

    static int getUrgencyLevel(String condition) {
        for (Map.Entry<Integer, List<String>> entry : conditionMap.entrySet()) {
            for (String s : entry.getValue()) {
                if (s.equalsIgnoreCase(condition)) {
                    return entry.getKey();
                }
            }
        }
        return 5;
    }

    static class Patient {
        String name;
        LocalDate dob;
        String condition;
        int urgencyLevel;

        Patient(String name, LocalDate dob, String condition) {
            this.name = name;
            this.dob = dob;
            this.condition = condition;
            this.urgencyLevel = getUrgencyLevel(condition);
        }

        public String toString() {
            return "Patient Name: " + name + " \n" +
                    "DOB: " + dob + "\n" +
                    "Urgency Level: " + urgencyLevel + "\n" +
                    "Condition details: " + condition;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> nextUrgentPatient = new PriorityQueue<>(Comparator.comparingInt(p -> p.urgencyLevel));

        // 1. add
        nextUrgentPatient.add(new Patient("Sujon", LocalDate.of(1988, 10, 10), "fever"));
        nextUrgentPatient.add(new Patient("Maria",   LocalDate.of(1985, 3, 22),  "heart attack"));
        nextUrgentPatient.add(new Patient("James",   LocalDate.of(2001, 7, 14),  "typhoid"));
        nextUrgentPatient.add(new Patient("Ayesha",  LocalDate.of(1990, 1, 5),   "allergic reaction"));


        // 2. offer(element)
        Patient rakib = new Patient("Rakib", LocalDate.of(1998, 6, 6), "stomach ach");
        boolean offerNewPatient = nextUrgentPatient.offer(rakib);
        System.out.println("Patient " + rakib.name + " accepted (true / false) -> " + offerNewPatient);
        System.out.println(nextUrgentPatient.peek());

        //
        System.out.println("--- Treating patients in priority order ---\n");
        while(!nextUrgentPatient.isEmpty()){
            System.out.println(nextUrgentPatient.poll());
            System.out.println("-------------------------------------");
        }

    }
}