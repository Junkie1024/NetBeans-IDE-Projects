package javaapplication3;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JavaApplication3 {

    public static void main(String[] args) throws IOException {

        int[] id = {10, 20, 30, 40, 50};
        String[] names = {"Zied", "Sosti", "Boudimai", "Jean", "Alsi"};
        double[] salary = {1000, 2000, 3000, 4000, 5000};

        JSONArray mainArray = new JSONArray();
        JSONObject Obj = new JSONObject();

        for (int i = 0; i < id.length; i++) {
            Obj.accumulate("id", id[i]);
            Obj.accumulate("name", names[i]);
            Obj.accumulate("salary", salary[i]);
            mainArray.add(Obj);
            Obj.clear();
        }
        System.out.println(mainArray);
        FileWriter.saveStringIntoFile("json/employee.json", mainArray.toString());
    }
}
