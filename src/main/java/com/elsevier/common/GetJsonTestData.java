package com.elsevier.common;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class GetJsonTestData {
public static List<Map<String,String>> getDataList (String jsonString, String testCaseName){

    List<Map<String,String>> dataList = new ArrayList<>();


    JSONObject obj = new JSONObject(jsonString.toString());

    JSONArray dataArray = obj.getJSONArray(testCaseName);
    for(int i=0;i<dataArray.length();i++){
        Map<String, String> parseData = new HashMap<String, String>();
        // JSONObject testObject = obj;
        JSONObject testObject = dataArray.getJSONObject(i);
        System.out.println("testObject"+testObject);
        Iterator iter = testObject.keys();
        while(iter.hasNext()){
            String key = (String)iter.next();
            System.out.println(key);
            String value = testObject.get(key).toString();
            parseData.put(key,value);
            dataList.add(parseData);
        }

    }
    System.out.println(dataList);
    return dataList;
}

    public static Map<String, String> getData(String jsonString, String testCaseName){
        Map<String, String> parseData = new HashMap<String, String>();
       JSONObject obj = new JSONObject(jsonString.toString());

       JSONArray dataArray = obj.getJSONArray(testCaseName);
       for(int i=0;i<dataArray.length();i++){

           // JSONObject testObject = obj;
       JSONObject testObject = dataArray.getJSONObject(i);

            Iterator iter = testObject.keys();
            while(iter.hasNext()){
                String key = (String)iter.next();
                System.out.println(key);
                String value = testObject.get(key).toString();
                parseData.put(key,value);
            }

       }
        System.out.println(parseData);
        return parseData;
    }

    public static void main(String args[]){
        String testData = "{\n" +
                "\t\"TC01\": [{\n" +
                "\t\t\"carid\": 3456789\n" +
                "\t}],\n" +
                "\t\"TC02\": [{\n" +
                "\t\t\"carid\": 3456789\n" +
                "\t}]\n" +
                "}";
        Map<String, String> parseData  = getData(testData,"TC01");
    }
}
