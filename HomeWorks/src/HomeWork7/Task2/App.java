package HomeWork7.Task2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class App {
        private static final Set<Method> methods = new HashSet<>();
        private static final Set<Field> fields = new HashSet<>();
        private static final Set<Method> declaredMethods = new HashSet<>();
        private static final Set<Field> declaredFields = new HashSet<>();
        private static final Class<User> userClass = User.class;
        private static final Class<? super User> personClass = userClass.getSuperclass();
        private static final User user = new User();

        public static void main(String[] args) {

            try {
                methods.add(userClass.getMethod("getLogin"));
                addToSet(methods, userClass.getMethods());
                addToSet(fields, userClass.getFields());

                declaredMethods.add(userClass.getDeclaredMethod("getLogin"));
                declaredFields.add(userClass.getDeclaredField("login"));

                addToSet(declaredMethods, userClass.getDeclaredMethods(), personClass.getDeclaredMethods());
                addToSet(declaredFields, userClass.getDeclaredFields(), personClass.getDeclaredFields());

                setFields();

                printSets();

                System.out.println("Values of fields:");
                printFields();

                userClass.getDeclaredMethod("printUserInfo").invoke(user);

            } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | InvocationTargetException ex) {
                ex.printStackTrace();
            }

        }

        @SuppressWarnings("unchecked")
        private static <T> void addToSet(Set<T> set, T[]... arrays) {
            for (T[] array : arrays) {
                for (T t : array) {
                    set.add(t);
                }
            }
        }

        private static <T> void printSet(Set<T> set) {
            for (T t : set) {
                System.out.println(t);
            }
        }

        private static <T> void setField(Field f, T t) throws IllegalAccessException {
            f.setAccessible(true);
            f.set(user, t);
        }

        private static void printFields() throws IllegalAccessException {
            for (Field field : declaredFields) {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(user));
            }
        }

        private static void setFields() throws IllegalAccessException, NoSuchFieldException {
            setField(userClass.getDeclaredField("login"), "Admin");
            setField(userClass.getDeclaredField("password"), "password");
            setField(userClass.getDeclaredField("email"), "qqwewfr@gmail.com");
            setField(personClass.getDeclaredField("firstName"), "user");
            setField(personClass.getDeclaredField("lastName"), "user");
            setField(personClass.getDeclaredField("age"), 1030);
            setField(personClass.getDeclaredField("dateOfBirth"), LocalDate.of(993, 5, 17));
        }

        private static void printSets() {
            System.out.println("Methods:");
            printSet(methods);

            System.out.println("Fields:");
            printSet(fields);

            System.out.println("Declared methods:");
            printSet(declaredMethods);

            System.out.println("Declared fields:");
            printSet(declaredFields);
        }
}
