import java.lang.reflect.Field;

public class ValidateUser {

    public static void validate(User user){
        Field[] fields = User.class.getDeclaredFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(Validation.class)){
                Validation validation = field.getAnnotation(Validation.class);
                if(field.getName().equals("name")){

                    if((!user.getName().contains(validation.value()))){
                        System.out.println("Name doesn't contains the specific value.");
                    }
                }
                if(field.getName().equals("age")){
                    if(!(user.getAge() <= validation.max() && user.getAge() >= validation.min())){
                        System.out.println("Age exceed the range.");
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        User sun = new User("sun",16);
        User syssun = new User("sys.sun", 16);
        User sys = new User("sys", 22);
        validate(sun);
        validate(syssun);
        validate(sys);
    }
}
