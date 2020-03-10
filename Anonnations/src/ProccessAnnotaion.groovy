import java.lang.reflect.Field
import java.lang.reflect.Method

public class ProccessAnnotaion {
    private void predictObject(Object object) throws Exception
    {
        Class<?> isClass= object.getClass();
        for (Method method: isClass.getDeclaredMethods())
        {
            if(method.isAnnotationPresent(Redict.class))
            {
                method.setAccessible(true);
                method.invoke(object);
            }
        }
    }
    private void CheckEntity(Object object) throws Exception{
        if(Objects.isNull(object))
        {
            throw new Exception("Null object. Please check");
        }
        Class<?> isClass =object.getClass();
        if(!isClass.isAnnotationPresent(Entity.class))
        {
            throw new Exception("The class is not Entity");
        }

    }
    public String parsetoJson(Object object) throws Exception{
        Class<?> isClass =object.getClass();
        Map<String,String> jsonMap = new HashMap<>();
        try {
            CheckEntity(object);
            predictObject(object);
            for (Field field : isClass.getDeclaredFields())
            {
                field.setAccessible(true);
                if (field.isAnnotationPresent(Column.class))
                {
                    jsonMap.put(field.getAnnotation(Column.class).name(),field.get(object).toString());

                }
            }
            String jsonString = jsonMap.entrySet().stream()
                    .map(entry -> "\"" + entry.getKey().toString() + "\":\""
                            + entry.getValue().toString() + ",\"")
            jsonMap.each { entry -> println "$entry.key : $entry.value, " }

            return "{" + jsonString + "}";
        }
        catch (Exception e)
        {
            throw e;
        }
    }
}
