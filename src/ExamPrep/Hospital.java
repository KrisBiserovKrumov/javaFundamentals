package ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;


public class Hospital {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, LinkedHashMap<Integer, ArrayList<String>>> hospital = new HashMap<>();
        HashMap<String,ArrayList<String>> doctorPatients = new HashMap<>();

        String line = reader.readLine();

        int room = 1;
        int beds = 0;
        while (!line.equals("Output")){
            String[] token = line.split(" ");
                String department = token[0];
                String doctor = token[1] + " " + token[2];
                String patient = token[3];
                if (!hospital.containsKey(department)){
                    if (beds==60){
                        break;
                    }
                    hospital.put(department,new LinkedHashMap<>());
                    hospital.get(department).put(room,new ArrayList<>());
                    hospital.get(department).get(room).add(patient);
                    beds++;
                }else {
                    if (hospital.get(department).get(room).size() == 3){
                        room++;
                    }
                    if (beds == 60){
                      break;
                    }
                    hospital.get(department).get(room).add(patient);
                    beds++;
                }
                if (!doctorPatients.containsKey(doctor)){
                    doctorPatients.put(doctor,new ArrayList<>());
                    doctorPatients.get(doctor).add(patient);
                }else {
                    doctorPatients.get(doctor).add(patient);
                }
                line = reader.readLine();
        }
        line = reader.readLine();
        while (!line.equals("End")){
            if (line.split(" ").length == 1){
                for (String department : hospital.keySet()) {
                    if (department.equals(line)){
                        for (String patient : hospital.get(department).get(room)) {
                            System.out.println(patient);
                        }
                    }
                }
            }else {
                boolean isDoctor = false;
                for (String doctor : doctorPatients.keySet()) {
                    if (doctor.equals(line)){
                        doctorPatients.get(doctor).sort(String::compareTo);
                        doctorPatients.get(doctor).forEach(System.out::println);
                        isDoctor = true;
                    }
                }
                if (!isDoctor){
                    String[] comand = line.split(" ");
                    String department = comand[0];
                    int clas = Integer.parseInt(comand[1]);
                    for (String departmentTrue : hospital.keySet()) {
                        if (departmentTrue.equals(department)){
                            hospital.get(departmentTrue).get(clas).sort(String::compareTo);
                            for (String patient : hospital.get(departmentTrue).get(clas)) {
                                System.out.println(patient);
                            }
                        }
                    }

                }


            }
            line = reader.readLine();
        }

    }
}
