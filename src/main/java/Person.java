import lombok.Data;

/**
 * @ClassName Person
 * @Description TODO
 * @Author laishaopeng_zz
 * @Date 2022/8/2 15:51
 **/
@Data
public class Person {
    @ChangeValue("小明1")
    private String name;
}
