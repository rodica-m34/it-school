package com.itschool.session22.homework.ex13;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StoringObjects <T>{
    private final HashMap<T, Integer> hashMap = new HashMap<>();
    private T object;

   public void addElements (T object){
       this.object = object;
       if (hashMap.containsKey(object)){
            hashMap.put(object, hashMap.get(object)+1);
       }
        else {
            hashMap.put(object, 1);
        }
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        StoringObjects<?> that = (StoringObjects<?>) o;
        return Objects.equals(object, that.object);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(object);
    }

    public void viewStoredObjects (){
        for (Map.Entry<T, Integer> entry : hashMap.entrySet()){
            System.out.print(entry.getKey() + " ");
            System.out.println("->" + entry.getValue());
        }
    }
}
